package br.unesp.locadora.gui.modelo;

import br.unesp.locadora.gui.caracteristica.SelecionarCaracteristicaForm;
import br.unesp.locadora.gui.categoria.AdicionarCategoriaForm;
import br.unesp.locadora.gui.marca.AdicionarMarcaForm;
import br.unesp.locadora.gui.util.CategoriaListCellRenderer;
import br.unesp.locadora.gui.util.MarcaListCellRenderer;
import br.unesp.locadora.model.Caracteristica;
import br.unesp.locadora.model.Categoria;
import br.unesp.locadora.model.Marca;
import br.unesp.locadora.model.Modelo;
import br.unesp.locadora.service.CategoriaService;
import br.unesp.locadora.service.MarcaService;
import br.unesp.locadora.service.ModeloService;
import br.unesp.locadora.gui.util.JComboBoxUtil;
import br.unesp.locadora.gui.util.JTableUtil;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EditarModeloForm extends javax.swing.JFrame {

    /**
     * ID do modelo;
     */
    private int id;

    /**
     * Lista de características.
     */
    private List<Caracteristica> caracteristicas = new ArrayList<>();

    /**
     * Serviço de persistência de modelos.
     */
    private ModeloService modeloService = new ModeloService();

    /**
     * Serviço de persistência de marcas.
     */
    private MarcaService marcaService = new MarcaService();

    /**
     * Serviço de persistência de categorias.
     */
    private CategoriaService categoriaService = new CategoriaService();

    /**
     * Creates new form EditarModeloForm
     */
    public EditarModeloForm() {
        initComponents();
        carregarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faixa1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        btnAdicionarMarca = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnAdicionarCategoria = new javax.swing.JButton();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();
        lblCaracteristicas = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();
        painel4 = new javax.swing.JPanel();
        btnAdicionarCaracteristica = new javax.swing.JButton();
        btnExcluirCaracteristica = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tblCaracteristicas = new javax.swing.JTable();
        painel5 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        faixa2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Modelo");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));

        faixa1.setBackground(new java.awt.Color(44, 62, 80));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title_modelo.png"))); // NOI18N

        javax.swing.GroupLayout faixa1Layout = new javax.swing.GroupLayout(faixa1);
        faixa1.setLayout(faixa1Layout);
        faixa1Layout.setHorizontalGroup(
            faixa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        faixa1Layout.setVerticalGroup(
            faixa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        painel1.setLayout(new java.awt.BorderLayout());

        lblNome.setText("Nome:");

        lblMarca.setText("Marca:");

        cbxMarca.setRenderer(new MarcaListCellRenderer());

        btnAdicionarMarca.setText("+");
        btnAdicionarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMarcaActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria:");

        cbxCategoria.setRenderer(new CategoriaListCellRenderer());

        btnAdicionarCategoria.setText("+");
        btnAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCategoriaActionPerformed(evt);
            }
        });

        lblAno.setText("Ano:");

        txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));

        lblCaracteristicas.setText("Características:");

        painel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        btnAdicionarCaracteristica.setText("Adicionar");
        btnAdicionarCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCaracteristicaActionPerformed(evt);
            }
        });
        painel4.add(btnAdicionarCaracteristica);

        btnExcluirCaracteristica.setText("Excluir");
        btnExcluirCaracteristica.setEnabled(false);
        btnExcluirCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCaracteristicaActionPerformed(evt);
            }
        });
        painel4.add(btnExcluirCaracteristica);

        scroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollMouseClicked(evt);
            }
        });

        tblCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCaracteristicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCaracteristicasMouseClicked(evt);
            }
        });
        scroll.setViewportView(tblCaracteristicas);

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAno)
                    .addComponent(txtNome)
                    .addComponent(painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblMarca)
                            .addComponent(lblCategoria)
                            .addComponent(lblAno)
                            .addComponent(lblCaracteristicas))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarMarca)
                            .addComponent(btnAdicionarCategoria, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCaracteristicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel1.add(painel2, java.awt.BorderLayout.CENTER);

        painel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        painel5.add(btnAtualizar);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painel5.add(btnSair);

        painel1.add(painel5, java.awt.BorderLayout.SOUTH);

        faixa2.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout faixa2Layout = new javax.swing.GroupLayout(faixa2);
        faixa2.setLayout(faixa2Layout);
        faixa2Layout.setHorizontalGroup(
            faixa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        faixa2Layout.setVerticalGroup(
            faixa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(faixa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(faixa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(faixa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faixa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMarcaActionPerformed

        AdicionarMarcaForm form = new AdicionarMarcaForm();

        form.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent evt) {
                if (form.getMarca() != null) {
                    atualizarMarcas();
                    cbxMarca.setSelectedItem(form.getMarca());
                }
            }

        });

        form.setFechar(true);
        form.setVisible(true);
    }//GEN-LAST:event_btnAdicionarMarcaActionPerformed

    private void btnAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCategoriaActionPerformed

        AdicionarCategoriaForm form = new AdicionarCategoriaForm();

        form.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent evt) {
                if (form.getCategoria() != null) {
                    atualizarCategorias();
                    cbxCategoria.setSelectedItem(form.getCategoria());
                }
            }

        });

        form.setFechar(true);
        form.setVisible(true);
    }//GEN-LAST:event_btnAdicionarCategoriaActionPerformed

    private void btnAdicionarCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCaracteristicaActionPerformed

        SelecionarCaracteristicaForm form = new SelecionarCaracteristicaForm();

        form.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent evt) {
                if (form.getCaracteristica() != null) {
                    caracteristicas.add(form.getCaracteristica());
                    atualizarCaracteristicas();
                }
            }

        });

        form.setVisible(true);
    }//GEN-LAST:event_btnAdicionarCaracteristicaActionPerformed

    private void btnExcluirCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCaracteristicaActionPerformed
        if (tblCaracteristicas.getSelectedRow() != -1) {
            caracteristicas.remove(tblCaracteristicas.getSelectedRow());
            atualizarCaracteristicas();
            removerSelecao();
        }
    }//GEN-LAST:event_btnExcluirCaracteristicaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {

            Modelo modelo = modeloService.getById(id);

            modelo.setNome(txtNome.getText().trim());
            modelo.setMarca((Marca) cbxMarca.getSelectedItem());
            modelo.setCategoria((Categoria) cbxCategoria.getSelectedItem());
            modelo.setAno(Integer.parseInt(txtAno.getText()));
            modelo.setCaracteristicas(caracteristicas);

            modeloService.save(modelo);

            JOptionPane.showMessageDialog(this, "Modelo atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Informe um ano válido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblCaracteristicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaracteristicasMouseClicked
        if (tblCaracteristicas.rowAtPoint(evt.getPoint()) > -1) {
            btnExcluirCaracteristica.setEnabled(true);
        }
    }//GEN-LAST:event_tblCaracteristicasMouseClicked

    private void scrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollMouseClicked
        removerSelecao();
    }//GEN-LAST:event_scrollMouseClicked

    /**
     * Atualiza lista de marcas.
     */
    private void atualizarMarcas() {
        JComboBoxUtil.fillMarcas(cbxMarca, marcaService.list());
    }

    /**
     * Atualiza lista de categorias.
     */
    private void atualizarCategorias() {
        JComboBoxUtil.fillCategorias(cbxCategoria, categoriaService.list());
    }

    /**
     * Atualiza lista de características.
     */
    private void atualizarCaracteristicas() {
        JTableUtil.fillCaracteristicas(tblCaracteristicas, caracteristicas);
    }

    /**
     * Carrega informações do formulário.
     */
    private void carregarFormulario() {
        atualizarMarcas();
        atualizarCategorias();
    }

    /**
     * Preenche formulário.
     */
    private void preencherFormulario() {

        Modelo modelo = modeloService.getById(id);

        txtNome.setText(modelo.getNome());
        cbxMarca.setSelectedItem(modelo.getMarca());
        cbxCategoria.setSelectedItem(modelo.getCategoria());
        txtAno.setText(Integer.toString(modelo.getAno()));
        caracteristicas = modelo.getCaracteristicas();

        atualizarCaracteristicas();
    }

    /**
     * Remove seleção da tabela.
     */
    private void removerSelecao() {
        tblCaracteristicas.clearSelection();
        btnExcluirCaracteristica.setEnabled(false);
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
            preencherFormulario();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarModeloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarModeloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarModeloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarModeloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarModeloForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCaracteristica;
    private javax.swing.JButton btnAdicionarCategoria;
    private javax.swing.JButton btnAdicionarMarca;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluirCaracteristica;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<Categoria> cbxCategoria;
    private javax.swing.JComboBox<Marca> cbxMarca;
    private javax.swing.JPanel faixa1;
    private javax.swing.JPanel faixa2;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painel4;
    private javax.swing.JPanel painel5;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblCaracteristicas;
    private javax.swing.JLabel titulo;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
