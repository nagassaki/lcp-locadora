package br.unesp.locadora.service;

import br.unesp.locadora.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de categorias.
 */
public class CategoriaService extends IPersistenceService<Categoria> {

    public final int NOME = 0;
    public final int DIARIA = 1;
    public final int MULTA = 2;

    /**
     * Construtor.
     */
    public CategoriaService() {
        super(Categoria.class);
    }

    /**
     * Retorna lista de categorias.
     *
     * @return Lista de categorias.
     */
    public List<Categoria> list() {

        List<Categoria> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select c from Categoria c order by c.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de categorias.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de categorias.
     */
    public List<Categoria> list(String value, int column) {

        List<Categoria> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select c from Categoria c where c.nome like concat('%', :nome, '%') order by c.nome");
                    query.setParameter("nome", value);
                    break;
                case DIARIA:
                    query = getEntityManager().createQuery("select c from Categoria c where c.diaria like concat('%', :diaria, '%') order by c.nome");
                    query.setParameter("diaria", value);
                    break;
                case MULTA:
                    query = getEntityManager().createQuery("select c from Categoria c where c.multa like concat('%', :multa, '%') order by c.nome");
                    query.setParameter("multa", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select c from Categoria c order by c.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
