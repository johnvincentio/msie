package com.corejsf;

import java.io.IOException;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.ValueHolder;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionEvent;
import javax.faces.render.Renderer;

public class BattleMapRenderer extends Renderer {
   public void encodeBegin(FacesContext context, UIComponent component)
      throws IOException {
      ResponseWriter writer = context.getResponseWriter();
      String id = component.getId();
      Object value = ((ValueHolder) component).getValue();
      BattleGround ground = (BattleGround) value;
      writer.write(id + "=");

      boolean own = ((Boolean) 
         component.getAttributes().get("own")).booleanValue();
      /*
        0 = water, not hit, or unknown if not owner
        1 = ship, not hit
        2 = water, hit
        3 = ship, hit
      */
      for (int i = 0; i < ground.getRows(); i++) {
         if (i > 0) writer.write("+");
         for (int j = 0; j < ground.getColumns(); j++) {
            int v = ground.getValueAt(i, j);
            boolean hit = (v & BattleGround.HIT) != 0;
            if (own || hit) {
                  writer.write('0' + v);
            } else 
               writer.write('0');
         }
      }
   }

   public void decode(FacesContext context, UIComponent component) {
      if (context == null || component == null) return;

      UIInput input = (UIInput) component;
      String id = input.getId();
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

