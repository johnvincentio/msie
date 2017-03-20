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
            <corejsf:tabbedPane styleClass="tabbedPane" tabClass="tab" 
               selectedTabClass="selectedTab" 
               resourceBundle="com.corejsf.messages">
               <f:selectItems value="#{tabbedPaneBean.tabs}"/>
            </corejsf:tabbedPane>
         </h:form>
      </body>
   </f:view>
</html>