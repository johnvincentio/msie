<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

   <f:view>
      <head>                  
         <script type="text/javascript" language="JavaScript1.2">
            function doSave(value) {
               var formId = window.openerFormId;
               opener.document.forms[formId][formId + ":state"].value = value;
               window.close();
            }               
         </script>
         <title>Select a state/province</title>
      </head>
      <body>
         <h:form>
            <h:dataTable value="#{bb.states[param.country]}" var="state">
               <h:column>
                  <h:outputLink value="#" 
                     onclick="doSave('#{state}');">
                     <h:outputText value="#{state}" />
                  </h:outputLink>
               </h:column>
            </h:dataTable>
         </h:form>
      </body>
   </f:view>
</html>