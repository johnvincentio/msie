package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public class SpinnerTag extends UIComponentTag {
   private String minimum = null; 
   private String maximum = null; 
   private String size = null;
   private String value = null;
   private String valueChangeListener = null;

   public String getRendererType() { return "com.corejsf.Spinner"; }
   public String getComponentType() { return "com.corejsf.Spinner"; }

   public void setMinimum(String newValue) { minimum = newValue; }
   public void setMaximum(String newValue) { maximum = newValue; }
   public void setSize(String newValue) { size = newValue; }
   public void setValue(String newValue) { value = newValue; }
   public void setValueChangeListener(String newValue)  { 
      valueChangeListener = newValue; 
   }

   public void setProperties(UIComponent component) {
      // always call the superclass method
      super.setProperties(component);
      
      com.corejsf.util.Tags.setInteger(component, "size", size);
      com.corejsf.util.Tags.setInteger(component, "minimum", minimum);
      com.corejsf.util.Tags.setInteger(component, "maximum", maximum);
      com.corejsf.util.Tags.setString(component, "value", value);
      com.corejsf.util.Tags.setValueChangeListener(component, 
            valueChangeListener);
   }
   
   public void release() {
      // always call the superclass method
      super.release();

      minimum = null;
      maximum = null;
      size = null;
      value = null;
      valueChangeListener = null;
   }
}
