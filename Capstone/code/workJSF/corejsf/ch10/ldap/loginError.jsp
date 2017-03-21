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
            <h1><h:outputText value="#{msgs.loginError}"/></h1>
            <p>               
               <h:outputText value="#{msgs.loginError_detail}"/>
            </p>
            <p>
               <h:commandButton value="#{msgs.tryAgain}" action="login"/>
               <h:commandButton value="#{msgs.signup}" action="signup"/>
            </p>
         </h:form>
      </body>
   </f:view>
</html>
