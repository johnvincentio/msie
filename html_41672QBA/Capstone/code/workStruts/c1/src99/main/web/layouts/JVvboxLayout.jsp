<%@ page import="java.util.Iterator"%>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%-- Layout component 
  Render a list on severals columns
  parameters : componentsList 
--%>
<%@ page import="jvapp.Debug" %>

<tiles:useAttribute id="list" name="componentsList" classname="java.util.List" />

<%-- Next will be a tag, as soon as tags allow include in iteration
  Wait until jsp1.3 --%>
<%
Debug.println(">>> JVvboxLayout.jsp");
Iterator i=list.iterator();
while( i.hasNext() )
  {
  String comp=(String)i.next();
	Debug.println("comp :"+comp+":");
%>
<tiles:insert name="<%=comp%>" flush="true" />
<br>

<%
  } // end loop
Debug.println("<<< JVvboxLayout.jsp");
%>

