
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/fmt" prefix="fmt" %>
<%@ taglib uri="/tags/c" prefix="c" %>

<%@ page import="jvdebug.Debug" %>

<% Debug.println(">>> Checkout"); %>

<center>
<h1><fmt:message key="checkout.header"/></h1>
<html:errors/>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><fmt:message key="checkout.hd1"/></TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="checkout.hd2"/></TD>
    <TD BGCOLOR=AAAAAA><fmt:message key="checkout.hd3"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="checkout.hd4"/></TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="checkout.hd5"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="checkout.hd6"/></TD>	
	<TD BGCOLOR=AAAAAA><fmt:message key="checkout.hd7"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="checkout.hd8"/></TD>
</TR>

<c:forEach var="item" items="${jvShoppingCart.items}">
	<tr>
		<html:form action="/Cart">
		<html:hidden property="item" value="${item.cartid}" />
		<td>${item.itemid}</td>	
		<td>${item.catalog}</td>
		<td>${item.sds}</td>
		<td>${item.quantity}</td>			 	 
		<td align=right>${item.price}</td>
		<td align=right>${item.total}</td>
		<td>
			<html:submit property="REMOVE">
				<fmt:message key="checkout.submit.remove"/>
			</html:submit>
		</td>	
		<td>
			<html:submit property="UPDATE">
				<fmt:message key="checkout.submit.update"/>
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
		<TD BGCOLOR="DDDDDD"><fmt:message key="checkout.tot1"/></TD>
		<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${jvShoppingCart.computeTotal}</TD>
	</TR>
</table>

<hr/>

<h1><fmt:message key="checkout.subsection.header"/></h1>

<% Debug.println("Checkout; stage 6"); %>

<html:form action="/Confirmed">
	<% Debug.println("Checkout; stage 7"); %>
	<html:submit property="SUBMIT">
		<fmt:message key="checkout.submit.confirmed"/>
	</html:submit>
	<% Debug.println("Checkout; stage 8"); %>
</html:form>

</center>

<% Debug.println("<<< Checkout"); %>

