<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>

<xsl:template name="addActivity">
	<table xsl:use-attribute-sets="table-style">
		<tr>
			<th>Id</th>
			<th>Dur</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Description</th>
			<th>Add</th>
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
						<xsl:attribute name="name">add</xsl:attribute>
						<xsl:attribute name="value">Add</xsl:attribute>
					</input>
				</td>	
			</form>
		</tr>
	</table>
</xsl:template>

<!--
	This seemed like a good idea at the time, probably because the above
		seemed to be so long winded.
	This is also too much typing, and it is also less readable.
-->

<xsl:template name="addActivity2">
	<table xsl:use-attribute-sets="table-style">
		<tr>
			<th>Id</th>
			<th>Dur</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Description</th>
			<th>Add</th>
		</tr>
		<tr xsl:use-attribute-sets="activity-row-style">
			<form>
				<xsl:attribute name="method">POST</xsl:attribute>
				<td>
					<xsl:call-template name="InputTextType">
						<xsl:with-param name="name">Activityid</xsl:with-param>
						<xsl:with-param name="size">10</xsl:with-param>
					</xsl:call-template>
				</td>
				<td>
					<xsl:call-template name="InputTextType">
						<xsl:with-param name="name">Duration</xsl:with-param>
						<xsl:with-param name="size">5</xsl:with-param>
					</xsl:call-template>
				</td>
				<td>
					<xsl:call-template name="InputTextType">
						<xsl:with-param name="name">Priority</xsl:with-param>
						<xsl:with-param name="size">12</xsl:with-param>
					</xsl:call-template>
				</td>
				<td>
					<xsl:call-template name="InputTextType">
						<xsl:with-param name="name">Status</xsl:with-param>
						<xsl:with-param name="size">10</xsl:with-param>
					</xsl:call-template>
				</td>
				<td>
					<xsl:call-template name="InputTextType">
						<xsl:with-param name="name">Description</xsl:with-param>
						<xsl:with-param name="size">30</xsl:with-param>
					</xsl:call-template>
				</td>
				<td>
					<xsl:call-template name="InputSubmitType">
						<xsl:with-param name="name">add</xsl:with-param>
						<xsl:with-param name="value">Add</xsl:with-param>
					</xsl:call-template>
				</td>	
			</form>
		</tr>
	</table>
</xsl:template>

</xsl:stylesheet>

