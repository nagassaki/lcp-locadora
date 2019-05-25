package br.unesp.locadora.service;

import br.unesp.locadora.model.Categoria;

/**
 * Serviço de persistência de categorias.
 */
public class CategoriaService extends IPersistenceService<Categoria> {

    /**
     * Construtor.
     */
    public CategoriaService() {
        super(Categoria.class);
    }

}
