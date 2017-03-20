<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fo="http://www.w3.org/1999/XSL/Format">
<xsl:output method="html" indent="yes"/>

<xsl:include href="jvtypes.xsl"/>
<xsl:include href="addActivity.xsl"/>
<xsl:include href="addQuery.xsl"/>

<xsl:template match="/">
	<html>
		<xsl:call-template name="makeTitle"/>
		<body>
			<xsl:call-template name="makeHeader"/>
			<xsl:apply-templates />
		</body>
		<xsl:call-template name="gotoTop"/>
		<xsl:call-template name="makeAddHeader"/>
		<xsl:call-template name="addActivity"/>
		<xsl:call-template name="gotoTop"/>
		<xsl:call-template name="makeQueryHeader"/>
		<xsl:call-template name="addQuery"/>
		<xsl:call-template name="gotoTop"/>
	</html>
</xsl:template>

<xsl:template match="Project">
	<h2>Project: 
		<xsl:value-of select="Description" />
		<br/>Id: <xsl:value-of select="Projectid" />
	</h2>
	<br/>
	<table xsl:use-attribute-sets="table-style">
		<tr>
			<form>
				<xsl:attribute name="method">POST</xsl:attribute>
				<th><input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">Id</xsl:attribute>
					<xsl:attribute name="value">Id</xsl:attribute>
				</input></th>
				<th><input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">Duration</xsl:attribute>
					<xsl:attribute name="value">Dur</xsl:attribute>
				</input></th>
				<th><input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">Priority</xsl:attribute>
					<xsl:attribute name="value">Priority</xsl:attribute>
				</input></th>
				<th><input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">Status</xsl:attribute>
					<xsl:attribute name="value">Status</xsl:attribute>
				</input></th>
				<th><input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">Description</xsl:attribute>
					<xsl:attribute name="value">Description</xsl:attribute>
				</input></th>
				<th>Edit</th>
				<th>Delete</th>
			</form>
		</tr>
		<xsl:apply-templates select="Activity"/>
	</table>
</xsl:template>

<xsl:template match="Activity">
	<tr xsl:use-attribute-sets="activity-row-style">
		<form>
			<xsl:attribute name="method">POST</xsl:attribute>
			<input>
				<xsl:attribute name="type">hidden</xsl:attribute>
				<xsl:attribute name="name">Activityid</xsl:attribute>
				<xsl:attribute name="value">
					<xsl:value-of select="Activityid" />
				</xsl:attribute>
			</input>
			<td><xsl:value-of select="Activityid" /></td>
			<td><xsl:value-of select="Duration" /></td>
			<td><xsl:value-of select="Priority" /></td>
			<td><xsl:value-of select="Status" /></td>
			<td><xsl:value-of select="Description" /></td>
			<td>
				<input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">edit</xsl:attribute>
					<xsl:attribute name="value">Edit</xsl:attribute>
				</input>
			</td>	
			<td>
				<input>
					<xsl:attribute name="type">submit</xsl:attribute>
					<xsl:attribute name="name">delete</xsl:attribute>
					<xsl:attribute name="value">Delete</xsl:attribute>
				</input>
			</td>	
		</form>
	</tr>
</xsl:template>

</xsl:stylesheet>

