
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<%@ page import="jvdebug.Debug" %>

<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<jsp:useBean id="jvTemplates" class="jvtemplate.JVTemplate" scope="request"/>

<%
	Debug.println(">>> Main.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("Main");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("Main");
%>

<html:html locale="true">
<head>
	<title><%=jvTemplates.getTitle()%></title>
	<html:base/>
</head>

<body bgcolor="#ffffff" text="#000000" link="#023264" alink="#023264" vlink="#023264">
<table border="0" width="100%" cellspacing="5">
	<tr>
		<td colspan="2">
			<% Debug.println("Main.jsp; stage 1"); %>
			<jsp:include page="<%=jvTemplates.getHeader().getFile()%>"/>
			<% Debug.println("Main.jsp; stage 2"); %>
		</td>
	</tr>
	<tr>
		<td width="140" valign="top">
			<% Debug.println("Main.jsp; stage 3"); %>
			<jsp:include page="<%=jvTemplates.getMenu().getFile()%>"/>
			<% Debug.println("Main.jsp; stage 4"); %>
		</td>
		<td valign="top"  align="left">
			<% Debug.println("Main.jsp; stage 5"); %>
			<jsp:include page="<%=jvTemplates.getBody().getFile()%>"/>
			<% Debug.println("Main.jsp; stage 6"); %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<% Debug.println("Main.jsp; stage 7"); %>
			<jsp:include page="<%=jvTemplates.getFooter().getFile()%>"/>
			<% Debug.println("Main.jsp; stage 8"); %>
		</td>
	</tr>
</table>

</body>

</html:html>

