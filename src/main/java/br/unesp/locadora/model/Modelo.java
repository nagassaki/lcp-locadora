package br.unesp.locadora.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Modelo de um veículo.
 */
@Entity
public class Modelo {

    /**
     * Identificador do modelo.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Marca do modelo.
     */
    @ManyToOne
    @JoinColumn(name = "marca")
    private Marca marca;

    /**
     * Categoria do modelo.
     */
    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;

    /**
     * Ano do modelo.
     */
    private int ano;

    /**
     * Nome do modelo.
     */
    private String nome;

    /**
     * Características do modelo.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "modelo_caracteristica",
            joinColumns = {
                @JoinColumn(name = "modelo")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "caracteristica")
            })
    private List<Caracteristica> caracteristicas;

    /**
     * Construtor.
     */
    public Modelo() {

    }

    /**
     * Construtor.
     *
     * @param marca Marca do modelo.
     * @param categoria Categoria do modelo.
     * @param ano Ano do modelo.
     * @param nome Nome do modelo.
     */
    public Modelo(Marca marca, Categoria categoria, int ano, String nome) {
        setMarca(marca);
        setCategoria(categoria);
        setAno(ano);
        setNome(nome);
    }

    /**
     * Construtor.
     *
     * @param marca Marca do modelo.
     * @param categoria Categoria do modelo.
     * @param ano Ano do modelo.
     * @param nome Nome do modelo.
     * @param caracteristicas Características do modelo.
     */
    public Modelo(Marca marca, Categoria categoria, int ano, String nome, List<Caracteristica> caracteristicas) {

        setMarca(marca);
        setCategoria(categoria);
        setAno(ano);
        setNome(nome);

        this.caracteristicas = caracteristicas;
    }

    public int getId() {
        return id;
    }

    public Marca getMarca() {
        return marca;
    }

    public final void setMarca(Marca marca) {

        if (marca == null) {
            throw new IllegalArgumentException("Informe a marca do modelo.");
        }

        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public final void setCategoria(Categoria categoria) {

        if (categoria == null) {
            throw new IllegalArgumentException("Informe a categoria do modelo.");
        }

        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public final void setAno(int ano) {

        if (ano < 0) {
            throw new IllegalArgumentException("Informe uma ano válido.");
        }

        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {

        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Informe o nome do modelo.");
        }

        this.nome = nome;
    }

    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + getId() + ", marca=" + getMarca() + ", categoria=" + getCategoria() + ", ano=" + getAno() + ", nome=" + getNome() + ", caracteristicas=" + getCaracteristicas() + '}';
    }

}
