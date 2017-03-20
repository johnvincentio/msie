<%@ page info="a hello world example"%>
<%--
<%@ taglib uri="http://wendtstud1.hpi.uni-potsdam.de/jsp/hello"
	prefix="hpi"%>
--%>

<%@ taglib uri="/tags/JVTags.tld" prefix="jv" %>
<%@ taglib uri="/tags/c.tld" prefix="c" %>

<html>
	<head><title>Hello, World</title></head>
<body>
	<h1>Hello, World!</h1>
	<p>
	<%
		if ( request.getParameter("user")!= null ){
	%>
	Your name is:<%=request.getParameter("user")%>.
	Your password is:<%=request.getParameter("password")%>.
	<%
	} else {
	%>
	You won't tell me your name.
	<%
		}
	%>
	</p>
	<p>Your name is <jv:greet param="user"/></p>
	<p>Some greeting is <jv:hi/></p>
</body>
</html>

