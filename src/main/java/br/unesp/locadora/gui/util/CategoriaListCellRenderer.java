package br.unesp.locadora.gui.util;

import br.unesp.locadora.model.Categoria;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Renderer de JComboBox para categorias.
 */
public class CategoriaListCellRenderer implements ListCellRenderer {

    private final DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        JLabel jLabel = (JLabel) defaultListCellRenderer.getListCellRendererComponent(jlist, i, i, bln, bln1);

        if (e != null) {
            if (e instanceof Categoria) {
                Categoria categoria = (Categoria) e;
                jLabel.setText(String.format("%04d - %s", categoria.getId(), categoria.getNome()));
            } else {
                jLabel.setText(e.toString());
            }
        } else {
            jLabel.setText("");
        }

        return jLabel;
    }

}
