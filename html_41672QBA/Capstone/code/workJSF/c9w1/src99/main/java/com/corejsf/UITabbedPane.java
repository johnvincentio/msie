package com.corejsf;

import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;

public class UITabbedPane extends UICommand {
   private String content;
   
   public String getContent() { return content; }
   public void setContent(String newValue) { content = newValue; }
   
   public Object saveState(FacesContext context) {
      Object values[] = new Object[2];
      values[0] = super.saveState(context);
      values[1] = content;
      return values;
  }

  public void restoreState(FacesContext context, Object state) {
      Object values[] = (Object[]) state;
      super.restoreState(context, values[0]);
      content = (String) values[1];
  }
}
