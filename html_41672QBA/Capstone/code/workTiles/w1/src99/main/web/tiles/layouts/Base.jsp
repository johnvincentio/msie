<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>
<base href="http://<%=request.getServerName()%>:
<%= request.getServerPort()%>/<%=request.getContextPath()%>/">

<link rel="stylesheet" type="text/css" href="tiles/layouts/BaseStyle.css">
</head>

<body>

<div id="masthead"> 
  <h1 class="style1" id="siteName">John Vincent</h1> 
  <div id="globalNav"> 
    <a href="index.html">Home </a> | <a href="Courses.html">Courses</a> | <a href="Assignments.html">Assignments</a> | <a href="CurrentProjects.html">Projects</a> | <a href="About.html">About</a> 
  </div> 
</div> 




<title><tiles:getAsString name="title"/></title>
<tiles:get name="header"/>

<tiles:get name="menu"/>
<tiles:get name="body"/>
</body>

<tiles:get name="footer"/>

</html:html>
