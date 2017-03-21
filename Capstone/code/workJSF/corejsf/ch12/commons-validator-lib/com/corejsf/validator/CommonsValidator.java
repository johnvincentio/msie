package com.corejsf.validator;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.ValidatorResources;
import org.apache.commons.validator.ValidatorResourcesInitializer;

public class CommonsValidator implements Validator, Serializable {
   private String type;
   private String message;
   private String arg;
   private Boolean client;
   private Boolean server;

   private Double min;
   private Double max;
   private Integer minlength;
   private Integer maxlength;
   private String mask;
   private String datePatternStrict;

   private transient ValidatorAction validatorAction;
   private transient Method validatorMethod;
   private transient Class[] paramTypes;
   private transient Object validator;
   private static Map standardTypes;
   private static Logger logger = Logger.getLogger("com.corejsf.validator");

   // PROPERTY: type
   public void setType(String newValue) { type = newValue; } 
   public String getType() { return type; }

   // PROPERTY: client
   public void setClient(Boolean newValue) { client = newValue; } 
   public Boolean getClient() { return client; }

   // PROPERTY: server
   public void setServer(Boolean newValue) { server = newValue; } 
   public Boolean getServer() { return server; }

   // PROPERTY: message
   public void setMessage(String newValue) { message = newValue; } 

   // PROPERTY: arg 
   public void setArg(String newValue) { arg = newValue; } 
   public String getArg() { return arg; }

   // PROPERTY: min
   public void setMin(Double newValue) { min = newValue; } 

   // PROPERTY: max
   public void setMax(Double newValue) { max = newValue; } 

   // PROPERTY: minlength
   public void setMinlength(Integer newValue) { minlength = newValue; } 

   // PROPERTY: maxlength
   public void setMaxlength(Integer newValue) { maxlength = newValue; } 

   // PROPERTY: mask
   public void setMask(String newValue) { mask = newValue; } 

   // PROPERTY: datePatternStrict
   public void setDatePatternStrict(String newValue) { 
      datePatternStrict = newValue;
   } 

   public Object[] getParams() { 
      ArrayList r = new ArrayList();
      if (min != null) r.add(min);
      if (max != null) r.add(max);
      if (minlength != null) r.add(minlength);
      if (maxlength != null) r.add(maxlength);
      if (mask != null) r.add(mask);
      if (datePatternStrict != null) r.add(datePatternStrict);
      return r.toArray();
   }
      
   public String[] getParamNames() { 
      ArrayList r = new ArrayList();
      if (min != null) r.add("min");
      if (max != null) r.add("max");
      if (minlength != null) r.add("minlength");
      if (maxlength != null) r.add("maxlength");
      if (mask != null) r.add("mask");
      if (datePatternStrict != null) r.add("datePatternStrict");
      return (String[]) r.toArray(new String[r.size()]);
   }

   public static ValidatorAction getValidatorAction(String name) {
      final String VALIDATOR_RESOURCES_KEY = "com.corejsf.validator.resources";
      FacesContext context = FacesContext.getCurrentInstance();
      ExternalContext external = context.getExternalContext();
      Map applicationMap = external.getApplicationMap();
      ValidatorResources validatorResources 
         = (ValidatorResources) applicationMap.get(VALIDATOR_RESOURCES_KEY);
      if (validatorResources == null) { 
         InputStream in = external.getResourceAsStream("/WEB-INF/validator-rules.xml");
         validatorResources = new ValidatorResources();
         try {
            ValidatorResourcesInitializer.initialize(validatorResources, in);
            applicationMap.put(VALIDATOR_RESOURCES_KEY, validatorResources);
         } catch (IOException ex) {
            logger.log(Level.SEVERE, "can't initialize resources", ex);
            return null;
         }
      }
      return validatorResources.getValidatorAction(name);
   }

   public ValidatorAction getValidatorAction() {
      if (validatorAction == null) validatorAction = getValidatorAction(type);
      return validatorAction;
   }

   public void validate(FacesContext context, UIComponent component, 
      Object value) {
      if (Boolean.FALSE.equals(server)) return;
      initValidation();     
      Object[] p = getParams();
      Object[] params = new Object[p.length + 1];

      params[0] = convert(value, paramTypes[0]);
      for (int i = 1; i < params.length; i++) 
         params[i] = convert(p[i - 1], paramTypes[i]);

      try {
         Boolean r = (Boolean) validatorMethod.invoke(validator, params);
         
         if (r.equals(Boolean.FALSE)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
               getErrorMessage(value, context), null);
            throw new ValidatorException(message);
         }
      } catch (IllegalAccessException ex) {
         logger.log(Level.SEVERE, "can't invoke validator", ex);
      } catch (InvocationTargetException ex) {
         logger.log(Level.SEVERE, "can't invoke validator", ex);
      }
   }

   public void initValidation() {
      if (validatorMethod != null) return;     
      getValidatorAction();      
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      if (classLoader == null) classLoader = getClass().getClassLoader();
      try {
         List params = validatorAction.getMethodParamsList();
         paramTypes = new Class[params.size()];
         for (int i = 0; i < paramTypes.length; i++) {
            String paramTypeName = (String) params.get(i);
            paramTypes[i] = (Class) standardTypes.get(paramTypeName);
            if (paramTypes[i] == null) 
               paramTypes[i] = classLoader.loadClass(paramTypeName);
         }      
         Class c = classLoader.loadClass(validatorAction.getClassname());      
         validatorMethod 
            = c.getMethod(validatorAction.getMethod(), paramTypes);
         if (!Modifier.isStatic(validatorMethod.getModifiers())) 
            validator = c.newInstance();
      } catch (ClassNotFoundException ex) {
         logger.log(Level.SEVERE, "can't load validator or param class", ex);
      } catch (NoSuchMethodException ex) {
         logger.log(Level.SEVERE, "can't get validator method", ex);
      } catch (InstantiationException ex) {
         logger.log(Level.SEVERE, "can't instantiate validator", ex);
      } catch (IllegalAccessException ex) {
         logger.log(Level.SEVERE, "can't instantiate validator", ex);
      }
   }

   public String getErrorMessage(Object value, FacesContext context) {
      final String DEFAULT_BUNDLE_NAME = "com.corejsf.validator.messages";

      Locale locale = context.getViewRoot().getLocale();
      String msg = message;
      if (msg == null) { 
         String msgkey = validatorAction.getMsg();
         ClassLoader loader = Thread.currentThread().getContextClassLoader();
         if (loader == null) loader = getClass().getClassLoader();
         Application app = context.getApplication();
         String appBundleName = app.getMessageBundle();
         if (appBundleName != null) {
            ResourceBundle bundle 
               = ResourceBundle.getBundle(appBundleName, locale, loader);
            if (bundle != null)
               try {
                  msg = bundle.getString(msgkey);
               } catch (MissingResourceException ex) {
               }
         }
         if (msg == null) {            
            ResourceBundle bundle 
               = ResourceBundle.getBundle(DEFAULT_BUNDLE_NAME, locale, loader);
            if (bundle != null)
               try {
                  msg = bundle.getString(msgkey);
               } catch (MissingResourceException ex) {
               }
         }
      }
      Object[] p = getParams();
      Object[] params = new Object[p.length + 1];
      params[0] = value;
      for (int i = 1; i < params.length; i++) 
         params[i] = p[i - 1];
      msg = new MessageFormat(msg, locale).format(params);
      return msg;
   }
   
   private static Object convert(Object obj, Class cl) {
      if (cl.isInstance(obj)) return obj;
      if (cl == String.class) return "" + obj;
      if (obj instanceof String) {
         String str = (String) obj;
         if (cl == boolean.class) return Boolean.valueOf(str);
         if (cl == byte.class) return new Byte(str);
         if (cl == char.class) return new Character(str.charAt(0));
         if (cl == double.class) return new Double(str);
         if (cl == float.class) return new Float(str);
         if (cl == int.class) return new Integer(str);
         if (cl == long.class) return new Long(str);
         if (cl == short.class) return new Short(str);
      } else if (obj instanceof Number) {
         Number num = (Number) obj;
         if (cl == byte.class) return new Byte(num.byteValue());
         if (cl == double.class) return new Double(num.doubleValue());
         if (cl == float.class) return new Float(num.floatValue());
         if (cl == int.class) return new Integer(num.intValue());
         if (cl == long.class) return new Long(num.longValue());
         if (cl == short.class) return new Short(num.shortValue());         
      }
      return obj;
   }

   // these two methods are referenced in validator-utils.xml
   public static boolean isSupplied(String str) {
      return str.trim().length() > 0;
   }

   public static boolean isDate(String d, String datePatternStrict) {
      return GenericValidator.isDate(d, datePatternStrict, true);
   }

   static {
      standardTypes = new HashMap();
      standardTypes.put("boolean", boolean.class);
      standardTypes.put("byte", byte.class);
      standardTypes.put("char", char.class);
      standardTypes.put("double", double.class);
      standardTypes.put("float", float.class);
      standardTypes.put("int", int.class);
      standardTypes.put("long", long.class);
      standardTypes.put("short", short.class);
      standardTypes.put("java.lang.String", String.class);
   }
}
