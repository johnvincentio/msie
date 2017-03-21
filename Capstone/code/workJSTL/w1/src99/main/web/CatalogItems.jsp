<%@ taglib uri="/tags/c.tld" prefix="c" %>

<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>

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
<c:forEach var="item" items="${jvCatalog.items}">
<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="240" />
	<input type="hidden" name="item" value="${item.itemid}" />
	<TD BGCOLOR=DDDDDD>${item.itemid}</TD>	
	<TD BGCOLOR=DDDDDD>${item.sds}</TD>
	<TD BGCOLOR=DDDDDD>${item.lds}</TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${item.price}</TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE=text NAME="quantity" SIZE=2 value="">
	</TD>	
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="add" Value="Add">
	</TD>	
	</FORM>
</c:forEach>
</TR>
</TABLE>

<jsp:include page="ViewCatalogs.jsp" />

<jsp:include page="ViewCart.jsp" />

<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

