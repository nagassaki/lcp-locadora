package br.unesp.locadora.service;

import br.unesp.locadora.model.Juridica;

/**
 * Serviço de persistência de clientes pessoa jurídica.
 */
public class JuridicaService extends IPersistenceService<Juridica> {

    /**
     * Construtor.
     */
    public JuridicaService() {
        super(Juridica.class);
    }

}
