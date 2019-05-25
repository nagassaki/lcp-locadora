package br.unesp.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Cor de um veículo.
 */
@Entity
public class Cor {

    /**
     * Identificador da cor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome da cor.
     */
    private String nome;

    /**
     * Construtor.
     */
    public Cor() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome da cor.
     */
    public Cor(String nome) {
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
        return "Cor{" + "id=" + getId() + ", nome=" + getNome() + '}';
    }

}
