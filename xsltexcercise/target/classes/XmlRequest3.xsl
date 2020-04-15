<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:key="http://schemas.datacontract.org/2004/07/Key2Act.OnPremiseServices.TTTrx.eTimeTrackService"
	xmlns:tem="http://tempuri.org/">

	<xsl:template match="/">
	<xsl:text>&#10;</xsl:text>
    <soap:Envelope>
    <xsl:text>&#10;</xsl:text>
		<soap:Header/>
        <xsl:text>&#10;</xsl:text>
			<soap:Body>
				<xsl:apply-templates select="@*|node()"></xsl:apply-templates>
            <xsl:text>&#10;</xsl:text>
            </soap:Body>
        
            <xsl:text>&#10;</xsl:text>
        </soap:Envelope>
	</xsl:template>
	
	<xsl:template match="/InsertTransaction">
	     
			<xsl:element name="tem:{name()}"><xsl:apply-templates /></xsl:element>
	       
	</xsl:template>
    
      <xsl:template match="Tenant">
     
            <xsl:element name="tem:{name()}"> <xsl:value-of select="node()"/></xsl:element>
	     
    </xsl:template> 

  <xsl:template match="Companydbname">
            <xsl:element name="tem:{name()}"> <xsl:value-of select="node()"/></xsl:element>
	
    </xsl:template> 

    <xsl:template match="trx">
    		<xsl:element name="tem:{name()}">  <xsl:apply-templates ></xsl:apply-templates></xsl:element>
	      
    </xsl:template>    
    
   <xsl:template match="/InsertTransaction/trx/*">
       
       <xsl:element name="key:{name()}"><xsl:value-of select="node()"/></xsl:element>
       
   </xsl:template>
    
</xsl:stylesheet>