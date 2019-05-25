package br.unesp.locadora.model;

import java.math.BigDecimal;
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
     * Valor da fatura.
     */
    private BigDecimal valor;

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
     * @param valor Valor da fatura.
     */
    public Fatura(LocalDateTime data, Pedido pedido, BigDecimal valor) {
        this.data = data;
        this.pedido = pedido;
        this.valor = valor;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Fatura{" + "id=" + getId() + ", data=" + getData() + ", pedido=" + getPedido() + ", valor=" + getValor() + '}';
    }

}
