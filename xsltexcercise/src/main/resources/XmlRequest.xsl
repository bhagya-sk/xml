<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >

	<xsl:output method="xml" indent="yes" version="1.0" />

	<xsl:template match="/">
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="Shipment">
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="ServiceVal">
				<xsl:text>&#10;</xsl:text>
				<xsl:apply-templates select="/Shipment" />
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
	</xsl:template>

	<xsl:template match="/Shipment">

		<xsl:element name="HostServiceType">
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="HostNaming">
				<xsl:text>&#10;</xsl:text>
				<xsl:element name="HostName">
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="Carrier">
						<xsl:value-of
							select="/Shipment/Service/HostServiceType/HostNaming/HostName/Carrier" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="Servicer">
						<xsl:value-of
							select="/Shipment/Service/HostServiceType/HostNaming/HostName/Service" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="Type">
						<xsl:value-of
							select="/Shipment/Service/HostServiceType/HostNaming/HostName/Type" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="AncillaryEndorsemen">
						<xsl:value-of
							select="/Shipment/Service/HostServiceType/HostNaming/HostName/AncillaryEndorsement" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="HubId">
						<xsl:value-of
							select="/Shipment/Service/HostServiceType/HostNaming/HostName/HubId" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
				</xsl:element>
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>

		<xsl:apply-templates select="./Shipper" />
		<xsl:apply-templates select="./ShipFromAddress" />
		<xsl:apply-templates
			select="./ShipToAddress/ToContactAndAddress" />
		<xsl:apply-templates select="./Packages" />
		<xsl:apply-templates select="./PaymentInformation" />
	</xsl:template>

	<xsl:template name="Service">

	</xsl:template>
	
	<xsl:template match="Shipper">
	<xsl:text>&#10;</xsl:text>
	<xsl:element name="Shipper">
	<xsl:text>&#10;</xsl:text>
	   <xsl:element name="shipper_id"><xsl:value-of select="/Shipment/Shipper/shipper_id" /></xsl:element>
	<xsl:text>&#10;</xsl:text>
	</xsl:element>	
	</xsl:template>

	<xsl:template match="ShipFromAddress">
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="Sender">
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="Contact">
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/CompanyName" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./FromContactAndAddress/PersonName" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/PhoneNumber" />
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="Address">
			<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/StreetLine1" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/StreetLine2" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./FromContactAndAddress/City" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/StateOrProvinceCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./FromContactAndAddress/PostalCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/CountryCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of
					select="./FromContactAndAddress/ResidentialAddressIndicator" />
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
	</xsl:template>

	<xsl:template match="ShipToAddress/ToContactAndAddress">
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="Recipient">
		<xsl:text>&#10;</xsl:text>
			<xsl:element name="Contact">
			<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./CompanyName" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./PersonName" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./PhoneNumber" />
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="Address">
			<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./StreetLine1" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./StreetLine2" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./City" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./StateOrProvinceCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./PostalCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./CountryCode" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./ResidentialAddressIndicator" />
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
	</xsl:template>

	<xsl:template match="Packages">
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="Packages">
			<xsl:text>&#10;</xsl:text>
			<xsl:copy-of select="./PackageCount" />
			
		<xsl:for-each select="./Package">
		<xsl:text>&#10;</xsl:text>
			<xsl:element name="Package">
			<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./DropOffTime" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./ShipDate" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./PackagingType" />
				<xsl:text>&#10;</xsl:text>
				<xsl:copy-of select="./PackageCount" />
				<xsl:text>&#10;</xsl:text>
				<xsl:element name="Weight">
					<xsl:element name="Units">
						<xsl:value-of
							select="./Weight/WeightUnitOfMeasurement/WeightCode" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
					<xsl:element name="Value">
						<xsl:value-of select="./Weight/Weight" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
				</xsl:element>

				<xsl:element name="Dimensions">
					<xsl:copy-of select="./Dimensions/Length" />
					<xsl:text>&#10;</xsl:text>
					<xsl:copy-of select="./Dimensions/Width" />
					<xsl:text>&#10;</xsl:text>
					<xsl:copy-of select="./Dimensions/Height" />
					<xsl:text>&#10;</xsl:text>
					<xsl:copy-of select="./Dimensions/Units" />
					<xsl:text>&#10;</xsl:text>
				</xsl:element>
				<xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		
		</xsl:for-each>
		
		
		</xsl:element>
	</xsl:template>

	<xsl:template match="PaymentInformation">
		<xsl:element name="PaymentInformation">
		<xsl:text>&#10;</xsl:text>
			<xsl:element name="ShipmentCharge">
				<xsl:copy-of select="./ShipmentCharge/Type" />
				<xsl:text>&#10;</xsl:text>
				<xsl:element name="BillShipper">
					<xsl:copy-of
						select="./ShipmentCharge/BillShipper/AccountNumber" />
					<xsl:element name="ShipperAddress">
						<xsl:copy-of
							select="./ShipmentCharge/BillShipper/CreditCard/ShipperAddress/PostalCode" />
						<xsl:text>&#10;</xsl:text>
						<xsl:copy-of
							select="./ShipmentCharge/BillShipper/CreditCard/ShipperAddress/CountryCode" />
					</xsl:element>
					<xsl:text>&#10;</xsl:text>
				</xsl:element>

				<xsl:element name="BillThirdParty">
					<xsl:copy-of
						select="./ShipmentCharge/BillThirdParty/AccountNumber" />
					<xsl:text>&#10;</xsl:text>
					<xsl:copy-of
						select="./ShipmentCharge/BillThirdParty/ThirdPartyAddress" />
				</xsl:element>

				<xsl:element name="BillReceiver">
				<xsl:text>&#10;</xsl:text>
					<xsl:copy-of
						select="./ShipmentCharge/BillReceiver/AccountNumber" />
					<xsl:text>&#10;</xsl:text>
					<xsl:copy-of
						select="./ShipmentCharge/BillReceiver/ThirdPartyAddress" />
				</xsl:element>
              <xsl:text>&#10;</xsl:text>
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>

	</xsl:template>

</xsl:stylesheet>