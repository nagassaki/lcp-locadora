package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Fisica;
import br.unesp.locadora.model.Juridica;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Renderer de JComboBox para clientes.
 */
public class ClienteListCellRenderer implements ListCellRenderer {

    private final DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        JLabel jLabel = (JLabel) defaultListCellRenderer.getListCellRendererComponent(jlist, i, i, bln, bln1);

        if (e != null) {
            if (e instanceof Fisica) {
                Fisica cliente = (Fisica) e;
                jLabel.setText(String.format("%s - %s", cliente.getCpf(), cliente.getNome()));
            } else if (e instanceof Juridica) {
                Juridica cliente = (Juridica) e;
                jLabel.setText(String.format("%s - %s", cliente.getCnpj(), cliente.getNome()));
            } else {
                jLabel.setText(e.toString());
            }
        } else {
            jLabel.setText("");
        }

        return jLabel;
    }

}
