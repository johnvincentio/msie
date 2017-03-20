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
            <h1><h:outputText value="#{msgs.success}"/></h1>
            <p>
               <h:outputText value="#{msgs.welcome}"/>
               <h:outputText value="#{user.name}"/>!
            </p>
            <p>
               <h:outputText value="#{msgs.success_detail}"/>
            </p>            
            <h:commandButton value="#{msgs.update}" action="update"/>
            <h:commandButton value="#{msgs.logout}" action="#{user.logout}"/>
         </h:form>
      </body>
   </f:view>
</html>