package br.unesp.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Veículo.
 */
@Entity
public class Veiculo {

    /**
     * Identificador do veículo.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Modelo do veículo.
     */
    @ManyToOne
    @JoinColumn(name = "modelo")
    private Modelo modelo;

    /**
     * Cor do veículo.
     */
    @ManyToOne
    @JoinColumn(name = "cor")
    private Cor cor;

    /**
     * Placa do veículo.
     */
    private String placa;

    /**
     * RENAVAM do veículo.
     */
    private String renavam;

    /**
     * Construtor.
     */
    public Veiculo() {

    }

    /**
     * Construtor.
     *
     * @param modelo Modelo do veículo.
     * @param cor Cor do veículo.
     * @param placa Placa do veículo.
     * @param renavam RENAVAM do veículo.
     */
    public Veiculo(Modelo modelo, Cor cor, String placa, String renavam) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.renavam = renavam;
    }

    public int getId() {
        return id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + getId() + ", modelo=" + getModelo().getNome() + ", cor=" + getCor().getNome() + ", placa=" + getPlaca() + ", renavam=" + getRenavam() + '}';
    }

}
