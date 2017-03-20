<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://corejsf.com/j2me" prefix="j2me" %>
<f:view>
   <f:loadBundle basename="com.corejsf.messages" var="msgs"/>
   <j2me:form id="lose">
      <j2me:output id="result" value="#{msgs.youLost}"/>
      <j2me:command id="newgame" action="#{game.initialize}"/>
   </j2me:form>
</f:view>