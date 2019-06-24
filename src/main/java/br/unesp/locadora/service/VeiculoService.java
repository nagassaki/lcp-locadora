package br.unesp.locadora.service;

import br.unesp.locadora.model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de veículos.
 */
public class VeiculoService extends IPersistenceService<Veiculo> {

    public final int MODELO = 0;
    public final int COR = 1;
    public final int PLACA = 2;
    public final int RENAVAM = 3;

    /**
     * Construtor.
     */
    public VeiculoService() {
        super(Veiculo.class);
    }

    /**
     * Retorna lista de veículos.
     *
     * @return Lista de veículos.
     */
    public List<Veiculo> list() {

        List<Veiculo> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select v from Veiculo v order by v.placa");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de veículos.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de veículos.
     */
    public List<Veiculo> list(String value, int column) {

        List<Veiculo> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case MODELO:
                    query = getEntityManager().createQuery("select v from Veiculo v where v.modelo.nome like concat('%', :modelo, '%') order by v.placa");
                    query.setParameter("modelo", value);
                    break;
                case COR:
                    query = getEntityManager().createQuery("select v from Veiculo v where v.cor.nome like concat('%', :cor, '%') order by v.placa");
                    query.setParameter("cor", value);
                    break;
                case PLACA:
                    query = getEntityManager().createQuery("select v from Veiculo v where v.placa like concat('%', :placa, '%') order by v.placa");
                    query.setParameter("placa", value);
                    break;
                case RENAVAM:
                    query = getEntityManager().createQuery("select v from Veiculo v where v.renavam like concat('%', :renavam, '%') order by v.placa");
                    query.setParameter("renavam", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select v from Veiculo v order by v.placa");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
