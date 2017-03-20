<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://corejsf.com/chart" prefix="corejsf" %>
<f:view>
   <corejsf:chart width="500" height="500" 
      title="Diameters of the Planets" 
      names="#{planets.names}" values="#{planets.values}"/>
</f:view>
