<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
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
            <h:dataTable value="#{tableData.names}" var="name" 
               styleClass="names" headerClass="namesHeader" 
               columnClasses="last,first">
               <h:column rendered="#{tableData.editable}">
                  <f:facet name="header">
                     <h:outputText value="#{msgs.deleteColumnHeader}"/>
                  </f:facet>
                  <h:selectBooleanCheckbox value="#{name.markedForDeletion}" 
                     onchange="submit()"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.lastColumnHeader}"/>
                  </f:facet>
                  <h:outputText value="#{name.last}"/>
                  <f:verbatim>,</f:verbatim>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.firstColumnHeader}"/>
                  </f:facet>
                  <h:outputText value="#{name.first}"/>
               </h:column>
            </h:dataTable>
            <h:outputText value="#{msgs.editPrompt}"/>
            <h:selectBooleanCheckbox onchange="submit()" 
               value="#{tableData.editable}"/>
            <h:commandButton value="#{msgs.deleteButtonText}" 
               rendered="#{tableData.editable}" 
               action="#{tableData.deleteNames}" 
               disabled="#{not tableData.anyNamesMarkedForDeletion}"/>
         </h:form>
      </body>
   </f:view>
</html>