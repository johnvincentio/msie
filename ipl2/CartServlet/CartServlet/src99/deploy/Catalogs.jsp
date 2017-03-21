<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>
<jsp:useBean id="jvCatalogNames" class="jvbean.JVCatalogNames" scope="request"/>
<%@ page import="jvbean.JVCatalogName" %>
<%@ page import="java.util.*" %>

<CENTER>

<H1> Please choose from the following catalogs</H1>
   

<TABLE>
<TR>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER>Catalog</TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>	
</TR>

<% Iterator catalogNames = jvCatalogNames.getItems();
   while(catalogNames.hasNext()){
     JVCatalogName item = (JVCatalogName)catalogNames.next(); %>
<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="210" />
	<input type="hidden" name="item" value="<%=item.getCatalogid()%>" />
	<TD BGCOLOR=DDDDDD><%=item.getDs()%>              </TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="select" Value="Select">
	</TD>	
	</FORM>
</TR>
<% } %>

</TABLE>

<jsp:include page="ViewCart.jsp" />

<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

