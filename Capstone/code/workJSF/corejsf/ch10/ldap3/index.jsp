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
            <h1><h:outputText value="#{msgs.enterNameAndPassword}"/></h1>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.loginID}"/>
               <h:inputText value="#{user.id}"/> 

               <h:outputText value="#{msgs.password}"/>
               <h:inputSecret value="#{user.password}"/>
            </h:panelGrid>
            <h:commandButton value="#{msgs.login}" action="#{user.login}"/>
            <br/>
            <h:outputText value="#{msgs.signupNow}"/>
            <h:commandButton value="#{msgs.signup}" action="signup"/>
         </h:form>
      </body>
   </f:view>
</html>
