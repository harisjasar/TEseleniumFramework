package com.te.automation.parsers;

import java.io.IOException;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class ParameterXmlParser {

	private DocumentBuilderFactory _factory;
	private DocumentBuilder _builder;
	private Document _doc;
	
	public ParameterXmlParser(String filePath) throws ParserConfigurationException, SAXException, IOException {
		
			this._factory = DocumentBuilderFactory.newInstance();
			this._builder = _factory.newDocumentBuilder();
			this._doc = _builder.parse(filePath);
	}
	
	public HashMap<String, String> GetParameters(String tcName){
		System.out.println("Collected Parameters");
		System.out.println("-------------------------------");
		
		HashMap<String, String> params = new HashMap<String, String>();
		
		NodeList tcNode= this._doc.getElementsByTagName(tcName);
		
		for(int i = 0; i < tcNode.getLength(); i++) {
			Node node = tcNode.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				NodeList parameterList = node.getChildNodes();
				
				for(int j = 0; j < parameterList.getLength(); j++) {
					Node parameterNode = parameterList.item(j);
					if(parameterNode.getNodeType() == Node.ELEMENT_NODE) {
						Element parameter = (Element) parameterNode;
						
						params.put(parameter.getTagName(), parameter.getTextContent());
						System.out.println("--------------------");
						System.out.println("Key:" + parameter.getTagName());
						System.out.println("Value:" + parameter.getTextContent());
						System.out.println("--------------------");
					}		
				}
			}
		}
		return params;		
	}
}

	

