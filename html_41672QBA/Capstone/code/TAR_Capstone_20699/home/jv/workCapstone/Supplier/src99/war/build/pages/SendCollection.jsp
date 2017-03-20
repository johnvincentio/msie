
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>

<html:html locale="true">
<head>
	<title><bean:message key="main.title"/></title>
	<html:base/>
</head>

<body bgcolor="#ffffff" text="#000000" link="#023264" alink="#023264" vlink="#023264">
<table border="0" width="100%" cellspacing="5">
	<tr>
		<td colspan="2">
			<%@ include file="/pages/includes/Header.jsp"%>
		</td>
	</tr>
	<tr>
		<td width="140" valign="top">
			<%@ include file="/pages/includes/MainMenu.jsp"%>
		</td>
		<td valign="top"  align="left">
			<jsp:include page="/pages/includes/SendCollection.jsp"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="/pages/includes/Footer.jsp"%>
		</td>
	</tr>
</table>

</body>

</html:html>

