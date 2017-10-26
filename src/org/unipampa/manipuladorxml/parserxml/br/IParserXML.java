/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.manipuladorxml.parserxml.br;

import java.util.List;

/**
 *
 * @author YURY
 */
public interface IParserXML {
    
    /**
     * Método para realizar a extração de dados de um documento XML, partindo do nome da sua Tag e 
     * dos atributos a serem extraídos.
     * 
     * @param tagName Nome da tag XML a ser buscada dentro do documento especificado no construtor.
     * @param attributes Todos os atributos da respectiva tag que devem ser extraídos.
     * @return Uma List onde para cada valor é um conjunto de dados referentes aos atributos escolhidos
     * exemplo: Attributes{nome, idade, email} poderá ter como retorno uma lista de atributos contendo
     * itemDaLista{Yury Alencar, 20, yuryalencar19@gmail.com} podendo ser utilizada uma para cada caso de teste.
     * @throws java.lang.Exception
     */
    public List<String[]> extractDataXML(String tagName, List<String> attributes) throws Exception ;
    
}
