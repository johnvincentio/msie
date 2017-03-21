<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:subview id="roosevelt">
   <h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'>
      <h:graphicImage value='/images/roosevelt.jpg'/>
      <h:outputText value='#{msgs.rooseveltDiscussion}'
               styleClass='tabbedPaneContent'/>
   </h:panelGrid>
</f:subview>
