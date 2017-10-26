/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.manipuladorxml.parserxml.br;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

/**
 *
 * @author YURY
 */
public class ParserXML implements IParserXML {

    private Document archive;

    public ParserXML(String pathArchive) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        this.archive = dBuilder.parse(new File(pathArchive));
        this.archive.getDocumentElement().normalize();
    }

    @Override
    public List<String[]> extractDataXML(String tagName, List<String> attributes) throws Exception {
        Element eElement;
        String[] value;
        List<String[]> values = new ArrayList();
        NodeList nList = this.archive.getElementsByTagName(tagName);

        if (nList.getLength() > 0) {
            for (int i = 0; i < nList.getLength(); i++) {
                if (nList.item(i).getNodeType() == Element.ELEMENT_NODE) {
                    eElement = (Element) nList.item(i);
                    value = new String[attributes.size()];
                    for (int j = 0; j < attributes.size(); j++) {
                        value[j] = eElement.getAttribute(attributes.get(j));
                    }
                    values.add(value);
                }
            }
        }

        return values;
    }

}
