package com.corejsf.j2me;


public class InputTag extends J2meComponentTag {   
   public String getComponentType() { return "javax.faces.Input"; }  
   public String getRendererType() { return "com.corejsf.j2me.Text"; } 
}
