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
               <h:outputText value="#{msgs.name}"/>
               <h:inputText value="#{user.name}"/> 

               <h:outputText value="#{msgs.password}"/>
               <h:inputSecret value="#{user.password}"/>
            </h:panelGrid>
            <h:commandButton value="#{msgs.login}" action="#{user.login}"/>
         </h:form>
      </body>
   </f:view>
</html>