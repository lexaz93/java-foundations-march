<?xml version="1.0" encoding="UTF-8" ?>         <!-- Объявление документа: версия и кодировка -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">         <!-- Объявление стиля и пространства имен xsl -->
    <xsl:output method="xml"
                omit-xml-declaration="yes"
                indent="yes"/>            <!-- Формирование результата: метод вывода, пропуск начального объявления, отступы согласно уровню вложенности -->

    <xsl:template match="root">         <!-- Объявление основного шаблона с путем поиска шаблонов -->
        <root>
            <xsl:variable name="count" select="count(//sum)"/>          <!-- Количество узлов с суммой перевода -->
            <xsl:variable name="total" select="format-number(sum(//sum) div $count, '#.##')"/>          <!-- Среднее арифметическое перевода -->
            <xsl:for-each select="deposit/node">            <!-- Цикл по узлам -->
                <xsl:sort select="@total_sum" order="descending"/>      <!-- Сортировка по убыванию -->
                <xsl:variable name="i" select="position()"/>
                <xsl:choose>        <!-- Аналогия if/else -->
                    <xsl:when test="$i = 1">            <!-- Индекс последнего элемента -->
                        <transaction lsc="{@lsc}" add_sum="{format-number(sum(//sum) - $total * ($count - 1), '#.##')}"
                                     total_sum="{format-number(@total_sum + (sum(//sum) - $total * ($count - 1)), '#.##')}"/>
                    </xsl:when>
                    <xsl:otherwise>     <!-- Индексы остальных -->
                        <transaction lsc="{@lsc}" add_sum="{$total}" total_sum="{format-number(@total_sum + $total, '#.##')}"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
        </root>
    </xsl:template>

</xsl:stylesheet>