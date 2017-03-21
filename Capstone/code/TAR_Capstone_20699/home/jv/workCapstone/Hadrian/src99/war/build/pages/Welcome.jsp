
<%-- Welcome.jsp --%>

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ taglib prefix="fmt" uri="/tags/fmt" %>

<html:html>
<head>
<title><fmt:message key="welcome.title"/></title>
<html:base/>
</head>
<body>

<logic:present name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<bean:define id="jvuser" name="<%= jvapp.Constants.USER_INFO_KEY %>"/>
	<H3>
		<fmt:message key="welcome.welcome"/>
		: <bean:write name="jvuser" property="logonName"/>
	</H3>
	<html:errors/>

	<UL>
		<LI>
			<html:link forward="logoff">
				<fmt:message key="welcome.signoff"/>
			</html:link>
		</LI>
	</UL>
</logic:present>

<logic:notPresent name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<H3>
		<fmt:message key="welcome.welcome"/>
	</H3>
	<html:errors/>

	<UL>
		<LI>
			<html:link forward="logon">
				<fmt:message key="welcome.signon"/>
			</html:link>
			<html:link forward="register">
				<fmt:message key="welcome.register"/>
			</html:link>
		</LI>
	</UL>
</logic:notPresent>

<h3>
	<fmt:message key="welcome.heading"/>
	<fmt:message key="welcome.message"/>
</h3>

<html:img page="/pages/images/struts-power.gif" align="right" border="0"/>

</body>
</html:html>

