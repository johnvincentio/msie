<%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<tiles:importAttribute scope="request"/>

<h:panelGrid columns="2" styleClass="#{gridClass}"
      headerClass="#{headerClass}"
      columnClasses="#{menuColumnClass}, #{contentColumnClass}">
   <f:facet name="header">
      <f:subview id="header">
         <tiles:insert attribute="header" flush="false"/>
      </f:subview>
   </f:facet>

   <f:subview id="menu">
      <tiles:insert attribute="menu" flush="false"/>
   </f:subview>

   <f:verbatim>
      <tiles:insert attribute="content" flush="false"/>
   </f:verbatim>
</h:panelGrid>
