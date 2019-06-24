package br.unesp.locadora.service;

import br.unesp.locadora.model.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de pedidos.
 */
public class PedidoService extends IPersistenceService<Pedido> {

    public final int DATA = 0;
    public final int VEICULO = 1;
    public final int CLIENTE = 2;
    public final int VALOR = 3;
    public final int RETIRADA = 4;
    public final int DEVOLUCAO = 5;

    /**
     * Construtor.
     */
    public PedidoService() {
        super(Pedido.class);
    }

    /**
     * Retorna lista de pedidos ativos.
     *
     * @return Lista de pedidos ativos.
     */
    public List<Pedido> listAtivos() {

        List<Pedido> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select p from Pedido p where p.finalizado = false and p.cancelado = false order by p.id desc");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de pedidos ativos.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de pedidos ativos.
     */
    public List<Pedido> listAtivos(String value, int column) {

        List<Pedido> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case DATA:
                    query = getEntityManager().createQuery("select p from Pedido p where p.data like concat('%', :data, '%') and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("data", value);
                    break;
                case VEICULO:
                    query = getEntityManager().createQuery("select p from Pedido p where (p.veiculo.placa like concat('%', :veiculo, '%') or p.veiculo.modelo.nome like concat('%', :veiculo, '%') or p.veiculo.modelo.marca.nome like concat('%', :veiculo, '%')) and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("veiculo", value);
                    break;
                case CLIENTE:
                    query = getEntityManager().createQuery("select p from Pedido p where p.cliente.nome like concat('%', :cliente, '%') and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("cliente", value);
                    break;
                case VALOR:
                    query = getEntityManager().createQuery("select p from Pedido p where p.valor like concat('%', :valor, '%') and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("valor", value);
                    break;
                case RETIRADA:
                    query = getEntityManager().createQuery("select p from Pedido p where p.retirada like concat('%', :retirada, '%') and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("retirada", value);
                    break;
                case DEVOLUCAO:
                    query = getEntityManager().createQuery("select p from Pedido p where p.devolucao like concat('%', :devolucao, '%') and p.finalizado = false and p.cancelado = false order by p.id desc");
                    query.setParameter("devolucao", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select p from Pedido p where p.finalizado = false and p.cancelado = false order by p.id desc");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de pedidos finalizados.
     *
     * @return Lista de pedidos finalizados.
     */
    public List<Pedido> listFinalizados() {

        List<Pedido> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select p from Pedido p where p.finalizado = true and p.cancelado = false order by p.id desc");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de pedidos finalizados.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de pedidos finalizados.
     */
    public List<Pedido> listFinalizados(String value, int column) {

        List<Pedido> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case DATA:
                    query = getEntityManager().createQuery("select p from Pedido p where p.data like concat('%', :data, '%') and p.finalizado = true and p.cancelado = false order by p.id desc");
                    query.setParameter("data", value);
                    break;
                case VEICULO:
                    query = getEntityManager().createQuery("select p from Pedido p where (p.veiculo.placa like concat('%', :veiculo, '%') or p.veiculo.modelo.nome like concat('%', :veiculo, '%') or p.veiculo.modelo.marca.nome like concat('%', :veiculo, '%')) and p.finalizado = true and p.cancelado = false order by p.id desc");
                    query.setParameter("veiculo", value);
                    break;
                case CLIENTE:
                    query = getEntityManager().createQuery("select p from Pedido p where p.cliente.nome like concat('%', :cliente, '%') and p.finalizado = true and p.cancelado = false order by p.id desc");
                    query.setParameter("cliente", value);
                    break;
                case VALOR:
                    query = getEntityManager().createQuery("select p from Pedido p where p.valor like concat('%', :valor, '%') and p.finalizado = true and p.cancelado = false order by p.id desc");
                    query.setParameter("valor", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select p from Pedido p where p.finalizado = true and p.cancelado = false order by p.id desc");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de pedidos cancelados.
     *
     * @return Lista de pedidos cancelados.
     */
    public List<Pedido> listCancelados() {

        List<Pedido> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select p from Pedido p where p.cancelado = true order by p.id desc");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de pedidos cancelados.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de pedidos cancelados.
     */
    public List<Pedido> listCancelados(String value, int column) {

        List<Pedido> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case DATA:
                    query = getEntityManager().createQuery("select p from Pedido p where p.data like concat('%', :data, '%') and p.cancelado = true order by p.id desc");
                    query.setParameter("data", value);
                    break;
                case VEICULO:
                    query = getEntityManager().createQuery("select p from Pedido p where (p.veiculo.placa like concat('%', :veiculo, '%') or p.veiculo.modelo.nome like concat('%', :veiculo, '%') or p.veiculo.modelo.marca.nome like concat('%', :veiculo, '%')) and p.cancelado = true order by p.id desc");
                    query.setParameter("veiculo", value);
                    break;
                case CLIENTE:
                    query = getEntityManager().createQuery("select p from Pedido p where p.cliente.nome like concat('%', :cliente, '%') and p.cancelado = true order by p.id desc");
                    query.setParameter("cliente", value);
                    break;
                case VALOR:
                    query = getEntityManager().createQuery("select p from Pedido p where p.valor like concat('%', :valor, '%') and p.cancelado = true order by p.id desc");
                    query.setParameter("valor", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select p from Pedido p where p.cancelado = true order by p.id desc");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
