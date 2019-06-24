package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Marca;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Renderer de JComboBox para marca.
 */
public class MarcaListCellRenderer implements ListCellRenderer {

    private final DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        JLabel jLabel = (JLabel) defaultListCellRenderer.getListCellRendererComponent(jlist, i, i, bln, bln1);

        if (e != null) {
            if (e instanceof Marca) {
                Marca marca = (Marca) e;
                jLabel.setText(String.format("%04d - %s", marca.getId(), marca.getNome()));
            } else {
                jLabel.setText(e.toString());
            }
        } else {
            jLabel.setText("");
        }

        return jLabel;
    }

}
