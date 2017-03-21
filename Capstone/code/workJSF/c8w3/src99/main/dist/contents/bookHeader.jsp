<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<h:panelGrid columns="1" styleClass="headerRow">
   <h:graphicImage value="#{book.image}"/>
   <h:outputText value="#{msgs[book.titleKey]}" styleClass="bookTitle"/>
   <f:verbatim><hr></f:verbatim>
</h:panelGrid>
