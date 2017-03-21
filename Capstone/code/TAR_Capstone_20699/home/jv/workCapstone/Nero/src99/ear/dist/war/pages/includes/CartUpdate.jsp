
<%-- CartUpdate.jsp --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<body bgcolor="white">
<center>
<h1><bean:message key="cartupdate.header"/></h1>
<html:errors/>

<bean:define id="jvItem" name="<%= jvapp.Constants.SHOPPING_CART_ITEM %>"
		scope="request"/>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="cartupdate.hd1"/></TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="cartupdate.hd2"/></TD>
    <TD BGCOLOR=AAAAAA><bean:message key="cartupdate.hd3"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="cartupdate.hd4"/></TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="cartupdate.hd5"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="cartupdate.hd6"/></TD>	
	<TD BGCOLOR=AAAAAA><bean:message key="cartupdate.hd7"/></TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>
</TR>
	<bean:define id="id" name="jvItem" property="cartid"/>
	<tr>
		<html:form action="/Cart">
		<html:hidden property="item" value="<%= String.valueOf(id) %>" />
		<td><bean:write name="jvItem" property="itemid"/></td>
		<td><bean:write name="jvItem" property="catalog"/></td>
		<td><bean:write name="jvItem" property="sds" filter="false"/></td>
		<td><bean:write name="jvItem" property="quantity"/></td>
		<td><bean:write name="jvItem" property="price"/></td>
		<td>
			<html:text property="quantity" size="3"/>
		</td>
		<td>
			<html:submit property="UPDATETHIS">
				<bean:message key="cartupdate.update"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>

</TABLE>

</center>
</body>
 
