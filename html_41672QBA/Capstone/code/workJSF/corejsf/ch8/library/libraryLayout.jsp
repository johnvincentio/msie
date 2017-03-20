<%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<h:panelGrid columns="1" styleClass="book" headerClass="libraryHeader">
   <f:facet name="header">
      <f:subview id="header">
         <tiles:insert attribute="header" flush="false"/>
      </f:subview>
   </f:facet>

   <f:subview id="book">
      <tiles:insert attribute="book" flush="false"/>
   </f:subview>
</h:panelGrid>
