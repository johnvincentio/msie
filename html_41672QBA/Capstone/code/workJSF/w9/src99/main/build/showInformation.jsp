<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head> 
         <link href="styles.css" rel="stylesheet" type="text/css"/> 
         <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.indexWindowTitle}"/>
         </title>
      </head>

      <body>
         <h:outputFormat value="#{msgs.thankYouLabel}">
            <f:param value="#{form.name}"/>
         </h:outputFormat>
         <p>
         <table>
            <tr>
               <td><h:outputText value="#{msgs.contactMeLabel}"/></td>
               <td><h:outputText value="#{form.contactMe}"/></td>
            </tr>
            
            <tr>
               <td><h:outputText value="#{msgs.bestDayLabel}"/></td>
               <td><h:outputText value="#{form.bestDaysConcatenated}"/></td>
            </tr>
            
            <tr>
               <td><h:outputText value="#{msgs.yearOfBirthLabel}"/></td>
               <td><h:outputText value="#{form.yearOfBirth}"/></td>
            </tr>
            
            <tr>
               <td><h:outputText value="#{msgs.languageLabel}"/></td>
               <td><h:outputText value="#{form.languagesConcatenated}"/></td>
            </tr>

            <tr>
               <td><h:outputText value="#{msgs.colorLabel}"/></td>
               <td><h:outputText value="#{form.colorsConcatenated}"/></td>
            </tr>

            <tr>
               <td><h:outputText value="#{msgs.educationLabel}"/></td>
               <td><h:outputText value="#{form.education}"/></td>
            </tr>
         </table>
      </body>
   </f:view>
</html>  
