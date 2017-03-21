package com.corejsf.validator;

import javax.faces.validator.Validator;
import javax.faces.webapp.ValidatorTag;
import javax.servlet.jsp.JspException;

public class CommonsValidatorTag extends ValidatorTag {
   private String type;
   private String min;
   private String max;
   private String minlength;
   private String maxlength;
   private String datePatternStrict;
   private String mask;
   private String message;
   private String arg;
   private String client;
   private String server;

   public CommonsValidatorTag() {
      setValidatorId("com.corejsf.validator.CommonsValidator");
   }

   // PROPERTY: type
   public void setType(String newValue) { 
      type = newValue;
   } 

   // PROPERTY: min
   public void setMin(String newValue) { 
      min = newValue;
   } 

   // PROPERTY: max
   public void setMax(String newValue) { 
      max = newValue;
   } 

   // PROPERTY: minlength
   public void setMinlength(String newValue) { 
      minlength = newValue;
   } 

   // PROPERTY: maxlength
   public void setMaxlength(String newValue) { 
      maxlength = newValue;
   } 

   // PROPERTY: datePatternStrict
   public void setDatePatternStrict(String newValue) { 
      datePatternStrict = newValue;
   } 

   // PROPERTY: mask
   public void setMask(String newValue) { 
      mask = newValue;
   } 

   // PROPERTY: message
   public void setMessage(String newValue) { 
      message = newValue;
   } 

   // PROPERTY: arg
   public void setArg(String newValue) { 
      arg = newValue;
   } 

   // PROPERTY: client
   public void setClient(String newValue) { 
      client = newValue;
   } 

   // PROPERTY: server
   public void setServer(String newValue) { 
      server = newValue;
   } 

   public Validator createValidator() throws JspException {
      CommonsValidator validator = (CommonsValidator) super.createValidator();

      validator.setType(com.corejsf.util.Tags.eval(type));
      validator.setMin(com.corejsf.util.Tags.evalDouble(min));
      validator.setMax(com.corejsf.util.Tags.evalDouble(max));
      validator.setMinlength(com.corejsf.util.Tags.evalInteger(minlength));
      validator.setMaxlength(com.corejsf.util.Tags.evalInteger(minlength));
      validator.setDatePatternStrict(com.corejsf.util.Tags.eval(
         datePatternStrict));
      validator.setMask(com.corejsf.util.Tags.eval(mask));
      validator.setMessage(com.corejsf.util.Tags.eval(message));
      validator.setArg(com.corejsf.util.Tags.eval(arg));
      validator.setClient(com.corejsf.util.Tags.evalBoolean(client));
      validator.setServer(com.corejsf.util.Tags.evalBoolean(server));
      
      return validator;
   }

   public void release() {
      type = null;
      min = null;
      max = null;
      minlength = null;
      maxlength = null;
      datePatternStrict = null;
      mask = null;
      message = null;
      arg = null;
      client = null;
      server = null;
   }
}
