<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head> 
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/> 
         </title>
      </head>

      <body>
         <h:outputText value="#{msgs.pageTitle}" styleClass="emphasis"/>
         <p/>
         <h:form>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.streetAddressPrompt}"/>
               <h:inputText id="streetAddress" value="#{form.streetAddress}"/>

               <h:outputText id="cityPrompt" value="#{msgs.cityPrompt}"/> 
               <h:inputText value="#{form.city}"/>

               <h:outputText id="statePrompt" value="#{msgs.statePrompt}"/> 
               <h:inputText value="#{form.state}"/>

               <h:outputText value="#{msgs.countryPrompt}"/> 

               <h:selectOneMenu value="#{form.country}"
                  onchange="submit()"
                  valueChangeListener="#{form.countryChanged}">
                  <f:selectItems value="#{form.countryNames}"/>
               </h:selectOneMenu>
            </h:panelGrid>
            <p/>
            <h:commandButton value="#{msgs.submit}"/>
         </h:form>
      </body>
   </f:view>
</html>  
