package com.corejsf.validator;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public class ValidatorScriptTag extends UIComponentTag { 
   private String functionName;
   
   // PROPERTY: functionName
   public void setFunctionName(String newValue) { functionName = newValue; }

   public void setProperties(UIComponent component) { 
      super.setProperties(component); 

      com.corejsf.util.Tags.setString(component, "functionName",
         functionName);
   } 

   public void release() {
      functionName = null;
   }

   public String getRendererType() { return null; } 
   public String getComponentType() { 
      return "com.corejsf.validator.ValidatorScript"; 
   }  
}
