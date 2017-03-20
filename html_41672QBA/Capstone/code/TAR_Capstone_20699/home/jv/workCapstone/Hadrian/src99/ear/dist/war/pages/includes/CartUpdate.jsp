
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/fmt" prefix="fmt" %>

<body bgcolor="white">
<center>
<h1><fmt:message key="cartupdate.header"/></h1>
<html:errors/>

<table>
	<TR>
		<TD BGCOLOR=AAAAAA><fmt:message key="cartupdate.hd1"/></TD>
		<TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cartupdate.hd2"/></TD>
   	 <TD BGCOLOR=AAAAAA><fmt:message key="cartupdate.hd3"/></TD>
		<TD BGCOLOR=AAAAAA><fmt:message key="cartupdate.hd4"/></TD>			
   	 <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cartupdate.hd5"/></TD>
   	 <TD BGCOLOR=AAAAAA ALIGN=CENTER><fmt:message key="cartupdate.hd6"/></TD>	
		<TD BGCOLOR=AAAAAA><fmt:message key="cartupdate.hd7"/></TD>
		<TD BGCOLOR=AAAAAA>&nbsp;</TD>
	</TR>
	<tr>
		<html:form action="/Cart">
		<html:hidden property="item" value="${jvItem.cartid}" />
		<td>${jvItem.itemid}</td>	
		<td>${jvItem.catalog}</td>
		<td>${jvItem.sds}</td>
		<td>${jvItem.quantity}</td>			 	 
		<td ALIGN=RIGHT>${jvItem.price}</td>
		<td>
			<html:text property="quantity" size="3"/>
		</td>
		<td>
			<html:submit property="UPDATETHIS">
				<fmt:message key="cartupdate.update"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</table>
</center>
</body>
 
