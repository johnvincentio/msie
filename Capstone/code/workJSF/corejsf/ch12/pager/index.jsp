<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/pager" prefix="corejsf" %>

   <f:view>
      <head>                  
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <title>Pager Test</title>
      </head>
      <body>
         <h:form>
            <h:dataTable id="timezones" value="#{bb.data}" var="row" rows="10">
               <h:column>
                  <h:outputText value="#{row}" />
               </h:column>
            </h:dataTable>
            <corejsf:pager dataTableId="timezones" 
               showpages="20" selectedStyleClass="currentPage"/>
         </h:form>
      </body>
   </f:view>
</html>