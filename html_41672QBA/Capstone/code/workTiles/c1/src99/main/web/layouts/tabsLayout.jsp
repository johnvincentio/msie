<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%-- 
  Tabs Layout .
  This layout allows to render several tiles in a tabs fashion.
  @param tabList A list of available tabs. We use MenuItem to carry data (name, body, icon, ...)
  @param selectedIndex Index of default selected tab
  @param parameterName Name of parameter carrying selected info in http request.
--%>

<%-- 
Use tiles attributes, and declare them as page java variable.
These attribute must be passed to the tile. 
--%>
<%@ page import="jvapp.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<tiles:useAttribute name="parameterName" classname="java.lang.String" />
<tiles:useAttribute id="selectedIndexStr" name="selectedIndex" ignore="true" classname="java.lang.String" />
<tiles:useAttribute name="tabList" classname="java.util.List" />
<%
	Debug.println(">>> tabsLayout.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("tabsLayout");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("tabsLayout");

	String selectedColor="#98ABC7";
	String notSelectedColor="#C0C0C0";
  
	int index = 0; // Loop index
	int selectedIndex = 0;
// Check if selected come from request parameter
	Debug.println("stage 1");
	try {
		selectedIndex = Integer.parseInt(selectedIndexStr);
		Debug.println("stage 2");
		selectedIndex = Integer.parseInt(request.getParameter( parameterName ));
		Debug.println("stage 3");
	}
	catch( java.lang.NumberFormatException ex )
	{ // do nothing
		Debug.println("stage 4");
	}

// Check selectedIndex bounds
	Debug.println("stage 5");
	if (selectedIndex < 0 || selectedIndex >= tabList.size())
		selectedIndex = 0;
	Debug.println("selectedIndex "+selectedIndex);
	String selectedBody = ((org.apache.struts.tiles.beans.MenuItem)tabList.get(selectedIndex)).getLink(); // Selected body
	Debug.println("selectedBody :"+selectedBody+":");
%>

<table border="0"  cellspacing="0" cellpadding="0">
  <%-- Draw tabs --%>
<tr>
  <td width="10">&nbsp;</td>
  <td>
    <table border="0"  cellspacing="0" cellpadding="5">
      <tr>

<logic:iterate id="tab" name="tabList" type="org.apache.struts.tiles.beans.MenuItem" >
<% // compute href
	Debug.println("stage 10");
String href = request.getRequestURI() + "?"+parameterName + "=" + index;
	Debug.println("href :"+href+":");
    // Don't add request URI prefix , but let the client compute the original URL
	// This allows to use a Struts action as page URL, and perform a forward.
	// Bug reported by Don Peterkofsky 
  //String href = "" + "?"+parameterName + "=" + index;

	String color = notSelectedColor;
	Debug.println("selectedIndex (2) "+selectedIndex);
	if( index == selectedIndex ) {
		Debug.println("stage 11");
		selectedBody = tab.getLink();
		color = selectedColor;
	} // enf if
	Debug.println("selectedBody (2):"+selectedBody+":");
	Debug.println("color :"+color+":");
	index++;
	Debug.println("index:"+index+":");
	Debug.println("stage 12");
%>
  <td bgcolor="<%=color%>">
  <a href="<%=href%>" ><%=tab.getValue()%></a>
  </td>
  <td width="1" ></td>
  
</logic:iterate>
      </tr>
    </table>
  </td>
  <td width="10" >&nbsp;</td>
</tr>

<tr>
  <td height="5" bgcolor="<%=selectedColor%>" colspan="3" >&nbsp;</td>
</tr>  

  <%-- Draw body --%>
<tr>

<%
	Debug.println("selectedColor (3):"+selectedColor+":");
	Debug.println("selectedBody (3):"+selectedBody+":");
%>

  <td width="10" bgcolor="<%=selectedColor%>">&nbsp;</td>
  <td>
  <tiles:insert name="<%=selectedBody%>" flush="true" />

<%--
  <tiles:insert name="/pages/tabs/tab1.jsp" flush="true" />
--%>
  </td>
  <td width="10" bgcolor="<%=selectedColor%>">&nbsp;</td>
</tr>  

<tr>
  <td height="5" bgcolor="<%=selectedColor%>" colspan="3" >&nbsp;</td>
</tr>  

</table>
<%
	Debug.println("<<< tabsLayout.jsp");
%>
