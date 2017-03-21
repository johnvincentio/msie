
<%-- Checkout.jsp --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="checkout.title"/></title>
<html:base/>
</head>

<body bgcolor="white">
<center>
<h1><bean:message key="checkout.header"/></h1>
<html:errors/>

<bean:define id="jvShoppingCart" name="<%= jvapp.Constants.SHOPPING_CART %>"
		scope="request"/>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="checkout.hd1"/></TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="checkout.hd2"/></TD>
    <TD BGCOLOR=AAAAAA><bean:message key="checkout.hd3"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="checkout.hd4"/></TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="checkout.hd5"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="checkout.hd6"/></TD>	
	<TD BGCOLOR=AAAAAA><bean:message key="checkout.hd7"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="checkout.hd8"/></TD>
</TR>

<logic:iterate id="item" type="jvapp.JVItem"
			name="jvShoppingCart" property="items">
	<bean:define id="id" name="item" property="cartid"/>
	<tr>
		<html:form action="/Cart">
		<html:hidden property="item" value="<%= String.valueOf(id) %>" />
		<td><bean:write name="item" property="itemid"/></td>
		<td><bean:write name="item" property="catalog"/></td>
		<td><bean:write name="item" property="sds" filter="false"/></td>
		<td><bean:write name="item" property="quantity"/></td>
		<td><bean:write name="item" property="price"/></td>
		<td><bean:write name="item" property="total"/></td>
		<td>
			<html:submit property="REMOVE">
				<bean:message key="checkout.submit.remove"/>
			</html:submit>
		</td>	
		<td>
			<html:submit property="UPDATE">
				<bean:message key="checkout.submit.update"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</logic:iterate>

     <TR>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD>&nbsp;</TD>
		<TD BGCOLOR="DDDDDD"><bean:message key="checkout.tot1"/></TD>
		<TD BGCOLOR=DDDDDD ALIGN=RIGHT>
			<bean:write name="jvShoppingCart" property="computeTotal"/>
		</TD>
	</TR>
</table>

<hr/>

<h1 align="CENTER">
	<bean:message key="checkout.subsection.header"/>
</h1>
We are sorry, but our electronic credit-card-processing
system is currently out of order. Please send a check to:
<PRE>
	Marty Hall 
	coreservlets.com, Inc.  
	6 Meadowsweet Ct., 
	Suite B1 Reisterstown, 
	MD 21136-6020 410-429-5535 
	hall@coreservlets.com 
</PRE> 
Since we have not yet calculated shipping charges, please 
sign the check but do not fill in the amount. We will 
generously do that for you.

<%@ include file="ViewLogout.jsp" %>
<%@ include file="ViewHome.jsp" %>
<%@ include file="Parameters.jsp" %>

</center>

</body>
</html:html>

