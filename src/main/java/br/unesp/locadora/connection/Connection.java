package br.unesp.locadora.connection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Factory de conexão.
 */
public class Connection {

    /**
     * Entity Manager.
     */
    private static EntityManager entityManager;

    /**
     * Cria EntityManager no padrão singleton.
     *
     * @return EntityManager.
     */
    public static EntityManager getEntityManager() {

        if (entityManager == null) {
            entityManager = Persistence.createEntityManagerFactory("localhost").createEntityManager();
        }

        return entityManager;
    }

}
