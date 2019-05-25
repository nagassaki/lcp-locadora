package br.unesp.locadora.service;

import br.unesp.locadora.model.Fatura;

/**
 * Serviço de persistência de faturas.
 */
public class FaturaService extends IPersistenceService<Fatura> {

    /**
     * Construtor.
     */
    public FaturaService() {
        super(Fatura.class);
    }

}
