package com.corejsf;

public class Name
{
   private String first;
   private String middle;
   private String last;

   public Name() { first = ""; middle = ""; last = ""; }

   public String getFirst() { return first; }
   public void setFirst(String newValue) { first = newValue; }

   public String getMiddle() { return middle; }
   public void setMiddle(String newValue) { middle = newValue; }

   public String getLast() { return last; }
   public void setLast(String newValue) { last = newValue; }

   public void parse(String fullName) {      
      int firstSpace = fullName.indexOf(' ');
      int lastSpace = fullName.lastIndexOf(' ');
      if (firstSpace == -1) {
         first = ""; 
         middle = "";
         last = fullName;
      }
      else {
         first = fullName.substring(0, firstSpace);
         if (firstSpace < lastSpace) 
            middle = fullName.substring(firstSpace + 1, lastSpace);
         else
            middle = "";
         last = fullName.substring(lastSpace + 1, fullName.length());
      }
   }

   public String toString() { 
      StringBuffer buffer = new StringBuffer();
      buffer.append(first);
      buffer.append(' ');
      if (middle.length() > 0) {
         buffer.append(middle.charAt(0));
         buffer.append(". ");
      }
      buffer.append(last);
      return buffer.toString();
   }
}
