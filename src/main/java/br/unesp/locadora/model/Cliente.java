package br.unesp.locadora.model;

import br.unesp.locadora.util.Validar;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Cliente.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Cliente {

    /**
     * Identificador do cliente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome do cliente. Para pessoa física representa o nome. Para pessoa
     * jurídica representa o nome fantasia.
     */
    private String nome;

    /**
     * Telefone do cliente.
     */
    private String telefone;

    /**
     * Email do cliente.
     */
    private String email;

    /**
     * Endereço do cliente.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco")
    private Endereco endereco;

    /**
     * Construtor.
     */
    public Cliente() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome do cliente.
     * @param telefone Telefone do cliente.
     * @param email Email do cliente.
     * @param endereco Endereço do cliente.
     */
    public Cliente(String nome, String telefone, String email, Endereco endereco) {

        setNome(nome);
        setTelefone(telefone);
        setEmail(email);

        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {

        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Informe o nome/razão social do cliente.");
        }

        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public final void setTelefone(String telefone) {

        if (!telefone.trim().equals("") && !Validar.telefone(telefone.trim())) {
            throw new IllegalArgumentException("Informe um número de telefone válido.");
        }

        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {

        if (!email.trim().equals("") && !Validar.email(email.trim())) {
            throw new IllegalArgumentException("Informe um endereço de e-mail válido.");
        }

        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + getId() + ", nome=" + getNome() + ", telefone=" + getTelefone() + ", email=" + getEmail() + ", endereco=" + getEndereco() + '}';
    }

}
