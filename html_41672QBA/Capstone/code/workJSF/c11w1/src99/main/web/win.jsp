<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>                  
         <title>Congratulations!</title>
      </head>
      <body>
         <h:form>
            <h3>Congratulations! You won.</h3>
            <h:commandButton value="New game" action="#{game.initialize}"/>
         </h:form>
      </body>
   </f:view>
</html>