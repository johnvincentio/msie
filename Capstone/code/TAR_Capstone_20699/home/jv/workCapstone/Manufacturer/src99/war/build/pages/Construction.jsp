
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html locale="true">
	<HEAD>
		<title><bean:message key="construction.title"/></title>
	</HEAD>

<body bgcolor="#ffffff" text="#000000" link="#023264" alink="#023264" vlink="#023264">
<table border="0" width="100%" cellspacing="5">
<tr>
  <td colspan="2">
	<%@ include file="/pages/includes/Header.jsp"%>
	</td>
</tr>
<tr>
  <td width="140" valign="top">
	<%@ include file="/pages/includes/ConstructionMenu.jsp"%>
  </td>
  <td valign="top"  align="left">
	<%@ include file="/pages/includes/ConstructionBody.jsp"%>
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

