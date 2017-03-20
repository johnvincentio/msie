package com.corejsf.validator;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.apache.commons.validator.ValidatorAction;

public class UIValidatorScript extends UIComponentBase {
   private Map validators = new TreeMap();   
   // a map whose keys are validator type names and whose
   // values are maps from IDs to CommonsValidator objects

   public String getRendererType() { return null; }
   public String getFamily() { return null; }

   private void addValidator(String type, String id, CommonsValidator v) {
      Map map = (Map) validators.get(type);
      if (map == null) {
         map = new TreeMap();
         validators.put(type, map);
      }
      if (id != null) map.put(id, v);
   }

   private void findCommonsValidators(UIComponent c, FacesContext context) {
      if (c instanceof EditableValueHolder) {
         EditableValueHolder h = (EditableValueHolder) c;
         javax.faces.validator.Validator[] vs = h.getValidators();
         for (int i = 0; i < vs.length; i++) {
            if (vs[i] instanceof CommonsValidator) {
               CommonsValidator v = (CommonsValidator) vs[i];
               if (!Boolean.FALSE.equals(v.getClient())) {
                  String id = c.getClientId(context);
                  addValidator(v.getType(), id, v);
                  ValidatorAction action = v.getValidatorAction();
                  Iterator iter = action.getDependencies().iterator();
                  while (iter.hasNext()) {
                     String type = (String) iter.next();
                     addValidator(type, id, v);
                  }
               }
            }
         }
      }

      List children = c.getChildren();
      for (int i = 0; i < children.size(); i++) {
         UIComponent child = (UIComponent) children.get(i);
         findCommonsValidators(child, context);
      }      
   }

   private void writeScriptStart(ResponseWriter writer) throws IOException {
      writer.startElement("script", this);
      writer.writeAttribute("type", "text/javascript", null);
      writer.writeAttribute("language", "Javascript1.1", null);
      writer.write("\n<!--\n");
    }

   private void writeScriptEnd(ResponseWriter writer) throws IOException {
      writer.write("\n-->\n");
      writer.endElement("script");
   }

   private static String getJavaScriptFunctionName(ValidatorAction action) {
      StringTokenizer tokenizer = new StringTokenizer(
         action.getJavascript(),
         " \n\r\t(");
      tokenizer.nextToken(); // function
      return tokenizer.nextToken();
   }

   private void writeValidationFunctions(ResponseWriter writer, 
      FacesContext context) throws IOException {
      writer.write("var bCancel = false;\n");
      writer.write("function " );
      writer.write(getAttributes().get("functionName").toString());
      writer.write("(form) { return bCancel || true\n");
      // for each validator type, write "&& fun(form);

      Iterator iter = validators.keySet().iterator();
      while (iter.hasNext()) {
         String type = (String) iter.next();
         ValidatorAction a = CommonsValidator.getValidatorAction(type);
         writer.write("&& ");
         writer.write(getJavaScriptFunctionName(a));
         writer.write("(form)\n");
      }
      writer.write(";}\n");

      // for each validator type, write callback
      iter = validators.keySet().iterator();
      while (iter.hasNext()) {
         String type = (String) iter.next();
         ValidatorAction a = CommonsValidator.getValidatorAction(type);
         writer.write("function " );
         String callback = a.getJsFunctionName();
         if (callback == null) callback = type;
         writer.write(callback);
         writer.write("() { \n");
         // for each field validated by this type, add configuration object
         Map map = (Map) validators.get(type);
         Iterator iter2 = map.keySet().iterator();
         int k = 0;
         while (iter2.hasNext()) {
            String id = (String) iter2.next();
            CommonsValidator v = (CommonsValidator) map.get(id);
            writer.write("this[" + k + "] = ");
            k++;
            writeJavaScriptParams(writer, context, id, v);
            writer.write(";\n");
         }
         writer.write("}\n");         
      }

      // for each validator type, write code

      // Must always include integer and required because
      // they contain shared helper functions      
      addValidator("integer", null, null);
      addValidator("required", null, null);

      iter = validators.keySet().iterator();
      while (iter.hasNext()) {
         String type = (String) iter.next();
         ValidatorAction a = CommonsValidator.getValidatorAction(type);
         writer.write(a.getJavascript());
         writer.write("\n");
      }
   }

   public void writeJavaScriptParams(ResponseWriter writer, 
      FacesContext context, String id, CommonsValidator v) throws IOException {
      writer.write("new Array(\"");
      writer.write(id);
      writer.write("\", \"");
      writer.write(v.getErrorMessage(v.getArg(), context));
      writer.write("\", new Function(\"x\", \"return {");
      
      String[] names = v.getParamNames();
      Object[] params = v.getParams();

      for (int i = 0; i < names.length; i++) {
         if (i > 0) writer.write(",");
         writer.write(names[i]);
         writer.write(":");
         // Ugh...mask validator doesn't construct RegExp
         if (names[i].equals("mask"))
            writer.write("/"); else writer.write("'");
         writer.write(params[i].toString());
         if (names[i].equals("mask")) 
            writer.write("/"); else writer.write("'");
      }
      writer.write("}[x];\"))");
   }

   public void encodeBegin(FacesContext context) throws IOException {   
      String id = getClientId(context);
      ResponseWriter writer = context.getResponseWriter();    

      validators.clear();
      findCommonsValidators(context.getViewRoot(), context);

      writeScriptStart(writer);
      writeValidationFunctions(writer, context);
      writeScriptEnd(writer);
   }   
}
