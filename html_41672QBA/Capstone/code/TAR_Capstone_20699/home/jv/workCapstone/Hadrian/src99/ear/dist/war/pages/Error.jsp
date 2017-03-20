
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<%@ taglib prefix="fmt" uri="/tags/fmt" %>

<html:html>
<head>
<title><fmt:message key="errors.error.title"/></title>
<html:base/>
</head>

<body bgcolor="white">
<center>

<h3><fmt:message key="errors.error.header"/></h3>
<html:errors/>

<br/>
<h3><fmt:message key="errors.error.body"/></h3>

</center>
</body>
</html:html>

