<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>

<%--
<html:base/>
--%>

<base href="http://<%=request.getServerName()%>:
<%= request.getServerPort()%>/<%=request.getContextPath()%>/">


<link rel="stylesheet" type="text/css" href="tiles/layouts/BaseStyle.css">


<title><tiles:getAsString name="title"/></title>
<tiles:get name="header"/>
</head>

<body>
<tiles:get name="menu"/>
<tiles:get name="body"/>
</body>

<tiles:get name="footer"/>

</html:html>
