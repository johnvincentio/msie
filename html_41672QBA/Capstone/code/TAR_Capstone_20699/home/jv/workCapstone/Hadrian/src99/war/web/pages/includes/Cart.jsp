
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/fmt" prefix="fmt" %>
<%@ taglib uri="/tags/c" prefix="c" %>

<%@ page import="jvdebug.*" %>

<body bgcolor="white">
<center>
<h1><fmt:message key="cart.header"/></h1>
<html:errors/>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><fmt:message key="cart.hd1"/></TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cart.hd2"/></TD>
    <TD BGCOLOR=AAAAAA><fmt:message key="cart.hd3"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="cart.hd4"/></TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cart.hd5"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cart.hd6"/></TD>	
	<TD BGCOLOR=AAAAAA><fmt:message key="cart.hd7"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="cart.hd8"/></TD>
</TR>

<c:forEach var="item" items="${jvShoppingCart.items}">
	<tr>
		<html:form action="/Cart">
		<html:hidden property="item" value="${item.cartid}" />
		<td>${item.itemid}</td>	
		<td>${item.catalog}</td>
		<td>${item.sds}</td>
		<td>${item.quantity}</td>			 	 
		<td align=RIGHT>${item.price}</td>
		<td align=RIGHT>${item.total}</td>
		<td>
			<html:submit property="REMOVE">
				<fmt:message key="cart.submit.remove"/>
			</html:submit>
		</td>	
		<td>
			<html:submit property="UPDATE">
				<fmt:message key="cart.submit.update"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</c:forEach>

     <TR>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD BGCOLOR="DDDDDD"><fmt:message key="cart.tot1"/></TD>
		<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${jvShoppingCart.computeTotal}</TD>
	</TR>
</table>

</center>
</body>

