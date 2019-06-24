package br.unesp.locadora.model;

import br.unesp.locadora.util.Validar;
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
        setModelo(modelo);
        setCor(cor);
        setPlaca(placa);
        setRenavam(renavam);
    }

    public int getId() {
        return id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public final void setModelo(Modelo modelo) {

        if (modelo == null) {
            throw new IllegalArgumentException("Informe o modelo do veículo.");
        }

        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public final void setCor(Cor cor) {

        if (cor == null) {
            throw new IllegalArgumentException("Informe a cor do veículo.");
        }

        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {

        if (placa.trim().equals("")) {
            throw new IllegalArgumentException("Informe a placa do veículo.");
        }

        if (!Validar.placa(placa.trim())) {
            throw new IllegalArgumentException("Informe uma placa válida.");
        }

        this.placa = placa.toUpperCase();
    }

    public String getRenavam() {
        return renavam;
    }

    public final void setRenavam(String renavam) {

        if (renavam.trim().equals("")) {
            throw new IllegalArgumentException("Informe o RENAVAM do veículo.");
        }

        if (!Validar.renavam(renavam.trim())) {
            throw new IllegalArgumentException("Informe um RENAVAM válido.");
        }

        this.renavam = renavam;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + getId() + ", modelo=" + getModelo().getNome() + ", cor=" + getCor().getNome() + ", placa=" + getPlaca() + ", renavam=" + getRenavam() + '}';
    }

}
