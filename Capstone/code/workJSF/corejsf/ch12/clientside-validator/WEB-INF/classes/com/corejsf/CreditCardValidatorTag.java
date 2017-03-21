package com.corejsf;

import javax.faces.validator.Validator;
import javax.faces.webapp.ValidatorTag;
import javax.servlet.jsp.JspException;

public class CreditCardValidatorTag extends ValidatorTag {
   private String message;
   private String arg;

   public CreditCardValidatorTag() {
      setValidatorId("com.corejsf.CreditCard");
   }

   // PROPERTY: message
   public void setMessage(String newValue) { 
      message = newValue;
   } 

   // PROPERTY: arg
   public void setArg(String newValue) { 
      arg = newValue;
   } 

   public Validator createValidator() throws JspException {
      CreditCardValidator validator 
         = (CreditCardValidator) super.createValidator();

      validator.setMessage(com.corejsf.util.Tags.eval(message));
      validator.setArg(com.corejsf.util.Tags.eval(arg));

      return validator;
   }

   public void release() {
      message = null;
      arg = null;
   }
}
