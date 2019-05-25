package br.unesp.locadora.model;

import java.time.LocalDate;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Cliente pessoa física.
 */
@Entity
@DiscriminatorValue("fisica")
public class Fisica extends Cliente {

    /**
     * CPF do cliente.
     */
    private String cpf;

    /**
     * RG do cliente.
     */
    private String rg;

    /**
     * Data de nascimento do cliente.
     */
    private LocalDate dataNascimento;

    /**
     * Construtor.
     */
    public Fisica() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * @param rg RG do cliente.
     * @param dataNascimento Data de nascimento do cliente.
     * @param telefone Telefone do cliente.
     * @param email Email do cliente.
     * @param endereco Endereço do cliente.
     */
    public Fisica(String nome, String cpf, String rg, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" + "id=" + getId() + ", nome=" + getNome() + ", telefone=" + getTelefone() + ", email=" + getEmail() + ", endereco=" + getEndereco() + ", cpf=" + getCpf() + ", rg=" + getRg() + ", dataNascimento=" + getDataNascimento() + '}';
    }

}
