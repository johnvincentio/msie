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
            <h:panelGrid columns="1">
               <h:column>
                  <h:outputText value="#{msgs.header}"/>
               </h:column>
               
               <h:column>
                  <f:verbatim escape="false">
                     <applet code="Chart.class" width="400" height="300">
                        <param name="title" value="Diameters of the Planets"/>
                        <param name="values" value="9"/>
                        <param name="name.1" value="Mercury"/>
                        <param name="name.2" value="Venus"/>
                        <param name="name.3" value="Earth"/>
                        <param name="name.4" value="Mars"/>
                        <param name="name.5" value="Jupiter"/>
                        <param name="name.6" value="Saturn"/>
                        <param name="name.7" value="Uranus"/>
                        <param name="name.8" value="Neptune"/>
                        <param name="name.9" value="Pluto"/>
                        <param name="value.1" value="3100"/>
                        <param name="value.2" value="7500"/>
                        <param name="value.3" value="8000"/>
                        <param name="value.4" value="4200"/>
                        <param name="value.5" value="88000"/>
                        <param name="value.6" value="71000"/>
                        <param name="value.7" value="32000"/>
                        <param name="value.8" value="30600"/>
                        <param name="value.9" value="1430"/>
                     </applet>
                  </f:verbatim>
               </h:column>
            </h:panelGrid>
         </h:form>
      </body>
   </f:view>
</html>
