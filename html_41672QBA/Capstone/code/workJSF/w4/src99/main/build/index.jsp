<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.indexWindowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <table>
               <tr>
                  <td>
                     <h:commandLink immediate="true" 
                        action="#{localeChanger.germanAction}">
                        <h:graphicImage value="/german_flag.gif" 
                           style="border: 0px"/>
                     </h:commandLink>
                  </td>
                  <td>
                     <h:commandLink immediate="true" 
                        action="#{localeChanger.englishAction}">
                        <h:graphicImage value="/britain_flag.gif" 
                           style="border: 0px"/>
                     </h:commandLink>
                  </td>
               </tr>
            </table>
            <p>
               <h:outputText value="#{msgs.indexPageTitle}" 
                  style="font-style: italic; font-size: 1.3em"/>
            </p>
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
                  <td style="vertical-align: top">
                     <h:outputText value="#{msgs.tellUsPrompt}"/>
                  </td>
                  <td>
                     <h:inputTextarea value="#{user.aboutYourself}" rows="5" 
                        cols="35"/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:commandButton value="#{msgs.submitPrompt}" 
                        action="thankYou"/>
                  </td>
               </tr>
            </table>
         </h:form>
      </body>
   </f:view>
</html>