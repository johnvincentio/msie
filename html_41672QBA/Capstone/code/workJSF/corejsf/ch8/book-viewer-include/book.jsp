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
                  <f:subview id="header">
                     <c:import url="/bookHeader.jsp"/>
                  </f:subview>
               </f:facet>

               <f:subview id="menu">
                  <c:import url="/bookMenu.jsp"/>
               </f:subview>

               <f:verbatim>
                  <c:import url="/bookContent.jsp"/>
               </f:verbatim>
            </h:panelGrid>
         </h:form>
      </body>
   </f:view>
</html>
