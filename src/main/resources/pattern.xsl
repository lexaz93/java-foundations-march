<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output indent="yes" method="xml" omit-xml-declaration="yes"/>

    <xsl:template match="root">
        <root>
            <xsl:variable name="count" select="count(//sum)"/>
            <xsl:variable name="total" select="format-number(sum(//sum) div $count, '#.##')"/>
            <xsl:for-each select="deposit/node">
                <xsl:sort select="@total_sum" order="descending"/>
                <xsl:choose>
                    <xsl:when test="$count = count(preceding-sibling::*)+1">
                        <transaction lsc="{@lsc}" add_sum="{format-number(sum(//sum) - $total * ($count - 1), '#.##')}" total_sum="{format-number(@total_sum + (sum(//sum) - $total * ($count - 1)), '#.##')}"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <transaction lsc="{@lsc}" add_sum="{$total}" total_sum="{format-number(@total_sum + $total, '#.##')}"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
        </root>
    </xsl:template>

</xsl:stylesheet>