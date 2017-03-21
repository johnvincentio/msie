<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/validator" prefix="v" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form id="paymentForm" onsubmit="return validatePaymentForm(this);">
            <h1><h:outputText value="#{msgs.enterPayment}"/></h1>
            <h:panelGrid columns="3">
               <h:outputText value="#{msgs.amount}"/>
               <h:inputText id="amount" value="#{payment.amount}">
                  <f:convertNumber minFractionDigits="2"/>
                  <v:commonsValidator type="floatRange" 
                     min="10" max="10000" arg="#{msgs.amount}"/>
                  <v:commonsValidator type="required" 
                     arg="#{msgs.amount}"/>
               </h:inputText>
               <h:message for="amount" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.creditCard}"/>
               <h:inputText id="card" value="#{payment.card}" required="true">
                  <v:commonsValidator type="creditCard" 
                     arg="#{msgs.creditCard}"/>
                  <v:commonsValidator type="mask" mask="[4-6].*" 
                     message="#{msgs.unknownType}"
                     arg="#{msgs.creditCard}"/>
               </h:inputText>
               <h:message for="card" styleClass="errorMessage"/>

               <h:outputText value="#{msgs.expirationDate}"/>
               <h:inputText id="date" value="#{payment.date}">
                  <f:convertDateTime pattern="MM/dd/yyyy"/>
                  <v:commonsValidator type="date" 
                     datePatternStrict="MM/dd/yyyy" 
                     arg="#{msgs.expirationDate}" server="false"/>
               </h:inputText>
               <h:message for="date" styleClass="errorMessage"/>
            </h:panelGrid>
            <h:commandButton value="Process" action="process"/>
            <v:validatorScript functionName="validatePaymentForm"/>
         </h:form>
      </body>
   </f:view>
</html>