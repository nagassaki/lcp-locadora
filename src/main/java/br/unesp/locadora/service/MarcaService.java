package br.unesp.locadora.service;

import br.unesp.locadora.model.Marca;

/**
 * Serviço de persistência de marcas.
 */
public class MarcaService extends IPersistenceService<Marca> {

    /**
     * Construtor.
     */
    public MarcaService() {
        super(Marca.class);
    }

}
