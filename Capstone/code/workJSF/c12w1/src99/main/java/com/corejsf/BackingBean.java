package com.corejsf;

import java.util.HashMap;
import java.util.Map;

public class BackingBean {
   private String country = "USA";
   private String state = "";
   private static Map states;

   // PROPERTY: country
   public String getCountry() { return country; }
   public void setCountry(String newValue) { country = newValue; }

   // PROPERTY: state
   public String getState() { return state; }
   public void setState(String newValue) { state = newValue; }

   public Map getStates() { return states; }

   public String[] getStatesForCountry() { return (String[]) states.get(country); }

   static {
      states = new HashMap();
      states.put("USA", 
         new String[] {
            "Alabama", "Alaska", "Arizona", "Arkansas", "California", 
            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", 
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", 
            "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", 
            "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", 
            "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", 
            "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", 
            "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", 
            "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", 
            "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
         });

      states.put("Canada", 
         new String[] { 
            "Alberta", "British Columbia", "Manitoba", "New Brunswick", 
            "Newfoundland and Labrador", "Northwest Territories", 
            "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", 
            "Quebec", "Saskatchewan", "Yukon"
         });
   }
}
