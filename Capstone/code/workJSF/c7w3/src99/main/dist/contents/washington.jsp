<h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'
            rendered='#{tp.washingtonCurrent}'>

   <h:graphicImage value='/images/washington.jpg'/>
   <h:outputText value='#{msgs.washingtonDiscussion}'
            styleClass='tabbedPaneContent'/>

</h:panelGrid>
