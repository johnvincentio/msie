package com.corejsf;

import javax.faces.model.DataModel;
import javax.faces.model.ArrayDataModel;

public class TableData {
   private DataModel filterModel = null;
   private static final Name[] names = {
      new Name("Anna", "Keeney"),
      new Name("John", "Wilson"),
      new Name("Mariko", "Randor"),
      new Name("William", "Dupont"),
   };

   public TableData() {
      ArrayDataModel model = new ArrayDataModel(names);
      filterModel = new SortFilterModel(model);
   }
   public DataModel getNames() {
      return filterModel;
   }
}
