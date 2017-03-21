<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>               
         <title>Generating binary data</title>
      </head>
      <body>
         <h:form>
            <p>Here is your image:</p>
            <h:graphicImage url="chart.faces"/>
         </h:form>
      </body>
   </f:view>
</html>