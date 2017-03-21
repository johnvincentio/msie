<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>                  
         <link href="site.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.rooseveltWindowTitle}"/>
         </title>
      </head>

      <body>
         <h:form>
            <h:outputText value="#{msgs.rooseveltPageTitle}" 
               styleClass="presidentPageTitle"/>
            <p/>
            <h:outputText value="#{msgs.rooseveltDiscussion}"
               styleClass="presidentDiscussion"/>
         </h:form>
      </body>
   </f:view>
</html>
