<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:subview id="pandaBear">
   <h:panelGrid columns="2" columnClasses="bearDiscussionColumn">
      <h:graphicImage value="/images/panda-bears.jpg"/>
      <h:outputText value="#{msgs.pandaBearDiscussion}"
               styleClass="tabbedPaneContent"/>
   </h:panelGrid>
</f:subview>
