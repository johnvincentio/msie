<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="grizzlyBear">
   <h:panelGrid columns='2' columnClasses='bearDiscussionColumn'>
      <h:graphicImage value='/images/grizzly-bears.jpg'/>
      <h:outputText value='#{msgs.grizzlyBearDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
