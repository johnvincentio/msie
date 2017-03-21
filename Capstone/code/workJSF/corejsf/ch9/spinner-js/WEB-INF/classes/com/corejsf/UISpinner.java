package com.corejsf;

import javax.faces.component.UIInput;
import javax.faces.convert.IntegerConverter;

public class UISpinner extends UIInput {
   public UISpinner() {
      setConverter(new IntegerConverter()); 
         // to convert the submitted value
      setRendererType("com.corejsf.JSSpinner");  
         // this component has a renderer
   }
}
