package br.unesp.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Característica de um veículo.
 */
@Entity
public class Caracteristica {

    /**
     * Identificador da caracteristica.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome da característica.
     */
    private String nome;

    /**
     * Construtor.
     */
    public Caracteristica() {

    }

    /**
     * Construtor.
     *
     * @param nome nome da característica.
     */
    public Caracteristica(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Caracteristica{" + "id=" + getId() + ", nome=" + getNome() + '}';
    }

}
