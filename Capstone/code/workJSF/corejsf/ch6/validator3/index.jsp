<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.enterDate}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msgs.day}"/>
               <h:inputText value="#{bb.day}" binding="#{bb.dayInput}" 
                  size="2" required="true"/>
               <h:panelGroup/>
               
               <h:outputText value="#{msgs.month}"/>
               <h:inputText value="#{bb.month}" binding="#{bb.monthInput}" 
                  size="2" required="true"/>
               <h:panelGroup/>
               
               <h:outputText value="#{msgs.year}"/>
               <h:inputText id="year" value="#{bb.year}" 
                  binding="#{bb.yearInput}" size="4" required="true" 
                  validator="#{bb.validateDate}"/>               
               <h:message for="year" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="#{msgs.submit}" action="submit"/>
         </h:form>
      </body>
   </f:view>
</html>