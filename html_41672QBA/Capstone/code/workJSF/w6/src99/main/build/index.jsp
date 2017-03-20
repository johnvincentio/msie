<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <h:outputText value="#{msgs.greeting}" styleClass="emphasis"/>
            <br/>
            <h:messages errorClass="errors"/>
            <br/>
            <table>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.namePrompt}"/>
                  </td>
                  <td>
                     <h:inputText id="name" 
                        value="#{user.name}" required="true"/>
                  </td>
                  <td>
                     <h:message for="name" errorClass="errors"/>
                  </td>
               </tr>
               <tr>
                  <td>
                     <h:outputText value="#{msgs.agePrompt}"/>
                  </td>
                  <td>
                     <h:inputText id="age" 
                        value="#{user.age}" required="true" size="3"/>
                  </td>
                  <td>
                     <h:message for="age" errorClass="errors"/>
                  </td>
               </tr>
            </table>
            <br/>
            <h:commandButton value="#{msgs.submitPrompt}"/>
         </h:form>
      </body>
   </f:view>
</html>