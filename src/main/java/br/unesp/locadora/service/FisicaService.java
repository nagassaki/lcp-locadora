package br.unesp.locadora.service;

import br.unesp.locadora.model.Fisica;

/**
 * Serviço de persistência de clientes pessoa física.
 */
public class FisicaService extends IPersistenceService<Fisica> {

    /**
     * Construtor.
     */
    public FisicaService() {
        super(Fisica.class);
    }

}
