<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>  
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>                  
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.indexWindowTitle}"/>
         </title>
      </head>

      <body>
         <h:form>
            <h:panelGrid columns="2" columnClasses="phaseFormColumns">
               <h:outputText value="#{msgs.phasePrompt}"/>

               <h:selectOneListbox valueChangeListener="#{form.phaseChange}">
                  <f:selectItems value="#{form.phases}"/>
               </h:selectOneListbox>

               <h:commandButton value="#{msgs.submitPrompt}"/>
            </h:panelGrid>
         </h:form>
      </body>
   </f:view>
</html>
