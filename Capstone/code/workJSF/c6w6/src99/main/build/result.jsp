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
            <p><h:outputText value="#{msgs.validDate}"/></p>
            <p>
               <h:commandButton value="#{msgs.back}" action="back"/>
            </p>
         </h:form>
      </body>
   </f:view>
</html>