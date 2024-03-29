<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/creditcard" prefix="corejsf" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <script src="scripts/validateCreditCard.js"
            type="text/javascript" language="JavaScript1.1">
         </script>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form id="paymentForm" onsubmit="return validatePaymentForm(this);">
            <h1><h:outputText value="#{msgs.enterPayment}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msgs.amount}"/>
               <h:inputText id="amount" value="#{payment.amount}">
                  <f:convertNumber minFractionDigits="2"/>
               </h:inputText>
               <h:message for="amount" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.creditCard}"/>
               <h:inputText id="card" value="#{payment.card}" required="true">
                  <corejsf:creditCardValidator 
                     message="#{msgs.unknownType}"arg="#{msgs.creditCard}"/>
               </h:inputText>
               <h:message for="card" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.expirationDate}"/>
               <h:inputText id="date" value="#{payment.date}">
                  <f:convertDateTime pattern="MM/dd/yyyy"/>
               </h:inputText>
               <h:message for="date" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="Process" action="process"/>
            <corejsf:validatorScript functionName="validatePaymentForm"/>
         </h:form>
      </body>
   </f:view>
</html>