<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.newUserSignup}"/></h1>
            <p><h:outputText value="#{msgs.newUserSignup_detail}"/></p>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.firstName}"/>
               <h:inputText value="#{user.name.first}"/>

               <h:outputText value="#{msgs.middleInitial}"/>
               <h:inputText value="#{user.name.middle}"/>

               <h:outputText value="#{msgs.lastName}"/>
               <h:inputText value="#{user.name.last}"/>

               <h:outputText value="#{msgs.email}"/>
               <h:inputText value="#{user.email}"/>

               <h:outputText value="#{msgs.loginID}"/>
               <h:inputText value="#{user.id}"/>

               <h:outputText value="#{msgs.password}"/>
               <h:inputSecret value="#{user.password}"/>
            </h:panelGrid>
            <h:commandButton value="#{msgs.submit}" action="#{user.signup}"/>
            <h:commandButton value="#{msgs.cancel}" action="signup_cancel"/>
         </h:form>
      </body>
   </f:view>
</html>
