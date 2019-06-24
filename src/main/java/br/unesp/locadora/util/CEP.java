package br.unesp.locadora.util;

import br.unesp.locadora.model.Endereco;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Utilitário para busca de endereço via CEP.
 */
public class CEP {

    /**
     * Busca endereço via CEP.
     *
     * @param cep CEP.
     * @return Endereço.
     */
    public static Endereco getEndereco(String cep) {

        Endereco endereco = new Endereco();

        try {

            URL url = new URL("http://viacep.com.br/ws/" + cep + "/xml");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(inputStream);

            NodeList xmlcep = document.getElementsByTagName("xmlcep");
            NodeList itens = xmlcep.item(0).getChildNodes();

            endereco.setCep(itens.item(1).getTextContent().replace("-", ""));
            endereco.setEstado(itens.item(11).getTextContent());
            endereco.setCidade(itens.item(9).getTextContent());
            endereco.setBairro(itens.item(7).getTextContent());
            endereco.setEndereco(itens.item(3).getTextContent());
        } catch (Exception ex) {
            endereco = null;
        }

        return endereco;
    }
}
