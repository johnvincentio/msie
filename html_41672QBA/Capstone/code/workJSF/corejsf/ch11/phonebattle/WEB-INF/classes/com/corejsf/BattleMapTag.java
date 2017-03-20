package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public class BattleMapTag extends UIComponentTag { 
   private String own; 
   private String value;
   private String validator;
   
   // PROPERTY: own
   public void setOwn(String newValue) { own = newValue; } 

   // PROPERTY: value
   public void setValue(String newValue) { value = newValue; }

   // PROPERTY: validator
   public void setValidator(String newValue) { validator = newValue; }

   public void setProperties(UIComponent component) { 
      super.setProperties(component); 
      
      com.corejsf.util.Tags.setString(component, "value", value);
      com.corejsf.util.Tags.setBoolean(component, "own", own);
      com.corejsf.util.Tags.setValidator(component, validator);
   } 

   public void release() {
      own = null;
      value = null;
      validator = null;
   }

   public String getRendererType() { return "com.corejsf.BattleMap"; } 
   public String getComponentType() { return "com.corejsf.BattleMap"; }  
}
