
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvdebug.Debug" %>

<% Debug.println(">>> Checkout"); %>

<center>
<h1><bean:message key="checkout.header"/></h1>
<html:errors/>

<% Debug.println("Checkout; stage 1"); %>

<bean:define id="jvShoppingCart" name="<%= jvapp.Constants.SHOPPING_CART %>"
		scope="request"/>

<% Debug.println("Checkout; stage 2"); %>

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

<% Debug.println("Checkout; stage 3"); %>

<logic:iterate id="item" type="jvcart.JVItem"
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

<% Debug.println("Checkout; stage 4"); %>

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

<% Debug.println("Checkout; stage 5"); %>

<h1><bean:message key="checkout.subsection.header"/></h1>

<% Debug.println("Checkout; stage 6"); %>

<html:form action="/Confirmed">
	<% Debug.println("Checkout; stage 7"); %>
	<html:submit property="SUBMIT">
		<bean:message key="checkout.submit.confirmed"/>
	</html:submit>
	<% Debug.println("Checkout; stage 8"); %>
</html:form>

</center>

<% Debug.println("<<< Checkout"); %>

