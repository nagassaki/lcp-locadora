package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Modelo;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Renderer de JComboBox para modelos.
 */
public class ModeloListCellRenderer implements ListCellRenderer {

    private final DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        JLabel jLabel = (JLabel) defaultListCellRenderer.getListCellRendererComponent(jlist, i, i, bln, bln1);

        if (e != null) {
            if (e instanceof Modelo) {
                Modelo modelo = (Modelo) e;
                jLabel.setText(String.format("%04d - %s", modelo.getId(), modelo.getNome()));
            } else {
                jLabel.setText(e.toString());
            }
        } else {
            jLabel.setText("");
        }

        return jLabel;
    }

}
