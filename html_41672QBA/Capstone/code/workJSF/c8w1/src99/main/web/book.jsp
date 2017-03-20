<html>
   <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>

   <f:view>
      <head>               
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.bookWindowTitle}"/></title>
      </head>

      <body>
         <h:form>
            <h:panelGrid columns="2" styleClass="book"
                   columnClasses="menuColumn, chapterColumn">
               <f:facet name="header">
                  <h:panelGrid columns="1" styleClass="bookHeader">
                     <h:graphicImage value="#{book.image}"/>
                     <h:outputText value="#{msgs[book.titleKey]}" 
                              styleClass='bookTitle'/>

                     <f:verbatim><hr/></f:verbatim>
                  </h:panelGrid>
               </f:facet>

               <h:dataTable value="#{book.chapterKeys}" var="chapterKey" 
                         styleClass="links" columnClasses="linksColumn">
                  <h:column>
                     <h:commandLink>
                        <h:outputText value="#{msgs[chapterKey]}"/>
                        <f:param name="chapter" value="#{chapterKey}"/>
                     </h:commandLink>
                  </h:column>
               </h:dataTable>

               <f:verbatim>
                  <c:import url="${param.chapter}.html"/>
               </f:verbatim>
            </h:panelGrid>
         </h:form>
      </body>
   </f:view>
</html>
