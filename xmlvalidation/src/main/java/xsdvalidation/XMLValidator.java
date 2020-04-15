package xsdvalidation;

import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidator {

	private static final String XSD_FILE = "StudentXMLSchema.xsd";
	private static final String XML_FILE = "Student.xml";
	final static Logger LOGGER_OBJ = Logger.getLogger(XMLValidator.class);

	public static boolean validateXMLSchema(String xsdPath, String xmlPath) {

		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory
					.newSchema(new File(XMLValidator.class.getClassLoader().getResource(xsdPath).getFile()));
			Validator validator = schema.newValidator();
			validator.validate(
					new StreamSource(new File(XMLValidator.class.getClassLoader().getResource(xmlPath).getFile())));
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

		System.out.println("student.xml ");
		if (validateXMLSchema(XSD_FILE, XML_FILE)) {
			LOGGER_OBJ.debug("valid");
		} else {
			LOGGER_OBJ.debug("invalid");
		}

	}

}