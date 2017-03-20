<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:form action="/register">
	UserName:<html:text property="username"/><br>
	enter password:<html:password property="password1"/><br>
	re-enter password:<html:password property="password2"/><br>
	<html:submit value="Register"/>
</html:form>

