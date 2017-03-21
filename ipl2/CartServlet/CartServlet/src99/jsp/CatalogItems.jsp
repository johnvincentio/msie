
<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>
<jsp:useBean id="jvCatalog" class="jvbean.JVCatalog" scope="request"/>
<%@ page import="jvbean.JVCatalogItem" %>
<%@ page import="java.util.*" %>

<CENTER>

<H1> Contents of Catalog </H1>

<TABLE>
<TR>
	<TD BGCOLOR=AAAAAA>Stock ID</TD>
    <TD BGCOLOR=AAAAAA>Title</TD>
    <TD BGCOLOR=AAAAAA>Description</TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER>Price</TD>
	<TD BGCOLOR=AAAAAA>Quantity</TD>
	<TD BGCOLOR=AAAAAA>Add</TD>
</TR>
<% Iterator catalogItems = jvCatalog.getItems();
   while(catalogItems.hasNext()){
     JVCatalogItem item = (JVCatalogItem)catalogItems.next(); %>
<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="240" />
	<input type="hidden" name="item" value="<%=item.getItemid()%>" />
	<TD BGCOLOR=DDDDDD><%=item.getItemid()%>  		</TD>	
	<TD BGCOLOR=DDDDDD><%=item.getSds()%>       </TD>
	<TD BGCOLOR=DDDDDD><%=item.getLds()%>       </TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT><%=item.getPrice()%></TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE=text NAME="quantity" SIZE=2 value="">
	</TD>	
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="add" Value="Add">
	</TD>	
	</FORM>
<% } %>
</TR>
</TABLE>

<jsp:include page="ViewCatalogs.jsp" />

<jsp:include page="ViewCart.jsp" />

<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

