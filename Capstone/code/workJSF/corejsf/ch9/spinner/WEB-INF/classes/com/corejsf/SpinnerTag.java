package com.corejsf;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.webapp.UIComponentTag;

public class SpinnerTag extends UIComponentTag {
   private String minimum = null; 
   private String maximum = null; 
   private String size = null;
   private String value = null;
   
   public String getRendererType() { return null; }
   public String getComponentType() { return "com.corejsf.Spinner"; }

   public void setMinimum(String newValue) { minimum = newValue; }
   public void setMaximum(String newValue) { maximum = newValue; }
   public void setSize(String newValue) { size = newValue; }
   public void setValue(String newValue) { value = newValue; }

   public void setProperties(UIComponent component) {
      // always call the superclass method
      super.setProperties(component);
      
      setInteger(component, "size", size);
      setInteger(component, "minimum", minimum);
      setInteger(component, "maximum", maximum);
      setString(component, "value", value);
   }
   
   public void setInteger(UIComponent component, 
         String attributeName, String attributeValue) {
      if (attributeValue == null) return;
      if (isValueReference(attributeValue))
         setValueBinding(component, attributeName, attributeValue);
      else 
         component.getAttributes().put(attributeName, 
               new Integer(attributeValue));
   }

   public void setString(UIComponent component, 
         String attributeName, String attributeValue) {
      if (attributeValue == null) return;
      if (isValueReference(attributeValue))
         setValueBinding(component, attributeName, attributeValue);
      else 
         component.getAttributes().put(attributeName, attributeValue);
   }

   public void setValueBinding(UIComponent component, 
         String attributeName, String attributeValue) {
      FacesContext context = FacesContext.getCurrentInstance();
      Application app = context.getApplication();
      ValueBinding vb = app.createValueBinding(attributeValue);
      component.setValueBinding(attributeName, vb);      
   }
   
   public void release() {
      // always call the superclass method
      super.release();

      minimum = null;
      maximum = null;
      size = null;
      value = null;
   }
}