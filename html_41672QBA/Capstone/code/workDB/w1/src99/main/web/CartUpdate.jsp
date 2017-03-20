
<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>

<CENTER>

<H1> Update Cart Item</H1>

<TABLE>
<TR>
	<TD BGCOLOR=AAAAAA>Stock ID</TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER>Catalog</TD>
    <TD BGCOLOR=AAAAAA>Description</TD>
	<TD BGCOLOR=AAAAAA>Items</TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER>Price</TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER>Total</TD>	
	<TD BGCOLOR=AAAAAA>Quantity</TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>
</TR>

<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="350" />
	<input type="hidden" name="item" value="${jvItem.cartid}" />
	<TD BGCOLOR=DDDDDD>${jvItem.itemid}</TD>	
	<TD BGCOLOR=DDDDDD>${jvItem.catalog}</TD>
	<TD BGCOLOR=DDDDDD>${jvItem.sds}</TD>
	<TD BGCOLOR=DDDDDD>${jvItem.quantity}</TD>			 	 
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${jvItem.price}</TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${jvItem.total}</TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE=text NAME="quantity" SIZE=3 value=""/>
	</TD>	
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="update" Value="Update"/>
	</TD>	
	</FORM>
</TR>
</TABLE>

<jsp:include page="ViewCatalogs.jsp" />

<jsp:include page="ViewCart.jsp" />

<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

