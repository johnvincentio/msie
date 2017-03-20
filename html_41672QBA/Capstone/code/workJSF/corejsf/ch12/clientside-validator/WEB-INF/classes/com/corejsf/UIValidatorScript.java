package com.corejsf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.validator.Validator;

public class UIValidatorScript extends UIComponentBase {
   private Map validators = new TreeMap();   
   // a map from IDs to CreditCardValidator objects

   public String getRendererType() { return null; }
   public String getFamily() { return null; }

   private void findCreditCardValidators(UIComponent c, FacesContext context) {
      if (c instanceof EditableValueHolder) {
         EditableValueHolder h = (EditableValueHolder) c;
         Validator[] vs = h.getValidators();
         for (int i = 0; i < vs.length; i++) {
            if (vs[i] instanceof CreditCardValidator) {
               CreditCardValidator v = (CreditCardValidator) vs[i];
               String id = c.getClientId(context);
               validators.put(id, v);
            }
         }
      }

      List children = c.getChildren();
      for (int i = 0; i < children.size(); i++) {
         UIComponent child = (UIComponent) children.get(i);
         findCreditCardValidators(child, context);
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

   private void writeValidationFunctions(ResponseWriter writer, 
      FacesContext context) throws IOException {
      writer.write("var bCancel = false;\n");
      writer.write("function " );
      writer.write(getAttributes().get("functionName").toString());
      writer.write("(form) { return bCancel || validateCreditCard(form); }\n");

      writer.write("function creditCard() { \n");
      // for each field validated by this type, add configuration object
      Iterator iter = validators.keySet().iterator();
      int k = 0;
      while (iter.hasNext()) {
         String id = (String) iter.next();
         CreditCardValidator v = (CreditCardValidator) validators.get(id);
         writer.write("this[" + k + "] = ");
         k++;

         writer.write("new Array('");
         writer.write(id);
         writer.write("', '");
         writer.write(v.getErrorMessage(v.getArg(), context));
         writer.write("');\n");;
      }
      writer.write("}\n");         
   }

   public void encodeBegin(FacesContext context) throws IOException {   
      String id = getClientId(context);
      ResponseWriter writer = context.getResponseWriter();    

      validators.clear();
      findCreditCardValidators(context.getViewRoot(), context);

      writeScriptStart(writer);
      writeValidationFunctions(writer, context);
      writeScriptEnd(writer);
   }   
}
