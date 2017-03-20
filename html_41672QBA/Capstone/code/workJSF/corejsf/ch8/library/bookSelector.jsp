<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<h:outputText value="#{msgs.selectABookPrompt}"/>

<f:verbatim>&nbsp;&nbsp;</f:verbatim>

<h:selectOneMenu onchange="submit()" value="#{library.book}"
      valueChangeListener="#{library.bookSelected}">
   <f:selectItems value="#{library.bookItems}"/>
</h:selectOneMenu>
