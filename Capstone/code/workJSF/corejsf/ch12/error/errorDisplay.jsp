<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

   <f:subview id="dummy">
      <head>                  
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <p><h:outputText value="#{msgs.errorOccurred}"/></p>
            <p><h:outputText value="#{msgs.copyReport}"/></p>
            <h:inputTextarea value="#{error.stackTrace}" 
               rows="40" cols="80" readonly="true"/>
         </h:form>
      </body>
   </f:subview>
</html>