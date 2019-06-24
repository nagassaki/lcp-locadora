package br.unesp.locadora.service;

import br.unesp.locadora.model.Cor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de cores.
 */
public class CorService extends IPersistenceService<Cor> {

    public final int NOME = 0;

    /**
     * Construtor.
     */
    public CorService() {
        super(Cor.class);
    }

    /**
     * Retorna lista de cores.
     *
     * @return Lista de cores.
     */
    public List<Cor> list() {

        List<Cor> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select c from Cor c order by c.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de cores.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de cores.
     */
    public List<Cor> list(String value, int column) {

        List<Cor> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select c from Cor c where c.nome like concat('%', :nome, '%') order by c.nome");
                    query.setParameter("nome", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select c from Cor c order by c.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
