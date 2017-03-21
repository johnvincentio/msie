
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>

<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<bean:define id="jvTemplate" name="<%= jvapp.Constants.TEMPLATE_INFO_KEY %>" 
	type="jvtemplate.JVTemplate" scope="request"/>

<%
	Debug.println(">>> Main.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("Main");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("Main");
%>

<html:html locale="true">
<head>
	<title><%=jvTemplate.getTitle()%></title>
	<html:base/>
</head>

<body bgcolor="#ffffff" text="#000000" link="#023264" alink="#023264" vlink="#023264">
<table border="0" width="100%" cellspacing="5">
	<tr>
		<td colspan="2">
			<jsp:include page="<%=jvTemplate.getHeader().getFile()%>"/>
		</td>
	</tr>
	<tr>
		<td width="140" valign="top">
			<jsp:include page="<%=jvTemplate.getMenu().getFile()%>"/>
		</td>
		<td valign="top"  align="left">
			<jsp:include page="<%=jvTemplate.getBody().getFile()%>"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="<%=jvTemplate.getFooter().getFile()%>"/>
		</td>
	</tr>
</table>

</body>

</html:html>

