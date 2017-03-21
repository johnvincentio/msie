<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/tabbedpane" prefix="corejsf" %>   
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <corejsf:tabbedPane styleClass="tabbedPane" 
                                  tabClass="tab"
                          selectedTabClass="selectedTab">
               <f:facet name="jefferson">
                  <h:panelGrid columns="2">
                     <h:graphicImage value="/images/jefferson.jpg"/>
                     <h:outputText value="#{msgs.jeffersonDiscussion}" 
                        styleClass="tabbedPaneContent"/>
                  </h:panelGrid>
               </f:facet>
               <f:facet name="roosevelt">
                  <h:panelGrid columns="2">
                     <h:graphicImage value="/images/roosevelt.jpg"/>
                     <h:outputText value="#{msgs.rooseveltDiscussion}" 
                        styleClass="tabbedPaneContent"/>
                  </h:panelGrid>
               </f:facet>
               <f:facet name="lincoln">
                  <h:panelGrid columns="2">
                     <h:graphicImage value="/images/lincoln.jpg"/>
                     <h:outputText value="#{msgs.lincolnDiscussion}" 
                        styleClass="tabbedPaneContent"/>
                  </h:panelGrid>
               </f:facet>
               <f:facet name="washington">
                  <h:panelGrid columns="2">
                     <h:graphicImage value="/images/washington.jpg"/>
                     <h:outputText value="#{msgs.washingtonDiscussion}" 
                        styleClass="tabbedPaneContent"/>
                  </h:panelGrid>
               </f:facet>

               <f:selectItem itemLabel="#{msgs.jeffersonTabText}"
                  itemValue="jefferson"/>
               <f:selectItem itemLabel="#{msgs.rooseveltTabText}"  
                  itemValue="roosevelt"/>
               <f:selectItem itemLabel="#{msgs.lincolnTabText}"    
                  itemValue="lincoln"/>
               <f:selectItem itemLabel="#{msgs.washingtonTabText}" 
                  itemValue="washington"/>
            </corejsf:tabbedPane>
         </h:form>
      </body>
   </f:view>
</html>