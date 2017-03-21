<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="washington">
   <h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'>
      <h:graphicImage value='/images/washington.jpg'/>
      <h:outputText value='#{msgs.washingtonDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
