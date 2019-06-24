package br.unesp.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Marca de um veículo.
 */
@Entity
public class Marca {

    /**
     * Identificador da marca.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome da marca.
     */
    private String nome;

    /**
     * Construtor.
     */
    public Marca() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome da marca.
     */
    public Marca(String nome) {
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {

        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Informe o nome da marca.");
        }

        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca{" + "id=" + getId() + ", nome=" + getNome() + '}';
    }

}
