<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

   <f:view>
      <head>                  
         <script language="JavaScript1.1">
            function doPopup(source) {
               country = source.form[source.form.id + ":country"];
               for (var i = 0; i < country.length; i++) {
                  if (country[i].checked) {
                     popup = window.open("popup.faces?country=" 
                        + country[i].value, "popup", 
                        "height=300,width=200,toolbar=no,menubar=no,"
                        + "scrollbars=yes");               
                     popup.openerFormId = source.form.id;
                     popup.focus();
                  }
               }
            }               
      </script>
         <title>A Simple Java Server Faces Application</title>
      </head>
      <body>
         <h:form>
            <table>
               <tr>
                  <td>Country:</td>
                  <td>
                     <h:selectOneRadio id="country" value="#{bb.country}">
                        <f:selectItem itemLabel="USA"  itemValue="USA"/>
                        <f:selectItem itemLabel="Canada"  itemValue="Canada"/>
                     </h:selectOneRadio>
                  </td>
               </tr>             
               <tr>
                  <td>State/Province:</td>
                  <td>
                     <h:inputText id="state" value="#{bb.state}"/>
                  </td>
                  <td>
                     <h:commandButton value="..."
                        onclick="doPopup(this); return false;"/>
                  </td>
               </tr>
            </table>
            <p>
               <h:commandButton value="Next" action="next"/>
            </p>
         </h:form>
      </body>
   </f:view>
</html>