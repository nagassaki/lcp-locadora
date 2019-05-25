package br.unesp.locadora.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Categoria de valor um veículo.
 */
@Entity
public class Categoria {

    /**
     * Identificador da categoria.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome da categoria.
     */
    private String nome;

    /**
     * Valor da diária da categoria.
     */
    private BigDecimal diaria;

    /**
     * Valor de multa diária da categoria.
     */
    private BigDecimal multa;

    /**
     * Construtor.
     */
    public Categoria() {

    }

    /**
     * Construtor.
     *
     * @param nome Nome da categoria.
     * @param diaria Valor da diária da categoria.
     * @param multa Valor de multa diária da categoria.
     */
    public Categoria(String nome, BigDecimal diaria, BigDecimal multa) {
        this.nome = nome;
        this.diaria = diaria;
        this.multa = multa;
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

    public BigDecimal getDiaria() {
        return diaria;
    }

    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }

    public BigDecimal getMulta() {
        return multa;
    }

    public void setMulta(BigDecimal multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + getId() + ", nome=" + getNome() + ", diaria=" + getDiaria() + ", multa=" + getMulta() + '}';
    }

}
