package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;

public class PagerTag extends UIComponentTag {
   private String showpages;
   private String dataTableId;
   private String styleClass;
   private String selectedStyleClass; 
   
   public void setShowpages(String newValue) { showpages = newValue; }
   public void setDataTableId(String newValue) { dataTableId = newValue; }  
   public void setStyleClass(String newValue) { styleClass = newValue; }
   public void setSelectedStyleClass(String newValue) { 
      selectedStyleClass = newValue; 
   }
   
   public void setProperties(UIComponent component) { 
      super.setProperties(component); 
      if (component == null) return;
      com.corejsf.util.Tags.setInteger(component, "showpages", showpages);
      com.corejsf.util.Tags.setString(component, "dataTableId", 
            dataTableId);
      com.corejsf.util.Tags.setString(component, "styleClass", 
            styleClass);
      com.corejsf.util.Tags.setString(component, "selectedStyleClass", 
            selectedStyleClass);
   }
   
   public void release() {
      super.release();
      showpages = null;
      dataTableId = null;
      styleClass = null;
      selectedStyleClass = null;
   }   
      
   public String getRendererType() { return "com.corejsf.Pager"; } 
   public String getComponentType() { return "javax.faces.Output"; } 
}
