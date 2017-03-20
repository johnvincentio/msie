<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <h:dataTable value="#{tableData.names}" var="name">
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.lastnameColumn}" 
                        style="font-weight: bold"/>
                  </f:facet>
                  <h:outputText value="#{name.last}"/>
                  <f:facet name="footer">
                     <h:outputText value="#{msgs.alphanumeric}" 
                        style="font-size: .75em"/>
                  </f:facet>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.firstnameColumn}" 
                        style="font-weight: bold"/>
                  </f:facet>
                  <h:outputText value="#{name.first}"/>
                  <f:facet name="footer">
                     <h:outputText value="#{msgs.alphanumeric}" 
                        style="font-size: .75em"/>
                  </f:facet>
               </h:column>
            </h:dataTable>
         </h:form>
      </body>
   </f:view>
</html>