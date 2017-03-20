<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.authorSearch}"/></h1>
            <h:outputText value="#{msgs.author}"/>
            <h:inputText value="#{authorSearch.name}"/>
            <h:commandButton value="#{msgs.search}" 
               action="#{authorSearch.search}"/>
         </h:form>
      </body>
   </f:view>
</html>