<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <p><h:outputText value="#{msgs.youHaveAccess}"/></p>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.yourUserName}"/>
               <h:outputText value="#{user.name}"/>

               <h:panelGroup>
                  <h:outputText value="#{msgs.memberOf}"/>
                  <h:selectOneMenu onchange="submit()" value="#{user.role}">
                     <f:selectItem itemValue="" itemLabel="Select a role"/>
                     <f:selectItem itemValue="admin" itemLabel="admin"/>
                     <f:selectItem itemValue="manager" itemLabel="manager"/>
                     <f:selectItem itemValue="registereduser" 
                        itemLabel="registereduser"/>
                     <f:selectItem itemValue="invitedguest" 
                         itemLabel="invitedguest"/>
                  </h:selectOneMenu>
               </h:panelGroup>
               <h:outputText value="#{user.inRole}"/>
            </h:panelGrid>
         </h:form>
      </body>
   </f:view>
</html>