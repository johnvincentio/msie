package com.corejsf;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.ConverterException;
import javax.faces.render.Renderer;

public class JSSpinnerRenderer extends Renderer {
   private static final String MORE = ".more";
   private static final String LESS = ".less";

   public Object getConvertedValue(FacesContext context, UIComponent component,
         Object submittedValue) throws ConverterException {
      return com.corejsf.util.Renderers.getConvertedValue(context, component,
         submittedValue);
   }
   
   public void encodeBegin(FacesContext context, UIComponent component) 
         throws IOException {
      ResponseWriter writer = context.getResponseWriter();
      String clientId = component.getClientId(context);
      String formId = com.corejsf.util.Renderers.getFormId(context, component);
           
      UIInput spinner = (UIInput)component;
      Integer min = (Integer) component.getAttributes().get("minimum");
      Integer max = (Integer) component.getAttributes().get("maximum");
      Integer size = (Integer) component.getAttributes().get("size");
     
      writer.write(MessageFormat.format(
         "<input type=\"text\" name=\"{0}\" value=\"{1}\"",
         new Object[] { clientId, spinner.getValue().toString() } ));
      
      if (size != null) 
         writer.write(MessageFormat.format(
            " size=\"{0}\"", new Object[] { size } ));
      writer.write(MessageFormat.format("/>"
         + "<script language=\"JavaScript\">"
         + "document.forms[''{0}''][''{1}''].spin = function (increment) '{'"
         + "var v = parseInt(this.value) + increment;"
         + "if (isNaN(v)) return;"
         + "if (\"min\" in this && v < this.min) return;"
         + "if (\"max\" in this && v > this.max) return;"
         + "this.value = v;"
         + "};",
         new Object[] { formId, clientId } ));

      if (min != null) {
         writer.write(MessageFormat.format(
            "document.forms[''{0}''][''{1}''].min = {2};",
            new Object[] { formId, clientId, min }));
      }
      if (max != null) {
         writer.write(MessageFormat.format(
            "document.forms[''{0}''][''{1}''].max = {2};",
            new Object[] { formId, clientId, max }));
      }
      writer.write(MessageFormat.format(
         "</script>"
         + "<input type=\"button\" value=\"<\""
         + "onclick=\"document.forms[''{0}''][''{1}''].spin(-1); }\"/>"
         + "<input type=\"button\" value=\">\""
         + "onclick=\"document.forms[''{0}''][''{1}''].spin(1); }\"/>",
         new Object[] { formId, clientId }));
   }
   
   public void decode(FacesContext context, UIComponent component) {
      EditableValueHolder spinner = (EditableValueHolder) component;
      Map requestMap = context.getExternalContext().getRequestParameterMap();
      String clientId = component.getClientId(context);

      int increment;
      if (requestMap.containsKey(clientId + MORE)) increment = 1;
      else if (requestMap.containsKey(clientId + LESS)) increment = -1;
      else increment = 0;

      try {
         int submittedValue 
            = Integer.parseInt((String) requestMap.get(clientId));

         int newValue = getIncrementedValue(component, submittedValue, 
            increment);
         spinner.setSubmittedValue("" + newValue);
         spinner.setValid(true);
      }
      catch(NumberFormatException ex) {
         // let the converter take care of bad input, but we still have 
         // to set the submitted value, or the converter won't have 
         // any input to deal with
         spinner.setSubmittedValue((String) requestMap.get(clientId));
      }
   }

   private void encodeDecrementButton(UIComponent spinner, 
         ResponseWriter writer, String clientId) throws IOException {
      writer.startElement("input", spinner);
      writer.writeAttribute("type", "submit", null);
      writer.writeAttribute("name", clientId + LESS, null);
      writer.writeAttribute("value", "<", "value");
      writer.endElement("input");
   }
   
   private void encodeIncrementButton(UIComponent spinner, 
         ResponseWriter writer, String clientId) throws IOException {
      writer.startElement("input", spinner);
      writer.writeAttribute("type", "submit", null);
      writer.writeAttribute("name", clientId + MORE, null);
      writer.writeAttribute("value", ">", "value");
      writer.endElement("input");
   }
   
   private int getIncrementedValue(UIComponent spinner, int submittedValue,
         int increment) {
      Integer minimum = (Integer) spinner.getAttributes().get("minimum");
      Integer maximum = (Integer) spinner.getAttributes().get("maximum");
      int newValue = submittedValue + increment;

      if ((minimum == null || newValue >= minimum.intValue()) &&
         (maximum == null || newValue <= maximum.intValue()))
         return newValue;
      else
         return submittedValue;
   }
}
