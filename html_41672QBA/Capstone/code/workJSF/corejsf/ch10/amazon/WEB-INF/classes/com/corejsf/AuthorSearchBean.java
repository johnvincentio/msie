package com.corejsf;

import com.corejsf.amazon.AmazonSearchPort;
import com.corejsf.amazon.AmazonSearchService_Impl;
import com.corejsf.amazon.AuthorRequest;
import com.corejsf.amazon.Details;
import com.corejsf.amazon.ProductInfo;

public class AuthorSearchBean {
   private String name;
   private String type;
   private Details[] details;
   private String token;

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   public void setToken(String newValue) { token = newValue; }

   public String search() {
      try{         
         AmazonSearchPort asp = (AmazonSearchPort) 
            (new AmazonSearchService_Impl().getAmazonSearchPort());
        
         AuthorRequest req = new AuthorRequest(name, 
             "1", "books", "", "lite", "", token, "", "", "");
         ProductInfo pinfo = asp.authorSearchRequest(req);          
         details = pinfo.getDetails();
         return "success";
       } catch(Exception e) {
          e.printStackTrace();
          return "failure";
       }       
   }

   public Details[] getDetails() { return details; }
}
