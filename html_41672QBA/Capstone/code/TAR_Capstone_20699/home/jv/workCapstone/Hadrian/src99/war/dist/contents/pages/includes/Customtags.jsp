
<%@ taglib uri="/tags/fmt" prefix="fmt" %>
<%@ taglib uri="/tags/JVTags" prefix="jv" %>

<center>
<h1><fmt:message key="main.title"/></h1>

<p>This page test a custom tag library<p>

<p>Some greeting follows: <jv:hi/></p>

<p>Your user name is <jv:greet param="jvTaguser"/></p>

</center>

