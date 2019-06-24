package br.unesp.locadora.service;

import br.unesp.locadora.model.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de marcas.
 */
public class MarcaService extends IPersistenceService<Marca> {

    public final int NOME = 0;

    /**
     * Construtor.
     */
    public MarcaService() {
        super(Marca.class);
    }

    /**
     * Retorna lista de marcas.
     *
     * @return Lista de marcas.
     */
    public List<Marca> list() {

        List<Marca> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select m from Marca m order by m.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de marcas.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de marcas.
     */
    public List<Marca> list(String value, int column) {

        List<Marca> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select m from Marca m where m.nome like concat('%', :nome, '%') order by m.nome");
                    query.setParameter("nome", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select m from Marca m order by m.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
