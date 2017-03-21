
<%-- Catalogs.jsp --%>

<%--

	Looks a lot worse than it actually is.

1. Always just include the taglibs - clean up later.

2. Use Struts taglibs. Thus <html:html> not <html>

3.  <bean:message key="catalogs.title"/> uses Struts bean taglib.
		Gets property value for property name="catalogs.title" from 
		resources/application.properties, which is somewhere on the
		classpath.
		My template enforces a location, 
			/WEB-INF/resources/application.properties

4.  <bean:define id="CatalogNames" 
		name="<%= jvapp.Constants.CATALOGNAMES_KEY %>"
		scope="request"/>
	Get that name thing sorted first, looks confusing but actually prevents
	some silly typos as well as confusing the stuffing out of me at times.
	Lookup the named attribute and call it "CatalogNames".

5.  <logic:iterate id="item" type="jvapp.JVCatalogName"
			name="CatalogNames" property="items">
	Iterate over the bean called CatalogNames, each item is given a name "item"
	and is of class "jvapp.JVCatalogName". Each item is retrieved using 
	property "items", or bean("CatalogNames").getItems(), which must return 
	an iterator.

6.  <bean:define id="id" name="item" property="catalogid"/>
	id = item.getCatalogid()

7.  <html:form action="/SelectCatalog">
	Post to Action class specified by action mapping in struts-config.xml

       <action 
            path="/SelectCatalog"
            type="jvapp.CatalogAction"
            name="catalogForm"    
            scope="request"
            validate="true"
            input="/pages/Catalogs.jsp">
            <forward name="success" path="/pages/CatalogItems.jsp"/>
            <forward name="failure" path="/pages/Error.jsp"/>
        </action>

    <form-beans>

        <form-bean name="catalogForm" type="jvapp.CatalogForm"/>

    </form-beans>

	This path can only be reached from input="/pages/Catalogs.jsp"
	jvapp.CatalogAction will handle the event, form data will be send and
	validated in catalogForm, which is actually jvapp.CatalogForm.

8.  <html:hidden property="catalogid" value="<%= String.valueOf(id) %>" />
		Create a form property "catalogid" and give it the String
		value of id, which was created at (6).

9.  <bean:write name="item" property="ds" filter="false"/>
		item.getDs(), where item has been defined at (5).

10.  <html:submit><bean:message key="catalogs.submit"/></html:submit>
		Do a POST
		<html:reset> is also available, which invoked ActionForm.reset()

11.	This form sends one property to the ActionForm class, 
		namely catalogid.
	The value of this property is retrieved in the Action class by
		getting the attributes property from the ActionForm class.

12.  <%@ include file="ViewCart.jsp" %>
		This seems to be the way to include JSPs files. No other way
		seemed to work, not sure why, but there it is.

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html>
<head>
<title><bean:message key="catalogs.title"/></title>
<html:base/>
</head>

<body bgcolor="white">
<center>
<h1><bean:message key="catalogs.header"/></h1>
<html:errors/>

<bean:define id="CatalogNames" name="<%= jvapp.Constants.CATALOGNAMES_KEY %>"
		scope="request"/>

<table>
	<tr>
		<th bgcolor=AAAAAA align=center>
			<bean:message key="catalogs.catalog"/></th>
		<th bgcolor=AAAAAA align=center>
			<bean:message key="catalogs.option"/></th>
	</tr>

<logic:iterate id="item" type="jvapp.JVCatalogName"
			name="CatalogNames" property="items">
	<bean:define id="id" name="item" property="catalogid"/>
	<tr>
		<html:form action="/SelectCatalog">
			<html:hidden property="catalogid" value="<%= String.valueOf(id) %>" />
			<td><bean:write name="item" property="ds" filter="false"/></td>
			<td><html:submit>
				<bean:message key="catalogs.submit"/>
			</html:submit></td>	
		</html:form>
	</tr>
</logic:iterate>

</table>

<%@ include file="ViewCart.jsp" %>
<%@ include file="ViewLogout.jsp" %>
<%@ include file="ViewHome.jsp" %>
<%@ include file="Parameters.jsp" %>

</center>
</body>
</html:html>

