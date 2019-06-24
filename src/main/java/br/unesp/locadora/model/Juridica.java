package br.unesp.locadora.model;

import br.unesp.locadora.util.Validar;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Cliente pessoa jurídica.
 */
@Entity
@DiscriminatorValue("juridica")
public class Juridica extends Cliente {

    /**
     * Razão social do cliente.
     */
    private String razaoSocial;

    /**
     * CNPJ do cliente.
     */
    private String cnpj;

    /**
     * Inscrição estadual do cliente.
     */
    private String inscricaoEstadual;

    /**
     * Construtor.
     */
    public Juridica() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome do cliente.
     * @param razaoSocial Razão social do cliente.
     * @param cnpj CNPJ do cliente.
     * @param inscricaoEstadual Inscrição estadual do cliente.
     * @param telefone Telefone do cliente.
     * @param email Email do cliente.
     * @param endereco Endereço do cliente.
     */
    public Juridica(String nome, String razaoSocial, String cnpj, String inscricaoEstadual, String telefone, String email, Endereco endereco) {

        super(nome, telefone, email, endereco);

        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);

        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public final void setRazaoSocial(String razaoSocial) {

        if (razaoSocial.trim().equals("")) {
            throw new IllegalArgumentException("Informe a razão social do cliente.");
        }

        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public final void setCnpj(String cnpj) {

        if (cnpj.trim().equals("")) {
            throw new IllegalArgumentException("Informe o CNPJ do cliente.");
        }

        if (!Validar.cnpj(cnpj.trim())) {
            throw new IllegalArgumentException("Informe um número de CNPJ válido.");
        }

        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Juridica{" + "id=" + getId() + ", nome=" + getNome() + ", telefone=" + getTelefone() + ", email=" + getEmail() + ", endereco=" + getEndereco() + ", razaoSocial=" + getRazaoSocial() + ", cnpj=" + getCnpj() + ", inscricaoEstadual=" + getInscricaoEstadual() + '}';
    }

}
