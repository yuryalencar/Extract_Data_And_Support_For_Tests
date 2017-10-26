/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.manipuladorxml.parserxml.br;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YURY
 */
public class ParserXMLTest {
    
    /**
     * Test of extractDataXML method, of class ParserXML.
     */
    @Test
    public void testExtractDataXML() throws Exception {
        System.out.println("extractDataXML");
        
        List<String> attributes = new ArrayList();
        attributes.add("nome");
        attributes.add("idade");
        attributes.add("email");
        
        ParserXML instance = new ParserXML("C:\\Users\\YURY\\Documents\\NetBeansProjects\\"
                + "ExtractDataXMLForTests\\test\\org\\unipampa\\manipuladorxml\\parserxml\\"
                + "br\\exemploDeEspecificacao.xml");
        
        List<String[]> result = instance.extractDataXML("valor", attributes);
        assertEquals(result.size(), 4);
        
        assertEquals(result.get(0).length, 3);
        assertEquals(result.get(0)[0], "Yury Alencar Lima");
        assertEquals(result.get(0)[1], "20");
        assertEquals(result.get(0)[2], "yuryalencar19@gmail.com");
        
        assertEquals(result.get(1)[0], "Juliana Mareco");
        assertEquals(result.get(1)[1], "20");
        assertEquals(result.get(1)[2], "julianamareco18@gmail.com");
        
        assertEquals(result.get(2)[0], "Lucas Martins");
        assertEquals(result.get(2)[1], "Desconhecida");
        assertEquals(result.get(2)[2], "lgatts@gmail.com");
        
        assertEquals(result.get(3)[0], "Lucas Corrêa");
        assertEquals(result.get(3)[1], "22");
        assertEquals(result.get(3)[2], "eslucascorrea@gmail.com");
        
    }
    
}
