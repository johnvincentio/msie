<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <%@ taglib uri="http://corejsf.com/battleship" prefix="battleship" %>
   <f:view>
      <head>                  
         <title>Battle in Progress!</title>
      </head>
      <body>
         <h:form>
            <table>
               <tr>
                  <td>Your battleground:</td>
                  <td>Your opponent's battleground:</td>
               </tr>
               <tr>
                  <td><battleship:map value="#{game.own}" 
                     buttons="false" own="true"/></td>
                  <td><battleship:map value="#{game.opponent}" 
                     buttons="true" own="false"/></td>
               </tr>
               <tr>
                  <td></td>
                  <td><h:commandButton value="Fire" action="#{game.move}"/></td>
               </tr>
            </table>
         </h:form>
      </body>
   </f:view>
</html>