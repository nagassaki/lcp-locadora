package br.unesp.locadora.service;

import br.unesp.locadora.model.Modelo;

/**
 * Serviço de persistência de modelos.
 */
public class ModeloService extends IPersistenceService<Modelo> {

    /**
     * Construtor.
     */
    public ModeloService() {
        super(Modelo.class);
    }

}
