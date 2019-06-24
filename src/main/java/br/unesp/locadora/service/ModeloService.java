package br.unesp.locadora.service;

import br.unesp.locadora.model.Modelo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de modelos.
 */
public class ModeloService extends IPersistenceService<Modelo> {

    public final int NOME = 0;
    public final int MARCA = 1;
    public final int ANO = 2;
    public final int CATEGORIA = 3;
    public final int CARACTERISTICAS = 4;

    /**
     * Construtor.
     */
    public ModeloService() {
        super(Modelo.class);
    }

    /**
     * Retorna lista de modelos.
     *
     * @return Lista de modelos.
     */
    public List<Modelo> list() {

        List<Modelo> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select m from Modelo m order by m.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de modelos.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de modelos.
     */
    public List<Modelo> list(String value, int column) {

        List<Modelo> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select m from Modelo m where m.nome like concat('%', :nome, '%') order by m.nome");
                    query.setParameter("nome", value);
                    break;
                case MARCA:
                    query = getEntityManager().createQuery("select m from Modelo m where m.marca.nome like concat('%', :marca, '%') order by m.nome");
                    query.setParameter("marca", value);
                    break;
                case ANO:
                    query = getEntityManager().createQuery("select m from Modelo m where m.ano like concat('%', :ano, '%') order by m.nome");
                    query.setParameter("ano", value);
                    break;
                case CATEGORIA:
                    query = getEntityManager().createQuery("select m from Modelo m where m.categoria.nome like concat('%', :categoria, '%') order by m.nome");
                    query.setParameter("categoria", value);
                    break;
                case CARACTERISTICAS:
                    query = getEntityManager().createQuery("select m from Modelo m join m.caracteristicas c where c.nome like concat('%', :caracteristica, '%') order by m.nome");
                    query.setParameter("caracteristica", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select m from Modelo m order by m.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
