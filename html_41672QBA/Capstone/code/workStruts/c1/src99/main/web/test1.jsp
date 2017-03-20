<%@ page import="jvapp.Debug" %>

<html>

<head>
<title>testing jsp:include</title>
</head>

<body>
before jsp_include
<jsp:include page="/jv1.jsp"/>
after jsp_include
<br>

<%
	String selectedName="/jv2.jsp";
%>
(1) before jsp_include
<jsp:include page="<%=selectedName%>"/>
(1) after jsp_include
<br>

<%
	String jvName=request.getParameter("jvtest");
	Debug.println("jvName :"+jvName+":");
%>
(2) before jsp_include
<jsp:include page="<%=jvName%>"/>
(2) after jsp_include
<br>


</body>

<%@ include file="/pages/Parameters.jsp"%>

</html>
