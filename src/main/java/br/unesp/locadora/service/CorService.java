package br.unesp.locadora.service;

import br.unesp.locadora.model.Cor;

/**
 * Serviço de persistência de cores.
 */
public class CorService extends IPersistenceService<Cor> {

    /**
     * Construtor.
     */
    public CorService() {
        super(Cor.class);
    }

}
