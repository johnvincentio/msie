<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
	<font color="red">
		Error: Resource bundle not loaded
	</font>
</logic:notPresent>

<logic:forward name="main"/>

