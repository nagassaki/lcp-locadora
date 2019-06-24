package br.unesp.locadora.service;

import br.unesp.locadora.model.Fatura;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de faturas.
 */
public class FaturaService extends IPersistenceService<Fatura> {

    public final int DATA = 0;
    public final int PEDIDO = 1;
    public final int VALOR = 2;
    public final int MULTA = 3;
    public final int TOTAL = 4;

    /**
     * Construtor.
     */
    public FaturaService() {
        super(Fatura.class);
    }

    /**
     * Retorna lista de faturas.
     *
     * @return Lista de faturas.
     */
    public List<Fatura> list() {

        List<Fatura> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select f from Fatura f order by f.id desc");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de faturas.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de faturas.
     */
    public List<Fatura> list(String value, int column) {

        List<Fatura> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case DATA:
                    query = getEntityManager().createQuery("select f from Fatura f where f.data like concat('%', :data, '%') order by f.id desc");
                    query.setParameter("data", value);
                    break;
                case PEDIDO:
                    query = getEntityManager().createQuery("select f from Fatura f where f.pedido.id like concat('%', :pedido, '%') order f.id desc");
                    query.setParameter("pedido", value);
                    break;
                case VALOR:
                    query = getEntityManager().createQuery("select f from Fatura f where f.valor like concat('%', :valor, '%') order by f.id desc");
                    query.setParameter("valor", value);
                    break;
                case MULTA:
                    query = getEntityManager().createQuery("select f from Fatura f where f.multa like concat('%', :multa, '%') order by f.id desc");
                    query.setParameter("multa", value);
                    break;
                case TOTAL:
                    query = getEntityManager().createQuery("select f from Fatura f where f.total like concat('%', :total, '%') order by f.id desc");
                    query.setParameter("total", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select f from Fatura f order by f.id desc");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
