
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<html:errors/>

<bean:define id="collection"
		name="<%= jvapp.Constants.COLLECTION_INFO_KEY %>"
		type="jvcommon.JVCollection" scope="request"/>

<%
	Debug.println(">>> SendCollection.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("SendCollection");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("SendCollection");
%>

<center>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="products.hd1"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="products.hd2"/></TD>
</TR>

<tr>
	<td><bean:write name="collection" property="collectionid"/></td>
	<td><bean:write name="collection" property="description" filter="false"/></td>
</tr>
</table>
</center>

<br/>
<%
	int nCollection = collection.getCollectionid();
	String strLink = "/SendCollection.do?action=Send1&id=" + nCollection;
%>
<html:link page="<%=strLink%>">Send with SAAJ; one record/send</html:link>

<br/>
<%
	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send2&id=" + nCollection;
%>
<html:link page="<%=strLink%>">Send with SAAJ; all records at once</html:link>

<br/>
<%
	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send3&id=" + nCollection;
%>
<html:link page="<%=strLink%>">Send to MDB as XML</html:link>

<br/>
<%
	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send4&id=" + nCollection;
%>
<html:link page="<%=strLink%>">Send to MDB as ObjectMessage</html:link>

<br/>
<%
	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send5&id=" + nCollection;
%>
<html:link page="<%=strLink%>">Send to JAX-RPC WebService as XML</html:link>

<br/>

