package com.reactiveworks.xsltexcercise.validation;
import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

/**
 * Validates the xml file
 */
public class EntityValidator {
	
	private static final String XSD_FILE = "Entity.xsd";
	private static final String XML_FILE = "Entity.xml";
	final static Logger LOGGER_OBJ = Logger.getLogger(EntityValidator.class);

	/**
	 * checks whether the xml file is valid or not 
	 * @param xsdPath path of the xsd file
	 * @param xmlPath path of the xml file
	 * @return true when the xml file is valid otherwise returns false
	 */
	public static boolean validateXMLSchema(String xsdPath, String xmlPath) {

		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory
					.newSchema(new File(EntityValidator.class.getClassLoader().getResource(xsdPath).getFile()));
			Validator validator = schema.newValidator();
			validator.validate(
					new StreamSource(new File(EntityValidator.class.getClassLoader().getResource(xmlPath).getFile())));
		} catch (IOException e) {
			LOGGER_OBJ.error("Exception: " + e.getMessage());
			return false;
		} catch (SAXException e) {
			LOGGER_OBJ.error("Exception: " + e.getMessage());
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		if (validateXMLSchema(XSD_FILE, XML_FILE)) {
			LOGGER_OBJ.debug("valid");
		} else {
			LOGGER_OBJ.debug("invalid");
		}

	}


}
