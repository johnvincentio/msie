package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public class ValidatorScriptTag extends UIComponentTag { 
   private String functionName;
   
   // PROPERTY: functionName
   public void setFunctionName(String newValue) { functionName = newValue; }

   public void setProperties(UIComponent component) { 
      super.setProperties(component); 

      if(component.getAttributes().get("functionName") == null) 
         component.getAttributes().put("functionName", functionName); 
   } 

   public void release() {
      functionName = null;
   }

   public String getRendererType() { return null; } 
   public String getComponentType() { return "com.corejsf.ValidatorScript"; }  
}
