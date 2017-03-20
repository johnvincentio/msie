package com.corejsf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.el.ValueBinding;
import javax.faces.render.Renderer;

public class PagerRenderer extends Renderer {
   public void encodeBegin(FacesContext context, UIComponent component) 
      throws IOException {   
      String id = component.getClientId(context);
      UIComponent parent = component;
      while (!(parent instanceof UIForm)) parent = parent.getParent();
      String formId = parent.getClientId(context);

      ResponseWriter writer = context.getResponseWriter();    

      String styleClass = (String) get(context, component, "styleClass");
      String selectedStyleClass = (String) get(context, component, 
            "selectedStyleClass");
      String dataTableId = (String) get(context, component, "dataTableId");
      Integer a = (Integer) get(context, component, "showpages");
      int showpages = a == null ? 0 : a.intValue();      

      // find the component with the given ID

      UIData data = (UIData) findComponent(context.getViewRoot(), 
         getId(dataTableId, id), context);

      int first = data.getFirst();
      int itemcount = data.getRowCount();
      int pagesize = data.getRows(); 
      if (pagesize <= 0) pagesize = itemcount;

      int pages = itemcount / pagesize;
      if (itemcount % pagesize != 0) pages++;

      int currentPage = first / pagesize;
      if (first >= itemcount - pagesize) currentPage = pages - 1;
      int startPage = 0;
      int endPage = pages;
      if (showpages > 0) { 
         startPage = (currentPage / showpages) * showpages;
         endPage = Math.min(startPage + showpages, pages);
      }

      if (currentPage > 0)
         writeLink(writer, component, formId, id, "<", styleClass);
      
      if (startPage > 0)  
         writeLink(writer, component, formId, id, "<<", styleClass);

      for (int i = startPage; i < endPage; i++) {
         writeLink(writer, component, formId, id, "" + (i + 1), 
            i == currentPage ? selectedStyleClass : styleClass);
      }

      if (endPage < pages) 
         writeLink(writer, component, formId, id, ">>", styleClass);

      if (first < itemcount - pagesize)
         writeLink(writer, component, formId, id, ">", styleClass);

      // hidden field to hold result
      writeHiddenField(writer, component, id);
   }
   
   private void writeLink(ResponseWriter writer, UIComponent component, 
      String formId, String id, String value, String styleClass) 
      throws IOException {
      writer.writeText(" ", null);
      writer.startElement("a", component);
      writer.writeAttribute("href", "#", null);
      writer.writeAttribute("onclick", onclickCode(formId, id, value), null);
      if (styleClass != null) 
         writer.writeAttribute("class", styleClass, "styleClass");
      writer.writeText(value, null);
      writer.endElement("a");
   }

   private String onclickCode(String formId, String id, String value) {
      StringBuffer buffer = new StringBuffer();
      buffer.append("document.forms[");
      buffer.append("'");
      buffer.append(formId);
      buffer.append("'");
      buffer.append("]['");
      buffer.append(id);
      buffer.append("'].value='");
      buffer.append(value);
      buffer.append("';");
      buffer.append(" document.forms[");
      buffer.append("'");
      buffer.append(formId);
      buffer.append("'");
      buffer.append("].submit()");
      buffer.append("; return false;");
      return buffer.toString();
   }

   private void writeHiddenField(ResponseWriter writer, UIComponent component, 
      String id) throws IOException {
      writer.startElement("input", component);
      writer.writeAttribute("type", "hidden", null);
      writer.writeAttribute("name", id, null);
      writer.endElement("input");
   }

   public void decode(FacesContext context, UIComponent component) {
      String id = component.getClientId(context);
      Map parameters = context.getExternalContext()
         .getRequestParameterMap();
      String response = (String) parameters.get(id);

      String dataTableId = (String) get(context, component, "dataTableId");
      Integer a = (Integer) get(context, component, "showpages");
      int showpages = a == null ? 0 : a.intValue();      

      UIData data = (UIData) findComponent(context.getViewRoot(), 
         getId(dataTableId, id), context);

      int first = data.getFirst();
      int itemcount = data.getRowCount();
      int pagesize = data.getRows(); 
      if (pagesize <= 0) pagesize = itemcount;

      if (response.equals("<")) first -= pagesize;
      else if (response.equals(">")) first += pagesize;
      else if (response.equals("<<")) first -= pagesize * showpages;
      else if (response.equals(">>")) first += pagesize * showpages;
      else {
         int page = Integer.parseInt(response);
         first = (page - 1) * pagesize;
      }
      if (first + pagesize > itemcount) first = itemcount - pagesize; 
      if (first < 0) first = 0;
      data.setFirst(first);
   }

   private static Object get(FacesContext context, UIComponent component, 
      String name) {
      ValueBinding binding = component.getValueBinding(name);
      if (binding != null) return binding.getValue(context);
      else return component.getAttributes().get(name);         
   }

   private static UIComponent findComponent(UIComponent component, String id, 
      FacesContext context) {
      String componentId = component.getClientId(context);
      if (componentId.equals(id)) return component;
      Iterator kids = component.getChildren().iterator();
      while (kids.hasNext()) {
         UIComponent kid = (UIComponent) kids.next();
         UIComponent found = findComponent(kid, id, context);
         if (found != null) return found;
      }
      return null;
   }

   private static String getId(String id, String baseId) {
      String separator = "" + NamingContainer.SEPARATOR_CHAR;
      String[] idSplit = id.split(separator);
      String[] baseIdSplit = baseId.split(separator);
      StringBuffer buffer = new StringBuffer();
      for (int i = 0; i < baseIdSplit.length - idSplit.length; i++) {
         buffer.append(baseIdSplit[i]);
         buffer.append(separator);
      }
      buffer.append(id);
      return buffer.toString();
   }
}
