<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:subview id="polarBear">
   <h:panelGrid columns="2" columnClasses="bearDiscussionColumn">
      <h:graphicImage value="/images/polar-bears.jpg"/>
      <h:outputText value="#{msgs.polarBearDiscussion}"
               styleClass="tabbedPaneContent"/>
   </h:panelGrid>
</f:subview>
