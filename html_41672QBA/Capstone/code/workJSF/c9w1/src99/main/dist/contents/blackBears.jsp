<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="blackBear">
   <h:panelGrid columns='2' columnClasses='bearDiscussionColumn'>
      <h:graphicImage value='/images/black-bears.jpg'/>
      <h:outputText value='#{msgs.blackBearDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
