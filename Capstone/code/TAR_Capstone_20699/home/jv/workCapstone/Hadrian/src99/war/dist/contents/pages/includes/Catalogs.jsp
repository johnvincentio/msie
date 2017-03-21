
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/c" prefix="c" %>
<%@ taglib uri="/tags/fmt" prefix="fmt" %>

<body bgcolor="white">
<center>
<h1><fmt:message key="catalogs.header"/></h1>
<html:errors/>

<table>
	<tr>
		<th bgcolor=AAAAAA align=center>
			<fmt:message key="catalogs.catalog"/></th>
		<th bgcolor=AAAAAA align=center>
			<fmt:message key="catalogs.option"/></th>
	</tr>

	<c:forEach var="item" items="${CatalogNames.items}">
	<tr>
		<html:form action="/SelectCatalog">
			<html:hidden property="catalogid" value="${item.catalogid}" />
			<td>${item.ds}</td>
			<td><html:submit>
				<fmt:message key="catalogs.submit"/>
			</html:submit></td>	
		</html:form>
	</tr>
	</c:forEach>

</table>

</center>
</body>

