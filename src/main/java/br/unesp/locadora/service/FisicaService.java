package br.unesp.locadora.service;

import br.unesp.locadora.model.Fisica;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de clientes pessoa física.
 */
public class FisicaService extends IPersistenceService<Fisica> {

    public final int NOME = 0;
    public final int CPF = 1;
    public final int RG = 2;
    public final int NASCIMENTO = 3;
    public final int TELEFONE = 4;
    public final int EMAIL = 5;

    /**
     * Construtor.
     */
    public FisicaService() {
        super(Fisica.class);
    }

    /**
     * Retorna lista de clientes pessoa física.
     *
     * @return Lista de clientes pessoa física.
     */
    public List<Fisica> list() {

        List<Fisica> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select c from Fisica c order by c.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de clientes pessoa física.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de clientes pessoa física.
     */
    public List<Fisica> list(String value, int column) {

        List<Fisica> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case NOME:
                    query = getEntityManager().createQuery("select c from Fisica c where c.nome like concat('%', :nome, '%') order by c.nome");
                    query.setParameter("nome", value);
                    break;
                case CPF:
                    query = getEntityManager().createQuery("select c from Fisica c where c.cpf like concat('%', :cpf, '%') order by c.nome");
                    query.setParameter("cpf", value);
                    break;
                case RG:
                    query = getEntityManager().createQuery("select c from Fisica c where c.rg like concat('%', :rg, '%') order by c.nome");
                    query.setParameter("rg", value);
                    break;
                case NASCIMENTO:
                    query = getEntityManager().createQuery("select c from Fisica c where c.dataNascimento like concat('%', :nascimento, '%') order by c.nome");
                    query.setParameter("nascimento", value);
                    break;
                case TELEFONE:
                    query = getEntityManager().createQuery("select c from Fisica c where c.telefone like concat('%', :telefone, '%') order by c.nome");
                    query.setParameter("telefone", value);
                    break;
                case EMAIL:
                    query = getEntityManager().createQuery("select c from Fisica c where c.email like concat('%', :email, '%') order by c.nome");
                    query.setParameter("email", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select c from Fisica c order by c.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
