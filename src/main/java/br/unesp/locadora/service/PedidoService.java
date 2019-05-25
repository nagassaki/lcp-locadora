package br.unesp.locadora.service;

import br.unesp.locadora.model.Pedido;

/**
 * Serviço de persistência de pedidos.
 */
public class PedidoService extends IPersistenceService<Pedido> {

    /**
     * Construtor.
     */
    public PedidoService() {
        super(Pedido.class);
    }

}
