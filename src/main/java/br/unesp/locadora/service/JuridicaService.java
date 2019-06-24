package br.unesp.locadora.service;

import br.unesp.locadora.model.Juridica;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 * Serviço de persistência de clientes pessoa jurídica.
 */
public class JuridicaService extends IPersistenceService<Juridica> {

    public final int RAZAO_SOCIAL = 0;
    public final int NOME_FANTASIA = 1;
    public final int CNPJ = 2;
    public final int IE = 3;
    public final int TELEFONE = 4;
    public final int EMAIL = 5;

    /**
     * Construtor.
     */
    public JuridicaService() {
        super(Juridica.class);
    }

    /**
     * Retorna lista de clientes pessoa jurídica.
     *
     * @return Lista de clientes pessoa jurídica.
     */
    public List<Juridica> list() {

        List<Juridica> resultado = new ArrayList<>();

        try {
            Query query = getEntityManager().createQuery("select c from Juridica c order by c.nome");
            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

    /**
     * Retorna lista de clientes pessoa jurídica.
     *
     * @param value Valor.
     * @param column Coluna.
     * @return Lista de clientes pessoa jurídica.
     */
    public List<Juridica> list(String value, int column) {

        List<Juridica> resultado = new ArrayList<>();

        try {

            Query query;

            switch (column) {
                case RAZAO_SOCIAL:
                    query = getEntityManager().createQuery("select c from Juridica c where c.razaoSocial like concat('%', :razao, '%') order by c.nome");
                    query.setParameter("razao", value);
                    break;
                case NOME_FANTASIA:
                    query = getEntityManager().createQuery("select c from Juridica c where c.nome like concat('%', :fantasia, '%') order by c.nome");
                    query.setParameter("fantasia", value);
                    break;
                case CNPJ:
                    query = getEntityManager().createQuery("select c from Juridica c where c.cnpj like concat('%', :cnpj, '%') order by c.nome");
                    query.setParameter("cnpj", value);
                    break;
                case IE:
                    query = getEntityManager().createQuery("select c from Juridica c where c.inscricaoEstadual like concat('%', :ie, '%') order by c.nome");
                    query.setParameter("ie", value);
                    break;
                case TELEFONE:
                    query = getEntityManager().createQuery("select c from Juridica c where c.telefone like concat('%', :telefone, '%') order by c.nome");
                    query.setParameter("telefone", value);
                    break;
                case EMAIL:
                    query = getEntityManager().createQuery("select c from Juridica c where c.email like concat('%', :email, '%') order by c.nome");
                    query.setParameter("email", value);
                    break;
                default:
                    query = getEntityManager().createQuery("select c from Juridica c order by c.nome");
            }

            resultado = query.getResultList();
        } catch (Exception ex) {

        }

        return resultado;
    }

}
