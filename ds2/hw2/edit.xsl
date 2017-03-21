<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>

<xsl:include href="jvtypes.xsl"/>

<xsl:param name="EditActivityId" select="'_70'"/>

<xsl:template match="/">
	<html>
		<xsl:call-template name="makeTitle"/>
		<body>
			<xsl:call-template name="makeHeader"/>
			<xsl:apply-templates />
		</body>
	</html>
</xsl:template>

<xsl:template match="Project">
	<h2 align="center">Project: 
		<xsl:value-of select="Description" />
		<br/>Id: <xsl:value-of select="Projectid" />
	</h2>
	<h3>
		<xsl:text>Edit Activity Id: </xsl:text>
		<xsl:value-of select="$EditActivityId"/>
	</h3>
	<br/>
	<xsl:apply-templates select="Activity"/>
</xsl:template>

<xsl:template match="Activity">
<!--
	<br/>Actid:<xsl:value-of select="Activityid" />:
	<br/>Req_Id:<xsl:value-of select="$EditActivityId" />:
	<br/>Name():<xsl:value-of select="name()" />:
-->
	<xsl:if test="Activityid = $EditActivityId">
		<xsl:call-template name="EditActivity"/>
	</xsl:if>
</xsl:template>

<!-- EditActivity	-->

<xsl:template name="EditActivity">
<!--	<br/> >>>editactivity	-->
	<table xsl:use-attribute-sets="table-style">
		<tr>
			<th>Id</th>
			<th>Dur</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Description</th>
			<th>Edit</th>
		</tr>
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
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Duration</xsl:attribute>
						<xsl:attribute name="value">
							<xsl:value-of select="Duration" />
						</xsl:attribute>
						<xsl:attribute name="size">5</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Priority</xsl:attribute>
						<xsl:attribute name="value">
							<xsl:value-of select="Priority" />
						</xsl:attribute>
						<xsl:attribute name="size">12</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Status</xsl:attribute>
						<xsl:attribute name="value">
							<xsl:value-of select="Status" />
						</xsl:attribute>
						<xsl:attribute name="size">10</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Description</xsl:attribute>
						<xsl:attribute name="value">
							<xsl:value-of select="Description" />
						</xsl:attribute>
						<xsl:attribute name="size">30</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">submit</xsl:attribute>
						<xsl:attribute name="name">update</xsl:attribute>
						<xsl:attribute name="value">Update</xsl:attribute>
					</input>
				</td>	
			</form>
		</tr>
	</table>
<!--	<br/> <<<editactivity	-->
</xsl:template>

</xsl:stylesheet>

