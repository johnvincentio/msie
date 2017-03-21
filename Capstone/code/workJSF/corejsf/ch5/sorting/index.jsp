<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
   <f:view>
      <head>
         <link href="site.css" rel="stylesheet" type="text/css"/>
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
               <h:column>
                  <f:facet name="header"> 
                     <h:commandLink action="#{tableData.names.sortByLast}">  
                        <h:outputText value="#{msgs.lastColumnHeader}"/> 
                     </h:commandLink>
                  </f:facet>
                  <h:outputText value="#{name.last}"/>
                  <f:verbatim>,</f:verbatim>
               </h:column>
               <h:column>
                  <f:facet name="header"> 
                     <h:commandLink action="#{tableData.names.sortByFirst}">  
                        <h:outputText value="#{msgs.firstColumnHeader}"/> 
                     </h:commandLink>
                  </f:facet>
                  <h:outputText value="#{name.first}"/>
               </h:column>
            </h:dataTable>
         </h:form>
      </body>
   </f:view>
</html>