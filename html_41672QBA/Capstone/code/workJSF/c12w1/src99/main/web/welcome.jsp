<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

   <f:view>
      <head>               
         <title>A Simple Java Server Faces Application</title>
      </head>
      <body>
         <h:form>
            <p>
               Welcome to 
               <h:outputText value="#{bb.state}"/>!
            </p>
            <h:commandButton value="Technique 1" action="technique1"/>
            <h:commandButton value="Technique 2" action="technique2"/>
         </h:form>
      </body>      
   </f:view>
</html>