package com.corejsf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import javax.faces.FacesException;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.el.ValueBinding;
import javax.faces.render.Renderer;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;

public class UploadRenderer extends Renderer {
   public void encodeBegin(FacesContext context, UIComponent component)  
      throws IOException {
      if (!component.isRendered()) return;
      ResponseWriter writer = context.getResponseWriter();

      String clientId = component.getClientId(context);
      
      writer.startElement("input", component);
      writer.writeAttribute("type", "file", "type");
      writer.writeAttribute("name", clientId, "clientId");
      writer.endElement("input");
      writer.flush();
   }

   public void decode(FacesContext context, UIComponent component) {
      ExternalContext external = context.getExternalContext(); 
      HttpServletRequest request = (HttpServletRequest) external.getRequest();
      String clientId = component.getClientId(context);
      FileItem item = (FileItem) request.getAttribute(clientId);

      Object newValue;
      ValueBinding binding = component.getValueBinding("value");
      if (binding != null) {
         if (binding.getType(context) == byte[].class) {
            newValue = item.get();
         }
         if (binding.getType(context) == InputStream.class) {
            try {
               newValue = item.getInputStream();
            } catch (IOException ex) {
               throw new FacesException(ex);
            }
         }
         else {
            String encoding = request.getCharacterEncoding();
            if (encoding != null)
               try {
                  newValue = item.getString(encoding);
               } catch (UnsupportedEncodingException ex) {
                  newValue = item.getString(); 
               }
            else 
               newValue = item.getString(); 
         }
         ((EditableValueHolder) component).setSubmittedValue(newValue);      
      }

      Object target;
      binding = component.getValueBinding("target");
      if (binding != null) target = binding.getValue(context);
      else target = component.getAttributes().get("target");
         
      if (target != null) {
         File file;
         if (target instanceof File)
            file = (File) target;
         else {
            ServletContext servletContext 
               = (ServletContext) external.getContext();
            file = new File(servletContext.getRealPath("/"), 
               target.toString());
         }

         try { // ugh--write is declared with "throws Exception"
            item.write(file);
         } catch (Exception ex) { 
            throw new FacesException(ex);
         }
      }
   }   
}
