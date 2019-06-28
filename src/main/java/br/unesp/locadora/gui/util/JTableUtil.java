package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Caracteristica;
import br.unesp.locadora.model.Categoria;
import br.unesp.locadora.model.Cor;
import br.unesp.locadora.model.Fatura;
import br.unesp.locadora.model.Fisica;
import br.unesp.locadora.model.Juridica;
import br.unesp.locadora.model.Marca;
import br.unesp.locadora.model.Modelo;
import br.unesp.locadora.model.Pedido;
import br.unesp.locadora.model.Veiculo;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Utiliátio para manipulação de JTable.
 */
public class JTableUtil {

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param clientes Lista de clientes pessoa física.
     */
    public static void fillClientesFisica(JTable jTable, List<Fisica> clientes) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Fisica cliente : clientes) {
            model.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getRg(),
                (cliente.getDataNascimento() != null ? cliente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : ""),
                cliente.getTelefone(),
                cliente.getEmail()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param clientes Lista de clientes pessoa jurídica.
     */
    public static void fillClientesJuridica(JTable jTable, List<Juridica> clientes) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Juridica cliente : clientes) {
            model.addRow(new Object[]{
                cliente.getId(),
                cliente.getRazaoSocial(),
                cliente.getNome(),
                cliente.getCnpj(),
                cliente.getInscricaoEstadual(),
                cliente.getTelefone(),
                cliente.getEmail()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param pedidos Lista de pedidos.
     * @param data Flag para exibição de das datas de retirada e devolução.
     */
    public static void fillPedidos(JTable jTable, List<Pedido> pedidos, boolean data) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        if (data) {
            for (Pedido pedido : pedidos) {
                model.addRow(new Object[]{
                    pedido.getId(),
                    pedido.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    String.format("%s - %s, %s", pedido.getVeiculo().getPlaca(), pedido.getVeiculo().getModelo().getNome(), pedido.getVeiculo().getModelo().getMarca().getNome()),
                    pedido.getCliente().getNome(),
                    pedido.getRetirada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    pedido.getDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    pedido.getValor()
                });
            }
        } else {
            for (Pedido pedido : pedidos) {
                model.addRow(new Object[]{
                    pedido.getId(),
                    pedido.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    String.format("%s - %s, %s", pedido.getVeiculo().getPlaca(), pedido.getVeiculo().getModelo().getNome(), pedido.getVeiculo().getModelo().getMarca().getNome()),
                    pedido.getCliente().getNome(),
                    pedido.getValor()
                });
            }
        }

    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param faturas Lista de faturas.
     */
    public static void fillFaturas(JTable jTable, List<Fatura> faturas) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Fatura fatura : faturas) {
            model.addRow(new Object[]{
                fatura.getId(),
                fatura.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                fatura.getPedido().getId(),
                fatura.getValor(),
                fatura.getMulta(),
                fatura.getTotal()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param categorias Lista de categorias.
     */
    public static void fillCategorias(JTable jTable, List<Categoria> categorias) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Categoria categoria : categorias) {
            model.addRow(new Object[]{
                categoria.getId(),
                categoria.getNome(),
                categoria.getDiaria(),
                categoria.getMulta()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param marcas Lista de marcas.
     */
    public static void fillMarcas(JTable jTable, List<Marca> marcas) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Marca marca : marcas) {
            model.addRow(new Object[]{
                marca.getId(),
                marca.getNome()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param modelos Lista de modelos.
     */
    public static void fillModelos(JTable jTable, List<Modelo> modelos) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Modelo modelo : modelos) {
            model.addRow(new Object[]{
                modelo.getId(),
                modelo.getNome(),
                modelo.getMarca().getNome(),
                modelo.getAno(),
                modelo.getCategoria().getNome(),
                modelo.getCaracteristicas().stream().map(Caracteristica::getNome).collect(Collectors.toList()).toString().replace("[", "").replace("]", "")
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param cores Lista de cores.
     */
    public static void fillCores(JTable jTable, List<Cor> cores) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Cor cor : cores) {
            model.addRow(new Object[]{
                cor.getId(),
                cor.getNome()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param caracteristicas Lista de características.
     */
    public static void fillCaracteristicas(JTable jTable, List<Caracteristica> caracteristicas) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Caracteristica caracteristica : caracteristicas) {
            model.addRow(new Object[]{
                caracteristica.getId(),
                caracteristica.getNome()
            });
        }
    }

    /**
     * Preenche JTable.
     *
     * @param jTable JTable.
     * @param veiculos Lista de veículos.
     */
    public static void fillVeiculos(JTable jTable, List<Veiculo> veiculos) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);

        for (Veiculo veiculo : veiculos) {
            model.addRow(new Object[]{
                veiculo.getId(),
                String.format("%s %d", veiculo.getModelo().getNome(), veiculo.getModelo().getAno()),
                veiculo.getCor().getNome(),
                veiculo.getPlaca(),
                veiculo.getRenavam()
            });
        }
    }

    /**
     * Limpa JTable.
     *
     * @param jTable JTable.
     */
    public static void clear(JTable jTable) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);
    }

    /**
     * Remove linha da JTable.
     *
     * @param jTable JTable
     * @param indice Índice da linha.
     */
    public static void remove(JTable jTable, int indice) {
        if (jTable.getRowCount() > 0 && (indice > -1 && indice < jTable.getRowCount())) {
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.removeRow(indice);
        }
    }

}
