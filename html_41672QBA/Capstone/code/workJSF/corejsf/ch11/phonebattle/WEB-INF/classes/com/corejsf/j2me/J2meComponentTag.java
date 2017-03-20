package com.corejsf.j2me;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public abstract class J2meComponentTag extends UIComponentTag {   
   private String value;
   private String action;
   private String validator;

   // PROPERTY: value
   public void setValue(String newValue) { value = newValue; }

   // PROPERTY: action
   public void setAction(String newValue) { action = newValue; }

   // PROPERTY: validator
   public void setValidator(String newValue) { validator = newValue; }

   public void setProperties(UIComponent component) { 
      super.setProperties(component); 
      com.corejsf.util.Tags.setString(component, "value", value);
      com.corejsf.util.Tags.setAction(component, action);
      com.corejsf.util.Tags.setValidator(component, validator);
   } 

   public void release() {
      value = null;
      validator = null;
      action = null;
   }
}
