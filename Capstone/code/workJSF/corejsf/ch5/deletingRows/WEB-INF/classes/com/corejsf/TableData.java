package com.corejsf;

import javax.faces.model.DataModel;
import javax.faces.model.ArrayDataModel;

public class TableData {
   private boolean editable = false;
   private ArrayDataModel model = null;

   private static final Name[] names = {
      new Name("Anna", "Keeney"),
      new Name("John", "Wilson"),
      new Name("Mariko", "Randor"),
      new Name("William", "Dupont"),
   };

   public TableData() { model = new ArrayDataModel(names); }

   public DataModel getNames() { return model; }

   public boolean isEditable() { return editable; }
   public void setEditable(boolean newValue) { editable = newValue; }

   public String deleteNames() {
      if (!getAnyNamesMarkedForDeletion())
         return null;

      Name[] currentNames = (Name[]) model.getWrappedData();
      Name[] newNames = new Name[currentNames.length 
         - getNumberOfNamesMarkedForDeletion()];

      for(int i = 0, j = 0; i < currentNames.length; ++i) {
         Name name = (Name) currentNames[i];
         if (!name.isMarkedForDeletion()) {
            newNames[j++] = name;
         }
      }
      model.setWrappedData(newNames);
      return null;
   }
   
   public int getNumberOfNamesMarkedForDeletion() {
      Name[] currentNames = (Name[]) model.getWrappedData();
      int cnt = 0;

      for(int i = 0; i < currentNames.length; ++i) {
         Name name = (Name) currentNames[i];
         if (name.isMarkedForDeletion())
            ++cnt;
      }
      return cnt;
   }
   
   public boolean getAnyNamesMarkedForDeletion() {
      Name[] currentNames = (Name[]) model.getWrappedData();
      for(int i = 0; i < currentNames.length; ++i) {
         Name name = (Name) currentNames[i];
         if (name.isMarkedForDeletion())
            return true;
      }
      return false;
   }
}
