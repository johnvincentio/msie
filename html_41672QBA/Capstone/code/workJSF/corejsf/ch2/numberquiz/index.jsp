<html>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

   <f:view>
      <head>                  
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h3>
               <h:outputText value="#{msgs.heading}"/>
            </h3>
            <p>
               <h:outputText value="#{msgs.currentScore}"/>
               <h:outputText value="#{quiz.score}"/>
            </p>
            <p>
               <h:outputText value="#{msgs.guessNext}"/>
            </p>
            <p>
               <h:outputText value="#{quiz.current.sequence}"/>
            </p>
            <p>
               <h:outputText value="#{msgs.answer}"/> 
               <h:inputText value="#{quiz.answer}"/></p>
            <p>
               <h:commandButton value="#{msgs.next}" action="next"/>
            </p>
         </h:form>
      </body>
   </f:view>
</html>
