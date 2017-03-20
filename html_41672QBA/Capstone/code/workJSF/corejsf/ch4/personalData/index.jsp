<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.indexWindowTitle}"/>
         </title>
      </head>
      <body>
         <h:outputText value="#{msgs.indexPageTitle}" 
            style="font-style: italic; font-size: 1.5em"/>
         <h:form>
            <table>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.namePrompt}"/>
                  </td>
                  <td>
                     <h:inputText value="#{user.name}"/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.passwordPrompt}"/>
                  </td>
                  <td>
                     <h:inputSecret value="#{user.password}"/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.tellUsPrompt}"/>
                  </td>
                  <td>
                     <h:inputTextarea value="#{user.aboutYourself}" rows="5" 
                        cols="35"/>
                  </td>
               </tr>
            </table>
            <h:commandButton value="#{msgs.submitPrompt}" action="thankYou"/>
         </h:form>
      </body>
   </f:view>
</html>