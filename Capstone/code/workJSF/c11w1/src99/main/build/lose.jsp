<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<html>
   <f:view>
      <head>                  
         <title>Sorry</title>
      </head>
      <body>
         <h:form>
            <h3>Sorry, you lost.</h3>
            <h:commandButton value="New game" action="#{game.initialize}"/>
         </h:form>
      </body>
   </f:view>
</html>