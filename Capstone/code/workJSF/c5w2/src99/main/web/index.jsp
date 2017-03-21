<html>
   <%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
   <f:view>
      <head>
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.pageTitle}"/>
         </title>
      </head>
      <body>
         <h:form>
            <h:dataTable value="#{customer.all}" var="customer" 
               styleClass="customers" 
               headerClass="customersHeader" columnClasses="custid,name">
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.customerIdHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.Cust_ID}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.nameHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.Name}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.phoneHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.Phone_Number}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.addressHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.Street_Address}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.cityHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.City}"/>
               </h:column>
               <h:column>
                  <f:facet name="header">
                     <h:outputText value="#{msgs.stateHeader}"/>
                  </f:facet>
                  <h:outputText value="#{customer.State}"/>
               </h:column>
            </h:dataTable>
         </h:form>
      </body>
   </f:view>
</html>