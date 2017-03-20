<h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'
            rendered='#{tp.jeffersonCurrent}'>

   <h:graphicImage value='/images/jefferson.jpg'/>
   <h:outputText value='#{msgs.jeffersonDiscussion}'
            styleClass='tabbedPaneContent'/>

</h:panelGrid>
