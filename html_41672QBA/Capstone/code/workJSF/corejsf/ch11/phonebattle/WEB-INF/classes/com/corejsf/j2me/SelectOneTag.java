package com.corejsf.j2me;


public class SelectOneTag extends J2meComponentTag {   
   public String getComponentType() { return "javax.faces.SelectOne"; }  
   public String getRendererType() { return "com.corejsf.j2me.Choice"; } 
}
