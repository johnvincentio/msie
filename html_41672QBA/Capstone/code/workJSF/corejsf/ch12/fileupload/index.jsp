<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>                  
         <title>A file upload test</title>
      </head>
      <body>
         <h:form>
            Enter your user ID: 
            <h:inputText value="#{user.id}"/>
            <h:commandButton value="Next" action="next"/>
         </h:form>
      </body>
   </f:view>
</html>