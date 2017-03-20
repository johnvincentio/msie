<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>               
         <title>Testing file upload......</title>
      </head>
      <body>
         <h:form>
            Here is your image: 
            <h:graphicImage url="/upload/#{user.id}_image.jpg"/>
         </h:form>
      </body>
   </f:view>
</html>