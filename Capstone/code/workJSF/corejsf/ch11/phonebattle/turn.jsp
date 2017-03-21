<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://corejsf.com/j2me" prefix="j2me" %>
<%@ taglib uri="http://corejsf.com/battleship" prefix="battleship" %>
<f:view>
   <j2me:form id="turn">
      <battleship:map id="own" value="#{game.own}" own="true"/>
      <battleship:map id="opponent" value="#{game.opponent}" own="false"/>
      <j2me:command id="fire" action="#{game.move}"/>
   </j2me:form>
</f:view>