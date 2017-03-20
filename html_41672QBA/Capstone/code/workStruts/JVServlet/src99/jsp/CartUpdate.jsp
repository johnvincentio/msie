
<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>

<jsp:useBean id="jvItem" class="jvbean.JVItem" scope="request"/>
<%@ page import="java.util.*" %>

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
	<input type="hidden" name="item" value="<%=jvItem.getCartid()%>" />
	<TD BGCOLOR=DDDDDD><%=jvItem.getItemid()%>  		</TD>	
	<TD BGCOLOR=DDDDDD><%=jvItem.getCatalog()%>              </TD>
	<TD BGCOLOR=DDDDDD><%=jvItem.getSds()%>       </TD>
	<TD BGCOLOR=DDDDDD><%=jvItem.getQuantity()%>  		</TD>			 	 
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT><%=jvItem.getPrice()%></TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT><%=jvItem.getPrice() * jvItem.getQuantity()%></TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE=text NAME="quantity" SIZE=3 value="">
	</TD>	
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="update" Value="Update">
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

