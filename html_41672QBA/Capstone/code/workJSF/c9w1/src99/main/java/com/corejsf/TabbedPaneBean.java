package com.corejsf;

import javax.faces.model.SelectItem;

public class TabbedPaneBean {
   private static final SelectItem[] tabs = {
      new SelectItem("/blackBears.jsp",   "blackTabText"),
      new SelectItem("/grizzlyBears.jsp", "grizzlyTabText"),
      new SelectItem("/polarBears.jsp",   "polarTabText"),
      new SelectItem("/pandaBears.jsp",   "pandaTabText"),
      new SelectItem("/teddyBears.jsp",   "teddyTabText"),
   };

   public SelectItem[] getTabs() {
      return tabs;
   }
}
