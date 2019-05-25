package br.unesp.locadora.service;

import br.unesp.locadora.model.Caracteristica;

/**
 * Serviço de persistência de características.
 */
public class CaracteristicaService extends IPersistenceService<Caracteristica> {

    /**
     * Construtor.
     */
    public CaracteristicaService() {
        super(Caracteristica.class);
    }

}
