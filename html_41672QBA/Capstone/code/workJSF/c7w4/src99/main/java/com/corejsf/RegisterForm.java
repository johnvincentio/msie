package com.corejsf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class RegisterForm {
   private String streetAddress;
   private String city;
   private String state;
   private String country;

   private static final String US = "United States";
   private static final String CANADA = "Canada";
   private static final String[] COUNTRY_NAMES = { US, CANADA };
   private static ArrayList countryItems = null;

   // PROPERTY: countryNames
   public Collection getCountryNames() {
      if(countryItems == null) {
         countryItems = new ArrayList();
         for (int i = 0; i < COUNTRY_NAMES.length; ++i) {
            countryItems.add(new SelectItem(COUNTRY_NAMES[i]));
         }
      }
      return countryItems;
   }

   // PROPERTY: streetAddress
   public void setStreetAddress(String newValue) { streetAddress = newValue; }
   public String getStreetAddress() { return streetAddress; }

   // PROPERTY: city
   public void setCity(String newValue) { city = newValue; }
   public String getCity() { return city; }

   // PROPERTY: state
   public void setState(String newValue) { state = newValue; }
   public String getState() { return state; }

   // PROPERTY: country
   public void setCountry(String newValue) { country = newValue; }
   public String getCountry()              { return country; }

   public void countryChanged(ValueChangeEvent event) {
      FacesContext context = FacesContext.getCurrentInstance();

      if(US.equals((String) event.getNewValue()))
         context.getViewRoot().setLocale(Locale.US);   
      else
         context.getViewRoot().setLocale(Locale.CANADA);   
   }
}
