<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

   <f:view>
      <head>               
         <title>A Simple Java Server Faces Application</title>
      </head>
      <body>
         <h:form>
            <h3>
               Welcome to Java Server Faces, 
               <h:outputText value="#{user.name}"/>!
            </h3>
         </h:form>
      </body>      
   </f:view>
</html>