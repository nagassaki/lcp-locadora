package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Cor;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Renderer de JComboBox para cores.
 */
public class CorListCellRenderer implements ListCellRenderer {

    private final DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        JLabel jLabel = (JLabel) defaultListCellRenderer.getListCellRendererComponent(jlist, i, i, bln, bln1);

        if (e != null) {
            if (e instanceof Cor) {
                Cor cor = (Cor) e;
                jLabel.setText(String.format("%04d - %s", cor.getId(), cor.getNome()));
            } else {
                jLabel.setText(e.toString());
            }
        } else {
            jLabel.setText("");
        }

        return jLabel;
    }

}
