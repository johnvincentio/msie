<h:panelGrid columns='2' columnClasses='presidentDiscussionColumn'
            rendered='#{tp.rooseveltCurrent}'>

   <h:graphicImage value='/images/roosevelt.jpg'/>
   <h:outputText value='#{msgs.rooseveltDiscussion}'
            styleClass='tabbedPaneContent'/>

</h:panelGrid>
