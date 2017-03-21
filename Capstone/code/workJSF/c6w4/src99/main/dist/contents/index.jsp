<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.enterPayment}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msgs.amount}"/>
               <h:inputText id="amount" value="#{payment.amount}"
                  required="true"> 
                  <f:convertNumber minFractionDigits="2"/>
                  <f:validateDoubleRange minimum="10" maximum="10000"/>     
               </h:inputText>
               <h:message for="amount" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.creditCard}"/>
               <h:inputText id="card" value="#{payment.card}"
                  required="true"> 
                  <f:validateLength minimum="13"/>
               </h:inputText>
               <h:message for="card" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.expirationDate}"/>
               <h:inputText id="date" value="#{payment.date}"
                  required="true"> 
                  <f:convertDateTime pattern="MM/yyyy"/>
               </h:inputText>
               <h:message for="date" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="Process" action="process"/>
            <h:commandButton value="Cancel" action="cancel" immediate="true"/>
         </h:form>
      </body>
   </f:view>
</html>