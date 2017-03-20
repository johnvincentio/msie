<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://corejsf.com/j2me" prefix="j2me" %>
<%@ taglib uri="http://corejsf.com/battleship" prefix="battleship" %>
<f:view>
   <j2me:form id="setup">
      <battleship:map id="own" value="#{game.own}" own="true"
            validator="#{setupform.validate}"/>
      <j2me:selectOne id="direction" 
            binding="#{setupform.directionComponent}" 
            value="#{setupform.horizontal}">
         <f:selectItem itemValue="true" itemLabel="horizontal"/>
         <f:selectItem itemValue="false" itemLabel="vertical"/>
      </j2me:selectOne>
      <j2me:selectOne id="size" 
            binding="#{setupform.sizeComponent}" 
            value="#{setupform.size}">
         <f:selectItems value="#{game.own.availableSizes}"/>
      </j2me:selectOne>
      <j2me:command id="submit" action="#{setupform.submitAction}"/>
   </j2me:form>
</f:view>