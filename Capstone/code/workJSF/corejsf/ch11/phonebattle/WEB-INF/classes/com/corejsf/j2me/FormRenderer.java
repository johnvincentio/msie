package com.corejsf.j2me;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

public class FormRenderer extends Renderer {
   public void encodeBegin(FacesContext context, 
      UIComponent component) throws IOException {
      ResponseWriter writer = context.getResponseWriter();
      writer.write("form=" + component.getId() + "\n");

      Iterator ids = context.getClientIdsWithMessages();
      while (ids.hasNext()) {      
         String id = (String) ids.next();
         Iterator messages = context.getMessages(id);
         String msg = null;
         while (messages.hasNext()) {
            FacesMessage m = (FacesMessage) messages.next();
            if (msg == null) msg = m.getSummary();
            else msg = msg + "," + m.getSummary();
         }
         if (msg != null) {
            writer.write("messages");
            if (id != null) writer.write("." + id);
            writer.write("=" + URLEncoder.encode(msg, "UTF8") + "\n");
         }
      }
   }
   
   public void decode(FacesContext context, UIComponent component) {
      Map map = context.getExternalContext().getRequestParameterMap();
      ((UIForm)component).setSubmitted(
         component.getId().equals(map.get("form")));
   }
}