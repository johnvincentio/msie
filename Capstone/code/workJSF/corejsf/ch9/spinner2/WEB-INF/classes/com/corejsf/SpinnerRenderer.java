package com.corejsf;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.ConverterException;
import javax.faces.render.Renderer;

public class SpinnerRenderer extends Renderer {
   private static final String MORE = ".more";
   private static final String LESS = ".less";

   public Object getConvertedValue(FacesContext context, UIComponent component,
         Object submittedValue) throws ConverterException {
      return com.corejsf.util.Renderers.getConvertedValue(context, component,
         submittedValue);
   }
   
   public void encodeBegin(FacesContext context, UIComponent spinner) 
         throws IOException {
      ResponseWriter writer = context.getResponseWriter();
      String clientId = spinner.getClientId(context);

      encodeInputField(spinner, writer, clientId);
      encodeDecrementButton(spinner, writer, clientId);
      encodeIncrementButton(spinner, writer, clientId);
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
   
   private void encodeInputField(UIComponent spinner, ResponseWriter writer, 
         String clientId) throws IOException {
      writer.startElement("input", spinner);
      writer.writeAttribute("name", clientId, "clientId");

      Object v = ((UIInput)spinner).getValue();
      if(v != null)
         writer.writeAttribute("value", v.toString(), "value");

      Integer size = (Integer)spinner.getAttributes().get("size");
      if(size != null)
         writer.writeAttribute("size", size, "size");

      writer.endElement("input");
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
