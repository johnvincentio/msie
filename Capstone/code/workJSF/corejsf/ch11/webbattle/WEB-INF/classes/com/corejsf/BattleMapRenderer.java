package com.corejsf;

import java.io.IOException;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionEvent;
import javax.faces.render.Renderer;

public class BattleMapRenderer extends Renderer {
   public void encodeBegin(FacesContext context, UIComponent component)
      throws IOException {
      ResponseWriter writer = context.getResponseWriter();
      String id = component.getClientId(context);
      UIInput input = (UIInput) component;
      Object value = input.getValue();
      BattleGround ground = (BattleGround) value;
      boolean own = ((Boolean) component.getAttributes().get("own")).booleanValue();
      boolean buttons = ((Boolean) component.getAttributes().get("buttons")).booleanValue();
      writer.write("<table border=\"1\">\n");
      for (int i = 0; i <= ground.getRows(); i++) {
         writer.write("<tr>\n");
         if (i == 0) {
            for (int j = 0; j <= ground.getColumns(); j++) {
               writer.write("<td>");
               if (j == 0) writer.write("&nbsp;");
               else writer.write("" + j);
               writer.write("</td>\n");
            }
         }
         else 
            for (int j = 0; j <= ground.getColumns(); j++) {
               if (j == 0) {
                  writer.write("<td>");
                  writer.write('A' + i - 1);
               }
               else {
                  int val = ground.getValueAt(i - 1, j - 1);
                  boolean hit = (val & BattleGround.HIT) != 0;
                  boolean occ = (val & BattleGround.OCCUPIED) != 0;
                  if (buttons && (own && !occ || !own && !hit)) {
                     writer.write("<td><input type=\"radio\" name=\"");
                     writer.write(id);
                     writer.write("\" value=\"");
                     writer.write('A' + i - 1);
                     writer.write("" + j + "\">");
                  } else {
                     String color;
                     if (own || hit) 
                        color = occ ? "gray" : "blue";
                     else
                        color = "white";
                     writer.write("<td bgcolor=\"" + color + "\">");
                     writer.write("&nbsp;");
                     writer.write(hit ? "X" : "&nbsp;");
                     writer.write("&nbsp;");
                  }
               }
               writer.write("</td>\n");
            }
         writer.write("</tr>\n");
      }
      writer.write("</table>\n");
   }

   public void decode(FacesContext context, UIComponent component) {
      UIInput input = (UIInput) component;
      String id = input.getClientId(context);
      Object value = input.getValue();
      BattleGround ground = (BattleGround) value;

      // if we don't do the following, then the local value is null
      input.setValue(value);

      Map parameters 
         = context.getExternalContext().getRequestParameterMap();
      String coords = (String) parameters.get(id);
      if (coords == null) return;      

      try {
         ground.setCurrent(coords);
         input.queueEvent(new ActionEvent(input));
      } catch (Exception ex) {
         input.setValid(false);
         context.addMessage(id, 
            new FacesMessage(FacesMessage.SEVERITY_ERROR,
               "Invalid position", 
               "The boat position that you specified is invalid"));   
      }
   }
}
