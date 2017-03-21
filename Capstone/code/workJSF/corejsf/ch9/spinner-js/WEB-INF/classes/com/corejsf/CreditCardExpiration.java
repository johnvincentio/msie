package com.corejsf;

import javax.faces.event.ValueChangeEvent;

public class CreditCardExpiration {
   private int month = 1;
   private int year = 2000;
   private int changes = 0; 
      // to demonstrate the value change listener

   // PROPERTY: month
   public int getMonth() { return month; }
   public void setMonth(int newValue) { month = newValue; }

   // PROPERTY: year
   public int getYear() { return year; }
   public void setYear(int newValue) { year = newValue; }

   // PROPERTY: changes
   public int getChanges() { return changes; }
   
   public void changeListener(ValueChangeEvent e) {
      changes++;
   }
}
