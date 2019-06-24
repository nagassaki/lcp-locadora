package br.unesp.locadora.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Fatura de um pedido.
 */
@Entity
public class Fatura {

    /**
     * Identificador da fatura.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Data da fatura.
     */
    private LocalDateTime data;

    /**
     * Pedido da fatura.
     */
    @OneToOne
    @JoinColumn(name = "pedido")
    private Pedido pedido;

    /**
     * Valor do pedido.
     */
    private BigDecimal valor;

    /**
     * Valor da multa.
     */
    private BigDecimal multa;

    /**
     * Valor da fatura.
     */
    private BigDecimal total;

    /**
     * Construtor.
     */
    public Fatura() {

    }

    /**
     * Construtor.
     *
     * @param data Data da fatura.
     * @param pedido Pedido da fatura.
     * @param valor Valor do pedido.
     */
    public Fatura(LocalDateTime data, Pedido pedido, BigDecimal valor) {

        setData(data);
        setPedido(pedido);

        if (valor == null) {
            throw new IllegalArgumentException("Informe o valor da fatura.");
        }

        if (valor.signum() == -1) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        this.valor = valor;
        multa = BigDecimal.ZERO;
        total = valor;
    }

    /**
     * Construtor.
     *
     * @param data Data da fatura.
     * @param pedido Pedido da fatura.
     * @param valor Valor do pedido.
     * @param multa Valor da multa.
     */
    public Fatura(LocalDateTime data, Pedido pedido, BigDecimal valor, BigDecimal multa) {

        setData(data);
        setPedido(pedido);

        if (valor == null) {
            throw new IllegalArgumentException("Informe o valor da fatura.");
        }

        if (valor.signum() == -1) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        if (multa == null) {
            throw new IllegalArgumentException("Informe a multa da fatura.");
        }

        if (multa.signum() == -1) {
            throw new IllegalArgumentException("A multa não pode ser negativo.");
        }

        this.valor = valor;
        this.multa = multa;
        total = valor.add(multa);
    }

    public void calcular() {

        LocalDateTime hoje = LocalDateTime.now();
        valor = pedido.getValor();

        if (hoje.isAfter(pedido.getDevolucao())) {
            long dias = Duration.between(pedido.getDevolucao(), hoje).toDays();
            multa = pedido.getVeiculo().getModelo().getCategoria().getMulta().multiply(new BigDecimal(dias));
        } else {
            multa = BigDecimal.ZERO;
        }

        total = valor.add(multa);
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public final void setData(LocalDateTime data) {

        if (data == null) {
            throw new IllegalArgumentException("Informe a data da fatura.");
        }

        this.data = data;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public final void setPedido(Pedido pedido) {

        if (pedido == null) {
            throw new IllegalArgumentException("Informe o pedido da fatura.");
        }

        this.pedido = pedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public BigDecimal getMulta() {
        return multa;
    }

    public BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Fatura{" + "id=" + getId() + ", data=" + getData() + ", pedido=" + getPedido() + ", valor=" + getValor() + ", multa=" + getMulta() + ", total=" + getTotal() + '}';
    }

}
