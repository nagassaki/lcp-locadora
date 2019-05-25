package br.unesp.locadora.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Pedido.
 */
@Entity
public class Pedido {

    /**
     * Identificador do pedido.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Data do pedido.
     */
    private LocalDateTime data;

    /**
     * Veículo do pedido.
     */
    @ManyToOne
    @JoinColumn(name = "veiculo")
    private Veiculo veiculo;

    /**
     * Cliente do pedido.
     */
    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    /**
     * Data de retirada dos veículos.
     */
    private LocalDateTime retirada;

    /**
     * Data de devolução dos veículos.
     */
    private LocalDateTime devolucao;

    /**
     * Valor do pedido.
     */
    private BigDecimal valor;

    /**
     * Flag de finalização do pedido.
     */
    private boolean finalizado;

    /**
     * Construtor.
     */
    public Pedido() {

    }

    /**
     * Construtor.
     *
     * @param data Data de retirada dos veículos.
     * @param veiculo Veículo do pedido.
     * @param cliente Cliente do pedido.
     * @param retirada Data de retirada dos veículos.
     * @param devolucao Data de devolução dos veículos.
     * @param valor Valor do pedido.
     */
    public Pedido(LocalDateTime data, Veiculo veiculo, Cliente cliente, LocalDateTime retirada, LocalDateTime devolucao, BigDecimal valor) {
        this.data = data;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.valor = valor;
    }

    /**
     * Marca pedido como finalizado.
     *
     * @return Fatura do pedido.
     */
    public Fatura finalizar() {

        LocalDateTime hoje = LocalDateTime.now();
        Fatura fatura = new Fatura();

        fatura.setData(hoje);
        fatura.setPedido(this);
        fatura.setValor(valor);

        if (hoje.isAfter(devolucao)) {
            long dias = Duration.between(devolucao, hoje).toDays();
            fatura.setValor(fatura.getValor().add(veiculo.getModelo().getCategoria().getMulta().multiply(new BigDecimal(dias))));
        }

        setFinalizado(true);

        return fatura;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    public LocalDateTime getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDateTime devolucao) {
        this.devolucao = devolucao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + getId() + ", data=" + getData() + ", veiculo=" + getVeiculo() + ", cliente=" + getCliente() + ", retirada=" + getRetirada() + ", devolucao=" + getDevolucao() + ", valor=" + getValor() + ", finalizado=" + isFinalizado() + '}';
    }

}
