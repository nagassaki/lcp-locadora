package br.unesp.locadora.service;

import br.unesp.locadora.model.Caracteristica;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de características.
 */
public class CaracteristicaService extends IPersistenceService<Caracteristica> {

    public final int NOME = 0;

    /**
     * Construtor.
     */
    public CaracteristicaService() {
        super(Caracteristica.class);
    }

    /**
     * Retorna lista de características.
     *
     * @return Lista de características.
     */
    public List<Caracteristica> list() {

        List<Caracteristica> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select c from Caracteristica c order by c.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de características.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de características.
     */
    public List<Caracteristica> list(String value, int column) {

        List<Caracteristica> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select c from Caracteristica c where c.nome like concat('%', :nome, '%') order by c.nome");
                    query.setParameter("nome", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select c from Caracteristica c order by c.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
