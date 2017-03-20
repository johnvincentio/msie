
<%-- Register.jsp --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="register.title"/></title>
<html:base/>
</head>

<body bgcolor="white">
<center>
<h1><bean:message key="register.title"/></h1>

<html:errors/>

<html:form action="/SaveRegister" focus="email">

<table>

<tr>
	<th align="right"><bean:message key="register.email"/></th>
	<td align="left"><html:text property="email" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.password"/></th>
	<td align="left"><html:password property="password" size="20"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.firstname"/></th>
	<td align="left"><html:text property="firstname" size="20"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.middle"/></th>
	<td align="left"><html:text property="middle" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.lastname"/></th>
	<td align="left"><html:text property="lastname" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.faddress"/></th>
	<td align="left"><html:text property="faddress" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.laddress"/></th>
	<td align="left"><html:text property="laddress" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.city"/></th>
	<td align="left"><html:text property="city" size="25"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.state"/></th>
	<td align="left"><html:text property="state" size="2"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.zip"/></th>
	<td align="left"><html:text property="zip" size="5"/></td>
</tr>
<tr>
	<th align="right"><bean:message key="register.phone"/></th>
	<td align="left"><html:text property="phone" size="11"/></td>
</tr>

</table>

<p>
<html:submit><bean:message key="register.submit"/></html:submit>
<html:reset><bean:message key="register.reset"/></html:reset>
<html:cancel><bean:message key="register.cancel"/></html:cancel>
</p>

</html:form>

</center>
</body>

</html:html>


