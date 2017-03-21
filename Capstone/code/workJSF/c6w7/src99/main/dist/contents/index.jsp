<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/validator4" prefix="corejsf" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title><h:outputText value="#{msgs.title}"/></title>
      </head>
      <body>
         <h:form>
            <h1><h:outputText value="#{msgs.enterPayment}"/></h1>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.amount}"/>
               <h:inputText id="amount" value="#{payment.amount}">
                  <f:convertNumber minFractionDigits="2"/>
               </h:inputText>

               <h:outputText value="#{msgs.creditCard}"/>
               <h:inputText id="card" value="#{payment.card}" required="true">
                  <f:validator validatorId="com.corejsf.CreditCard"/>
                  <corejsf:validateRegex expression="[3-6].*" 
                     errorDetail="#{msgs.unknownType}"/>
               </h:inputText>

               <h:outputText value="#{msgs.expirationDate}"/>
               <h:inputText id="date" value="#{payment.date}">
                  <f:convertDateTime pattern="MM/yyyy"/>
               </h:inputText>
            </h:panelGrid>
            <h:messages styleClass="errorMessage" 
               showSummary="false" showDetail="true"/>
            <br/>
            <h:commandButton value="Process" action="process"/>
         </h:form>
      </body>
   </f:view>
</html>