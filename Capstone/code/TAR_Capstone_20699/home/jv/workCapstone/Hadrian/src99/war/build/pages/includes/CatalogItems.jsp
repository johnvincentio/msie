
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/fmt" prefix="fmt" %>
<%@ taglib uri="/tags/c" prefix="c" %>

<body bgcolor="white">
<center>
<h1><fmt:message key="catalogitems.header"/></h1>
<html:errors/>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><fmt:message key="catalogitems.hd1"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="catalogitems.hd2"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="catalogitems.hd3"/></TD>
	<TD BGCOLOR=AAAAAA align=center><fmt:message key="catalogitems.hd4"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="catalogitems.hd5"/></TD>
	<TD BGCOLOR=AAAAAA><fmt:message key="catalogitems.hd6"/></TD>
</TR>

<c:forEach var="item" items="${jvCatalog.items}">
	<tr>
		<html:form action="/CatalogItemsAdd">
		<html:hidden property="itemid" value="${item.itemid}" />
		<td>${item.itemid}</td>	
		<td>${item.sds}</td>
		<td>${item.lds}</td>
		<td align=right>${item.price}</td>
		<td><html:text property="quantity" size="3"/></td>
		<td>
			<html:submit>
				<fmt:message key="catalogitems.add"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</c:forEach>

</table>
</center>
</body>
 
