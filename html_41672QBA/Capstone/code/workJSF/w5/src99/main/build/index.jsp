<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form id="registerForm">
            <table>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.namePrompt}"/>
                  </td>
                  <td>
                     <h:inputText/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.passwordPrompt}"/>
                  </td>
                  <td>
                     <h:inputSecret id="password"/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.confirmPasswordPrompt}"/>
                  </td>
                  <td>
                     <h:inputSecret id="passwordConfirm"/>
                  </td>
               </tr>
            </table>
            <h:commandButton type="button" value="Submit Form" 
               onclick="checkPassword(this.form)"/>
         </h:form>
      </body>
      <script type="text/javascript">
      <!--
         function checkPassword(form) {
            var password = form["registerForm:password"].value;
            var passwordConfirm = form["registerForm:passwordConfirm"].value;

            if(password == passwordConfirm)
               form.submit();
            else
               alert("Password and password confirm fields don't match");
         }
      -->
      </script>
   </f:view>
</html>