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
        setNome(nome);
        setDiaria(diaria);
        setMulta(multa);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {

        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Informe o nome da categoria.");
        }

        this.nome = nome;
    }

    public BigDecimal getDiaria() {
        return diaria;
    }

    public final void setDiaria(BigDecimal diaria) {

        if (diaria == null) {
            throw new IllegalArgumentException("Informe a diária da categoria.");
        }

        if (diaria.signum() == -1) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }

        this.diaria = diaria;
    }

    public BigDecimal getMulta() {
        return multa;
    }

    public final void setMulta(BigDecimal multa) {

        if (multa == null) {
            throw new IllegalArgumentException("Informe a multa da categoria.");
        }

        if (multa.signum() == -1) {
            throw new IllegalArgumentException("O valor da multa não pode ser negativo.");
        }

        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + getId() + ", nome=" + getNome() + ", diaria=" + getDiaria() + ", multa=" + getMulta() + '}';
    }

}
