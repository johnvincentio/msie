<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>

<xsl:template name="addQuery">
	<table xsl:use-attribute-sets="table-style">
		<tr>
			<th>Id</th>
			<th>Dur</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Description</th>
			<th>Select</th>
		</tr>
		<tr xsl:use-attribute-sets="activity-row-style">
			<form>
				<xsl:attribute name="method">POST</xsl:attribute>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Activityid</xsl:attribute>
						<xsl:attribute name="size">10</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Duration</xsl:attribute>
						<xsl:attribute name="size">5</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Priority</xsl:attribute>
						<xsl:attribute name="size">12</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Status</xsl:attribute>
						<xsl:attribute name="size">10</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">text</xsl:attribute>
						<xsl:attribute name="name">Description</xsl:attribute>
						<xsl:attribute name="size">30</xsl:attribute>
					</input>
				</td>
				<td>
					<input>
						<xsl:attribute name="type">submit</xsl:attribute>
						<xsl:attribute name="name">select</xsl:attribute>
						<xsl:attribute name="value">Select</xsl:attribute>
					</input>
				</td>	
			</form>
		</tr>
	</table>
</xsl:template>

</xsl:stylesheet>

