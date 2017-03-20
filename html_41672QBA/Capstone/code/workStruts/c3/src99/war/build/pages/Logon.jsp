
<%-- Logon.jsp --%>

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html:html>
<head>
<title><bean:message key="logon.title"/></title>
<html:base/>
</head>

<body>
<center>
<h1><bean:message key="logon.title"/></h1>
<html:errors/>

<html:form action="/LogonSubmit" focus="username">

<table border="0">
<tr>
	<th bgcolor=AAAAAA align="right">
		<bean:message key="logon.username"/></th>
	<td align="left"><html:text property="username"/></td>
</tr>
<tr>
	<th bgcolor=AAAAAA align="right">
		<bean:message key="logon.password"/></th>
	<td align="left"><html:password property="password"/></td>
</tr>
</table>

<p>
<html:submit><bean:message key="logon.submit"/></html:submit>
<html:reset><bean:message key="logon.reset"/></html:reset>
</p>

</html:form>

<%@ include file="Parameters.jsp" %>

</center>
</body>
</html:html>

