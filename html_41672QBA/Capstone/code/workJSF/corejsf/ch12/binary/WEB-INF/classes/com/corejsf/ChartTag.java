package com.corejsf;

import javax.faces.component.*;
import javax.faces.webapp.*;
import java.util.*;

public class ChartTag extends UIComponentTag {
   private String width;
   private String height;
   private String title;
   private String names;
   private String values;
   
   private Map props = new HashMap();
   
   public void setWidth(String newValue) { width = newValue; }
   public void setHeight(String newValue) { height = newValue; }
   public void setTitle(String newValue) { title = newValue; }
   public void setNames(String newValue) { names = newValue; }
   public void setValues(String newValue) { values = newValue; }
   
   public void setProperties(UIComponent component) { 
      super.setProperties(component); 
      if (component == null) return;
      com.corejsf.util.Tags.setString(component, "width", width);
      com.corejsf.util.Tags.setString(component, "height", height);
      com.corejsf.util.Tags.setString(component, "title", title);
      com.corejsf.util.Tags.setString(component, "names", names);
      com.corejsf.util.Tags.setString(component, "values", values);
   }
   
   public void release() {
      super.release();
      width = null;
      height = null;
      title = null;
      names = null;
      values = null;
   }   
   
   public String getRendererType() { return "com.corejsf.Chart"; } 
   public String getComponentType() { return "com.corejsf.Chart"; }  
}
