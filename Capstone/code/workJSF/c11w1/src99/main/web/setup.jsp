<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/battleship" prefix="battleship" %>
   <f:view>
      <head>                  
         <title>Welcome to Battleship!</title>
      </head>
      <body>
         <h:form>
            <h3>Set up your battleground.</h3>
            <h:messages/>
            <battleship:map value="#{game.own}" own="true"
                  buttons="true" validator="#{setupform.validate}"/>
            <hr/>
            <h:selectOneRadio 
                  binding="#{setupform.directionComponent}" 
                  value="#{setupform.horizontal}">
               <f:selectItem itemValue="true" itemLabel="horizontal"/>
               <f:selectItem itemValue="false" itemLabel="vertical"/>
            </h:selectOneRadio>
            <br/>
            <h:selectOneRadio
                  binding="#{setupform.sizeComponent}" 
                  value="#{setupform.size}">
               <f:selectItems value="#{game.own.availableSizes}"/>
            </h:selectOneRadio>
            <br/>
            <h:commandButton value="Add" action="#{setupform.submitAction}"/>
         </h:form>
      </body>
   </f:view>
</html>