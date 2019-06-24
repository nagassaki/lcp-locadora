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
     * Flag de cancelamento do pedido.
     */
    private boolean cancelado;

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
     */
    public Pedido(LocalDateTime data, Veiculo veiculo, Cliente cliente, LocalDateTime retirada, LocalDateTime devolucao) {
        setData(data);
        setVeiculo(veiculo);
        setCliente(cliente);
        setRetirada(retirada);
        setDevolucao(devolucao);
        calcular();
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
        setData(data);
        setCliente(cliente);
        setRetirada(retirada);
        setDevolucao(devolucao);
        setValor(valor);
    }

    /**
     * Calcula o total do pedido.
     */
    public final void calcular() {
        long dias = Duration.between(retirada, devolucao).toDays();
        valor = veiculo.getModelo().getCategoria().getDiaria().multiply(new BigDecimal(dias));
    }

    /**
     * Marca pedido como finalizado.
     *
     * @return Fatura do pedido.
     */
    public Fatura finalizar() {

        finalizado = true;

        Fatura fatura = new Fatura();

        fatura.setData(LocalDateTime.now());
        fatura.setPedido(this);
        fatura.calcular();

        return fatura;
    }

    /**
     * Marca pedido como cancelado.
     */
    public void cancelar() {
        cancelado = true;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public final void setData(LocalDateTime data) {

        if (data == null) {
            throw new IllegalArgumentException("Informe a data do pedido.");
        }

        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public final void setVeiculo(Veiculo veiculo) {

        if (veiculo == null) {
            throw new IllegalArgumentException("Informe o veículo do pedido.");
        }

        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public final void setCliente(Cliente cliente) {

        if (cliente == null) {
            throw new IllegalArgumentException("Informe o cliente do pedido.");
        }

        this.cliente = cliente;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public final void setRetirada(LocalDateTime retirada) {

        if (retirada == null) {
            throw new IllegalArgumentException("Informe a data de retirada do pedido.");
        }

        this.retirada = retirada;
    }

    public LocalDateTime getDevolucao() {
        return devolucao;
    }

    public final void setDevolucao(LocalDateTime devolucao) {

        if (devolucao == null) {
            throw new IllegalArgumentException("Informe a data de devolução do pedido.");
        }

        if (devolucao.isBefore(retirada)) {
            throw new IllegalArgumentException("A data de devolução deve ser posterior a data de retirada.");
        }

        this.devolucao = devolucao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public final void setValor(BigDecimal valor) {

        if (valor == null) {
            throw new IllegalArgumentException("Informe o valor do pedido.");
        }

        if (valor.signum() == -1) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        this.valor = valor;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + getId() + ", data=" + getData() + ", veiculo=" + getVeiculo() + ", cliente=" + getCliente() + ", retirada=" + getRetirada() + ", devolucao=" + getDevolucao() + ", valor=" + getValor() + ", finalizado=" + isFinalizado() + ", cancelado=" + isCancelado() + '}';
    }

}
