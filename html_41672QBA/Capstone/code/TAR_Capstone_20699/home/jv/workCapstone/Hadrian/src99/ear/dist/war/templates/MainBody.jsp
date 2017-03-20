
<%@ page import="java.util.*" %>
<%@ page import="jvdebug.Debug" %>
<%@ page import="jvtemplate.JVSubBody" %>
<%@ page import="jvtemplate.JVColumn" %>

<% Debug.println(">>> MainBody"); %>

<jsp:useBean id="jvTemplates" class="jvtemplate.JVTemplate" scope="request"/>
<table>
	<tr>
<%
		Debug.println("MainBody 1");
		Iterator subbodies = jvTemplates.getBody().getSubbodies();
		while(subbodies.hasNext()){
			JVSubBody subbody = (JVSubBody)subbodies.next();
			Debug.println("MainBody 2");
%>
			<td valign="top">
<%
				Iterator columns = subbody.getColumns();
				while(columns.hasNext()){
					JVColumn column = (JVColumn) columns.next();
					Debug.println("MainBody 3");
%>
					<jsp:include page="<%=column.getFile()%>"/>
					<br/>
<%
				}
%>
			</td>
<%
		}
%>
	</tr>
</table>

<% Debug.println("<<< MainBody"); %>

