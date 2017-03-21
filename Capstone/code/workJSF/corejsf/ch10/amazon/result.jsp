<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.searchResult}"/></h1>
            <h:dataTable value="#{authorSearch.details}" var="detail" 
               border="1">
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.author1}"/>
                  </f:facet>
                  <h:outputText value="#{detail.authors[0]}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.title}"/>
                  </f:facet>
                  <h:outputText value="#{detail.productName}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.publisher}"/>
                  </f:facet>
                  <h:outputText value="#{detail.manufacturer}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.pubdate}"/>
                  </f:facet>
                  <h:outputText value="#{detail.releaseDate}"/>
               </h:column>
            </h:dataTable>
            <h:commandButton value="#{msgs.back}" action="back"/>
         </h:form>
      </body>
   </f:view>
</html>
