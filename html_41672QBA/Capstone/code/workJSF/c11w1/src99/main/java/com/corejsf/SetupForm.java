package com.corejsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectOne;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

public class SetupForm {
   private boolean horizontal = true;
   private String size = "2";
   private String position = "";
   private UISelectOne directionComponent;
   private UISelectOne sizeComponent;
   private BattleGround battleGround;

   // PROPERTY: size
   public String getSize() {
      if (battleGround.getAvailableSizes().size() > 0)
         size = ((SelectItem) 
            battleGround.getAvailableSizes().get(0)).getLabel();
      return size;
   }
   public void setSize(String newSize) { this.size = newSize; }

   // PROPERTY: horizontal
   public String getHorizontal() { return "" + horizontal; }
   public void setHorizontal(String newHorizontal) {
      this.horizontal = Boolean.valueOf(newHorizontal).booleanValue();
   }

   // PROPERTY: position
   public String getPosition() { return position; }
   public void setPosition(String newPosition) { this.position = newPosition; }

   // PROPERTY: directionComponent
   public UISelectOne getDirectionComponent() { return directionComponent; }
   public void setDirectionComponent(UISelectOne newValue) { 
      directionComponent = newValue;
   }

   // PROPERTY: sizeComponent
   public UISelectOne getSizeComponent() { return sizeComponent; }
   public void setSizeComponent(UISelectOne newValue) { 
      sizeComponent = newValue;
   }

   // PROPERTY: battleGround
   public void setBattleGround(BattleGround newBattleGround) {
      this.battleGround = newBattleGround;
   }   

   public void validate(FacesContext context, UIInput input) {
      String dval = (String) directionComponent.getValue();
      boolean horiz = Boolean.valueOf(dval).booleanValue();
      
      String sval = (String) sizeComponent.getValue();
      int sz = Integer.parseInt(sval);
      if(!battleGround.boatFits(sz, horiz)) {
         input.setValid(false);      
         context.addMessage(input.getId(), 
            new FacesMessage(FacesMessage.SEVERITY_ERROR, 
               "Boat doesn't fit", 
               "The boat that you specified doesn't fit"));
      }      
   }

   public String submitAction() {
      battleGround.addBoat(Integer.parseInt(size), horizontal);
      if (battleGround.getAvailableSizes().size() == 0)
         return "turn";
      SelectItem item 
         = (SelectItem) battleGround.getAvailableSizes().get(0);
      size = item.getLabel();
      return "setup";
   }         
}
