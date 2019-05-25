package br.unesp.locadora.service;

import br.unesp.locadora.connection.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.hibernate.HibernateException;

/**
 * Interface de um serviço de persistência genérico.
 *
 * @param <T> Tipo do objeto que será persistido.
 */
public abstract class IPersistenceService<T> {

    /**
     * Tipo do objeto que será persistido.
     */
    private Class<T> type;

    /**
     * Entity Manager.
     */
    private static EntityManager entityManager = Connection.getEntityManager();

    /**
     * Entity Transaction.
     */
    private static EntityTransaction entityTransaction = Connection.getEntityManager().getTransaction();

    /**
     * Construtor.
     *
     * @param type Tipo.
     */
    public IPersistenceService(Class<T> type) {
        this.type = type;
    }

    /**
     * Persiste um objeto no banco de dados.
     *
     * @param object Objeto.
     */
    public void save(T object) {
        try {
            getEntityTransaction().begin();
            getEntityManager().persist(object);
            getEntityTransaction().commit();
        } catch (HibernateException ex) {
            getEntityTransaction().rollback();
        }
    }

    /**
     * Remove um objeto do banco de dados.
     *
     * @param object Objeto.
     */
    public void delete(T object) {
        try {
            getEntityTransaction().begin();
            getEntityManager().remove(object);
            getEntityTransaction().commit();
        } catch (HibernateException ex) {
            getEntityTransaction().rollback();
        }
    }

    /**
     * Recupera um objeto do banco de dados pelo seu identificador.
     *
     * @param id Identificador do objeto.
     * @return Objeto.
     */
    public T getById(int id) {

        T object = null;

        try {
            object = getEntityManager().getReference(type, id);
        } catch (Exception ex) {

        }

        return object;
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static EntityTransaction getEntityTransaction() {
        return entityTransaction;
    }

}
