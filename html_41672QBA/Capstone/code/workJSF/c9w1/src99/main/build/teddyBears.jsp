<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:subview id="teddyBear">
   <h:panelGrid columns="2" columnClasses="bearDiscussionColumn">
      <h:graphicImage value="/images/teddy-bears.jpg"/>
      <h:outputText value="#{msgs.teddyBearDiscussion}"
               styleClass="tabbedPaneContent"/>
   </h:panelGrid>
</f:subview>
