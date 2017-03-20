
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="jvapp.Debug" %>

<center>

<h1><bean:message key="logon.title"/></h1>

<%--
<h1>Some title</h1>
--%>
<html:errors/>

<html:form action="/LogonSubmit" focus="username">

<%
Debug.println("in logon.jsp");
%>

<table border="0">
<tr>
	<th bgcolor=AAAAAA align="right">Username</th>
	<td align="left"><html:text property="username"/></td>
</tr>
<tr>
	<th bgcolor=AAAAAA align="right">Password</th>
	<td align="left"><html:password property="password"/></td>
</tr>
</table>

<p>
<html:submit>Submit</html:submit>
<html:reset>Reset</html:reset>
</p>

</html:form>

</center>

