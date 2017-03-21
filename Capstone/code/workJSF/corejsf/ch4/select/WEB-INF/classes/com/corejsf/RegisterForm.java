package com.corejsf;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.model.SelectItem;

public class RegisterForm {
   private String name;
   private boolean contactMe;
   private Integer[] bestDaysToContact;
   private Integer yearOfBirth;
   private String[] colors = null;
   private String[] languages = null;
   private int education;

   // PROPERTY: name
   public String getName() {
      return name;
   }
   public void setName(String newValue) {
      name = newValue;
   }

   // PROPERTY: contactMe
   public boolean getContactMe() {
      return contactMe;
   }
   public void setContactMe(boolean newValue) {
      contactMe = newValue;
   }

   // PROPERTY: bestDaysToContact
   public Integer[] getBestDaysToContact() {
      return bestDaysToContact;
   }
   public void setBestDaysToContact(Integer[] newValue) {
      bestDaysToContact = newValue;
   }

   // PROPERTY: yearOfBirth
   public Integer getYearOfBirth() {
      return yearOfBirth;
   }
   public void setYearOfBirth(Integer newValue) {
      yearOfBirth = newValue;
   }

   // PROPERTY: colors
   public String[] getColors() {
      return colors;
   }
   public void setColors(String[] newValue) {
      colors = newValue;
   }

   // PROPERTY: languages
   public String[] getLanguages() {
      return languages;
   }
   public void setLanguages(String[] newValue) {
      languages = newValue;
   }

   // PROPERTY: education
   public int getEducation() {
      return education;
   }
   public void setEducation(int newValue) {
      education = newValue;
   }

   // PROPERTY: yearItems
   public List getYearItems() {
      return birthYears;
   }

   // PROPERTY: daysOfTheWeekItems
   public SelectItem[] getDaysOfTheWeekItems() {
      return daysOfTheWeek;
   }

   // PROPERTY: languageItems
   public SelectItem[] getLanguageItems() {
      return languageItems;
   }

   // PROPERTY: colorItems
   public SelectItem[] getColorItems() {
      return colorItems;
   }

   // PROPERTY: educationItems
   public SelectItem[] getEducationItems() {
      return educationItems;
   }

   // PROPERTY: bestDaysConcatenated
   public String getBestDaysConcatenated() {
      return concatenate(bestDaysToContact);
   }

   // PROPERTY: languagesConcatenated
   public String getLanguagesConcatenated() {
      return concatenate(languages);
   }

   // PROPERTY: colorsConcatenated
   public String getColorsConcatenated() {
      return concatenate(colors);
   }

   private static String concatenate(Object[] values) {
      if (values == null)
         return "";
      StringBuffer r = new StringBuffer();
      for (int i = 0; i < values.length; ++i) {
         if (i > 0)
            r.append(',');
         r.append(values[i].toString());
      }
      return r.toString();
   }

   private static final int HIGH_SCHOOL = 1;
   private static final int BACHELOR = 2;
   private static final int MASTER = 3;
   private static final int DOCTOR = 4;

   private static SelectItem[] colorItems = new SelectItem[]{
      new SelectItem("Red"),
      new SelectItem("Blue"),
      new SelectItem("Yellow"),
      new SelectItem("Green"),
      new SelectItem("Orange") };

   private static SelectItem[] languageItems = new SelectItem[]{
      new SelectItem("en", "English"),
      new SelectItem("fr", "French"),
      new SelectItem("it", "Italian"),
      new SelectItem("es", "Spanish"),
      new SelectItem("ru", "Russian") };

   private static SelectItem[] educationItems = new SelectItem[]{
      new SelectItem(new Integer(HIGH_SCHOOL), "High School"),
      new SelectItem(new Integer(BACHELOR), "Bachelor's"),
      new SelectItem(new Integer(MASTER), "Master's"),
      new SelectItem(new Integer(DOCTOR), "Doctorate") };

   private static List birthYears;
   private static SelectItem[] daysOfTheWeek;
   static {
      birthYears = new ArrayList();
      for (int i = 1900; i < 2000; ++i) {
         birthYears.add(new SelectItem(new Integer(i)));
      }
      
      DateFormatSymbols symbols = new DateFormatSymbols();
      String[] weekdays = symbols.getWeekdays();
      daysOfTheWeek = new SelectItem[7];
      for (int i = Calendar.SUNDAY; i <= Calendar.SATURDAY; i++) {
         daysOfTheWeek[i - 1] = new SelectItem(new Integer(i), weekdays[i]);
      }      
   }
}