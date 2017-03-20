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
            <p>
               <h:outputText value="#{msgs.thankYou}"/>
               <h:outputText value="#{msgs.score}"/>                        
               <h:outputText value="#{quiz.score}"/>.
            </p>
            <p>
               <h:commandButton value="#{msgs.startOverButton}" 
                  action="#{quiz.startOverAction}"/>
            </p>
         </h:form>
      </body>
   </f:view>
</html>