<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:param name="EditActivityId"/>
<xsl:param name="EditDescription"/>
<xsl:param name="EditDuration"/>
<xsl:param name="EditPriority"/>
<xsl:param name="EditStatus"/>

<xsl:template match="Project">
	<xsl:call-template name="showParams"/>
	<xsl:element name="Project">
		<xsl:element name="Project">
			<xsl:value-of select="Projectid" />
		</xsl:element>
		<xsl:element name="Description">
			<xsl:value-of select="Description" />
		</xsl:element>

		<xsl:call-template name="doFilter">
			<xsl:with-param name="list" select="Activity"/>
		</xsl:call-template>
	</xsl:element>
</xsl:template>

<xsl:template name="doFilter">
	<xsl:param name="list"/>
	<xsl:for-each select="$list">
<!--
		<xsl:message>Current Act: <xsl:value-of select="Activityid"/> </xsl:message>
-->
		<xsl:variable name="filter1" >
			<xsl:call-template name="checkField">
				<xsl:with-param name="Current" select="Activityid"/>
				<xsl:with-param name="Compare" select="$EditActivityId"/>
			</xsl:call-template>
		</xsl:variable>

		<xsl:variable name="filter2" >
			<xsl:call-template name="checkField">
				<xsl:with-param name="Current" select="Description"/>
				<xsl:with-param name="Compare" select="$EditDescription"/>
			</xsl:call-template>
		</xsl:variable>

		<xsl:variable name="filter3" >
			<xsl:call-template name="checkField">
				<xsl:with-param name="Current" select="Duration"/>
				<xsl:with-param name="Compare" select="$EditDuration"/>
			</xsl:call-template>
		</xsl:variable>

		<xsl:variable name="filter4" >
			<xsl:call-template name="checkField">
				<xsl:with-param name="Current" select="Priority"/>
				<xsl:with-param name="Compare" select="$EditPriority"/>
			</xsl:call-template>
		</xsl:variable>

		<xsl:variable name="filter5" >
			<xsl:call-template name="checkField">
				<xsl:with-param name="Current" select="Status"/>
				<xsl:with-param name="Compare" select="$EditStatus"/>
			</xsl:call-template>
		</xsl:variable>
<!--
		<xsl:message>filter1: <xsl:value-of select="$filter1"/> </xsl:message>
		<xsl:message>filter2: <xsl:value-of select="$filter2"/> </xsl:message>
		<xsl:message>filter3: <xsl:value-of select="$filter3"/> </xsl:message>
		<xsl:message>filter4: <xsl:value-of select="$filter4"/> </xsl:message>
		<xsl:message>filter5: <xsl:value-of select="$filter5"/> </xsl:message>
-->
		<xsl:variable name="jvtotal" 
			select="$filter1 + $filter2 + $filter3 + $filter4 + $filter5"/>
		<xsl:if test="$jvtotal = 5">
			<xsl:copy>
				<xsl:apply-templates select="*|@*|comment()|processing-instruction()|text()"/>
			</xsl:copy>
		</xsl:if>

	</xsl:for-each>

</xsl:template>

<xsl:template name="checkField">
	<xsl:param name="Current"/>
	<xsl:param name="Compare"/>
<!--
	<xsl:message>Current: <xsl:value-of select="$Current"/> </xsl:message>
	<xsl:message>Compare: <xsl:value-of select="$Compare"/> </xsl:message>
-->

	<xsl:choose>
		<xsl:when test="$Compare = ''" >
			<xsl:value-of select="1"/>
		</xsl:when>
		<xsl:when test="$Compare != '' and $Current = $Compare" >
			<xsl:value-of select="1"/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="0"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>

<xsl:template match="*|@*|comment()|processing-instruction()|text()">
	<xsl:copy>
		<xsl:apply-templates select="*|@*|comment()|processing-instruction()|text()"/>
	</xsl:copy>
</xsl:template>

<xsl:template name="showParams">
	<xsl:if test="$EditActivityId != ''">
	<xsl:message>Activity: <xsl:value-of select="$EditActivityId"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditDescription != ''">
	<xsl:message>Description: <xsl:value-of select="$EditDescription"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditDuration != ''">
	<xsl:message>Duration: <xsl:value-of select="$EditDuration"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditPriority != ''">
	<xsl:message>Priority: <xsl:value-of select="$EditPriority"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditStatus != ''">
	<xsl:message>Status: <xsl:value-of select="$EditStatus"/> </xsl:message>
	</xsl:if>
</xsl:template>

</xsl:stylesheet>

