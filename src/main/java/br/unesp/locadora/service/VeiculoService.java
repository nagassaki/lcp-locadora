package br.unesp.locadora.service;

import br.unesp.locadora.model.Veiculo;

/**
 * Serviço de persistência de veículos.
 */
public class VeiculoService extends IPersistenceService<Veiculo> {

    /**
     * Construtor.
     */
    public VeiculoService() {
        super(Veiculo.class);
    }

}
