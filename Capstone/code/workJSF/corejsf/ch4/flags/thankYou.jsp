<html>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <f:view>
      <head>               
         <f:loadBundle basename="messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.thankYouWindowTitle}"/>
         </title>
      </head>

      <body>
         <h:outputText value="#{msgs.namePrompt}"
            style="font-style: italic"/>
         <h:outputText value="#{user.name}"/>
         <p>
            <h:outputText value="#{msgs.aboutYourselfPrompt}"
            style="font-style: italic"/>
         <p>
         <pre><h:outputText value="#{user.aboutYourself}"/></pre>
      </body>
   </f:view>
</html>
