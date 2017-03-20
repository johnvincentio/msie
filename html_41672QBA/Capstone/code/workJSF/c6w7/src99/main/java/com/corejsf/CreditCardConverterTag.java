package com.corejsf;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.webapp.ConverterTag;
import javax.faces.webapp.UIComponentTag;
import javax.servlet.jsp.JspException;

public class CreditCardConverterTag extends ConverterTag {
   private String separator;

   public CreditCardConverterTag() {
      setConverterId("com.corejsf.CreditCard");
   }

   // PROPERTY: separator
   public void setSeparator(String newValue) { 
      separator = newValue; 
   } 

   public Converter createConverter() throws JspException {
      CreditCardConverter converter = 
         (CreditCardConverter) super.createConverter();

      converter.setSeparator(eval(separator));

      return converter;
   }

   public void release() {
      separator = null;
   }
   
   public static String eval(String expression) {
      if (expression != null && UIComponentTag.isValueReference(expression)) {
         FacesContext context = FacesContext.getCurrentInstance();
         Application app = context.getApplication();
         return "" + app.createValueBinding(expression).getValue(context);
      }
      else return expression;      
   }   
}
