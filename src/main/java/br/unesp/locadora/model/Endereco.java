package br.unesp.locadora.model;

import br.unesp.locadora.util.Validar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Endereço de um cliente.
 */
@Entity
public final class Endereco {

    /**
     * Identificador do endereço.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * CEP do endereço.
     */
    private String cep;

    /**
     * Estado do endereço.
     */
    private String estado;

    /**
     * Cidade do endereço.
     */
    private String cidade;

    /**
     * Bairro do endereço.
     */
    private String bairro;

    /**
     * Endereço.
     */
    private String endereco;

    /**
     * Número do endereço.
     */
    private int numero;

    /**
     * Complemento do endereço.
     */
    private String complemento;

    /**
     * Construtor.
     */
    public Endereco() {

    }

    /**
     * Construtor.
     *
     * @param cep CEP do endereço.
     * @param estado Estado do endereço.
     * @param cidade Cidade do endereço.
     * @param bairro Bairro do endereço.
     * @param endereco Endereço.
     * @param numero Número do endereço.
     */
    public Endereco(String cep, String estado, String cidade, String bairro, String endereco, int numero) {

        setCep(cep);
        setNumero(numero);

        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
    }

    /**
     * Construtor.
     *
     * @param cep CEP do endereço.
     * @param estado Estado do endereço.
     * @param cidade Cidade do endereço.
     * @param bairro Bairro do endereço.
     * @param endereco Endereço.
     * @param numero Número do endereço.
     * @param complemento Complemento do endereço.
     */
    public Endereco(String cep, String estado, String cidade, String bairro, String endereco, int numero, String complemento) {

        setCep(cep);
        setNumero(numero);

        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public final void setCep(String cep) {

        if (!cep.trim().equals("") && !Validar.cep(cep.trim())) {
            throw new IllegalArgumentException("Informe um número de CEP válido.");
        }

        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("Informe um número válido.");
        }

        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + getId() + ", cep=" + getCep() + ", estado=" + getEstado() + ", cidade=" + getCidade() + ", bairro=" + getBairro() + ", endereco=" + getEndereco() + ", numero=" + getNumero() + ", complemento=" + getComplemento() + '}';
    }

}
