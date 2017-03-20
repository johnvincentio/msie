package com.corejsf;

import java.util.Map;

public class BookCatalog {
   private String name;
   private Map map;

   // PROPERTY: name
   public void setName(String name) { this.name = name; }
   public String getName() { return name; }

   // PROPERTY: books
   public Map getBooks() { return map; }
   public void setBooks(Map map) { this.map = map; }

   // PROPERTY: book
   public Book getBook(String title) { return (Book)map.get(title); }
}
