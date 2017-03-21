package com.corejsf;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentBodyTag;

// This tag supports the following attributes
//
// binding (supported by UIComponentBodyTag)
// id (supported by UIComponentBodyTag)
// rendered (supported by UIComponentBodyTag)
// style
// styleClass
// tabClass
// selectedTabClass
// resourceBundle
// actionListener

public class TabbedPaneTag extends UIComponentBodyTag {
   private String style, styleClass, tabClass, selectedTabClass,
         resourceBundle, actionListener;

   public String getRendererType() {
      return "com.corejsf.TabbedPane";
   }
   public String getComponentType() {
      return "com.corejsf.TabbedPane";
   }

   public void setTabClass(String newValue) { tabClass = newValue; }    
   public void setSelectedTabClass(String newValue) {
      selectedTabClass = newValue;
   }
   public void setStyle(String newValue) { style = newValue; }
   public void setStyleClass(String newValue) {
      styleClass = newValue;
   }
   public void setResourceBundle(String newValue) {
      resourceBundle = newValue;
   }
   public void setActionListener(String newValue) {
      actionListener = newValue;
   }

   protected void setProperties(UIComponent component) {
      // make sure you always call the superclass
      super.setProperties(component);

      com.corejsf.util.Tags.setString(component, "style", style);
      com.corejsf.util.Tags.setString(component, "styleClass",
            styleClass);
      com.corejsf.util.Tags.setString(component, "tabClass",
            tabClass);
      com.corejsf.util.Tags.setString(component,
            "selectedTabClass", selectedTabClass);
      com.corejsf.util.Tags.setString(component, "resourceBundle",
            resourceBundle);
      com.corejsf.util.Tags.setActionListener(component, actionListener);            
   }

   public void release() {
      // always call the superclass method
      super.release();

      style = null;
      styleClass = null;
      tabClass = null;
      selectedTabClass = null;
      resourceBundle = null;
      actionListener = null;
   }
}