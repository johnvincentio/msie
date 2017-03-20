<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://java.sun.com/upload" prefix="corejsf" %>

   <f:view>
      <head>                  
         <title>A file upload test</title>
      </head>
      <body>
         <h:form enctype="multipart/form-data">
            Upload a photo of yourself: 
            <corejsf:upload target="upload/#{user.id}_image.jpg"/>
            <h:commandButton value="Submit" action="submit"/>
         </h:form>
      </body>
   </f:view>
</html>