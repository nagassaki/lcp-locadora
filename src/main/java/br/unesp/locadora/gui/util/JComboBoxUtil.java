package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Categoria;
import br.unesp.locadora.model.Cliente;
import br.unesp.locadora.model.Cor;
import br.unesp.locadora.model.Marca;
import br.unesp.locadora.model.Modelo;
import br.unesp.locadora.model.Veiculo;
import java.util.List;
import javax.swing.JComboBox;

/**
 * Utiliátio para manipulação de JComboBox.
 */
public class JComboBoxUtil {

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param marcas Lista de marcas.
     */
    public static void fillMarcas(JComboBox<Marca> jComboBox, List<Marca> marcas) {

        jComboBox.removeAllItems();

        for (Marca marca : marcas) {
            jComboBox.addItem(marca);
        }
    }

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param categorias Lista de categorias.
     */
    public static void fillCategorias(JComboBox<Categoria> jComboBox, List<Categoria> categorias) {

        jComboBox.removeAllItems();

        for (Categoria categoria : categorias) {
            jComboBox.addItem(categoria);
        }
    }

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param modelos Lista de modelos.
     */
    public static void fillModelos(JComboBox<Modelo> jComboBox, List<Modelo> modelos) {

        jComboBox.removeAllItems();

        for (Modelo modelo : modelos) {
            jComboBox.addItem(modelo);
        }
    }

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param cores Lista de cores.
     */
    public static void fillCores(JComboBox<Cor> jComboBox, List<Cor> cores) {

        jComboBox.removeAllItems();

        for (Cor cor : cores) {
            jComboBox.addItem(cor);
        }
    }

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param veiculos Lista de veículos.
     */
    public static void fillVeiculos(JComboBox<Veiculo> jComboBox, List<Veiculo> veiculos) {

        jComboBox.removeAllItems();

        for (Veiculo veiculo : veiculos) {
            jComboBox.addItem(veiculo);
        }
    }

    /**
     * Preenche JComboBox.
     *
     * @param jComboBox JComboBox.
     * @param clientes Lista de clientes.
     */
    public static void fillClientes(JComboBox<Cliente> jComboBox, List<Cliente> clientes) {

        jComboBox.removeAllItems();

        for (Cliente cliente : clientes) {
            jComboBox.addItem(cliente);
        }
    }

}
