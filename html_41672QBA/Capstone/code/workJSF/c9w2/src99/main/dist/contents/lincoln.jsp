<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="lincoln">
   <h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'>
      <h:graphicImage value='/images/lincoln.jpg'/>
      <h:outputText value='#{msgs.lincolnDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
