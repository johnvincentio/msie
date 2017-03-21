
<%-- Welcome.jsp --%>

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body>

<logic:present name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<bean:define id="jvuser" name="<%= jvapp.Constants.USER_INFO_KEY %>"/>
	<H3>
		<bean:message key="welcome.welcome"/>
		: <bean:write name="jvuser" property="logonName"/>
	</H3>
	<html:errors/>

	<UL>
		<LI>
			<html:link forward="logoff">
				<bean:message key="welcome.signoff"/>
			</html:link>
		</LI>
	</UL>
</logic:present>

<logic:notPresent name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<H3>
		<bean:message key="welcome.welcome"/>
	</H3>
	<html:errors/>

	<UL>
		<LI>
			<html:link forward="logon">
				<bean:message key="welcome.signon"/>
			</html:link>
			<html:link forward="register">
				<bean:message key="welcome.register"/>
			</html:link>
		</LI>
	</UL>
</logic:notPresent>

<h3>
	<bean:message key="welcome.heading"/>
	<bean:message key="welcome.message"/>
</h3>

<IMG src='images/struts-power.gif' alt='Powered by Struts'>

</body>
</html:html>

