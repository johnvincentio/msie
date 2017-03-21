<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
   <f:view>
      <head>
         <title>
            <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
            <h:outputText value="#{msgs.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <h:dataTable value="#{tableData.names}" var="name">
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.editColumn}" 
                        style="font-weight: bold"/>
                  </f:facet>
                  <h:selectBooleanCheckbox value="#{name.editable}" 
                     onclick="submit()"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.lastnameColumn}" 
                        style="font-weight: bold"/>
                  </f:facet>
                  <h:inputText value="#{name.last}" rendered="#{name.editable}" 
                     size="10"/>
                  <h:outputText value="#{name.last}" 
                     rendered="#{not name.editable}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.firstnameColumn}" 
                        style="font-weight: bold"/>
                  </f:facet>
                  <h:inputText value="#{name.first}" 
                     rendered="#{name.editable}" size="10"/>
                  <h:outputText value="#{name.first}" 
                     rendered="#{not name.editable}"/>
               </h:column>
            </h:dataTable>
         </h:form>
      </body>
   </f:view>
</html>