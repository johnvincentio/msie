<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="jefferson">
   <h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'>
      <h:graphicImage value='/images/jefferson.jpg'/>
      <h:outputText value='#{msgs.jeffersonDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
