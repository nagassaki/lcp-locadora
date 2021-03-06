package br.unesp.locadora.gui.caracteristica;

import br.unesp.locadora.model.Caracteristica;
import br.unesp.locadora.service.CaracteristicaService;
import br.unesp.locadora.gui.util.JTableUtil;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SelecionarCaracteristicaForm extends javax.swing.JFrame {

    private Caracteristica caracteristica;

    /**
     * Serviço de persistência de características.
     */
    private CaracteristicaService caracteristicaService = new CaracteristicaService();

    /**
     * Creates new form ListarCaracteristicaForm
     */
    public SelecionarCaracteristicaForm() {
        initComponents();
        atualizarTabela();
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
        scroll = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painel2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        faixa2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Características");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));

        faixa1.setBackground(new java.awt.Color(44, 62, 80));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title_caracteristicas.png"))); // NOI18N

        javax.swing.GroupLayout faixa1Layout = new javax.swing.GroupLayout(faixa1);
        faixa1.setLayout(faixa1Layout);
        faixa1Layout.setHorizontalGroup(
            faixa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        faixa1Layout.setVerticalGroup(
            faixa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        painel1.setLayout(new java.awt.BorderLayout());

        scroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollMouseClicked(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabela);

        painel1.add(scroll, java.awt.BorderLayout.CENTER);

        painel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        painel2.add(btnAdicionar);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.setEnabled(false);
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        painel2.add(btnSelecionar);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painel2.add(btnSair);

        painel1.add(painel2, java.awt.BorderLayout.SOUTH);

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
                .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faixa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        AdicionarCaracteristicaForm form = new AdicionarCaracteristicaForm();

        form.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent evt) {
                atualizarTabela();
                selecionarCaracteristica(form.getCaracteristica());
                btnSelecionarActionPerformed(null);
            }

        });

        form.setFechar(true);
        form.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (idLinhaSelecionada() != -1) {
            caracteristica = caracteristicaService.getById(idLinhaSelecionada());
            sair();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (tabela.rowAtPoint(evt.getPoint()) > -1) {
            btnSelecionar.setEnabled(true);
        }

        if (evt.getClickCount() == 2) {
            btnSelecionarActionPerformed(null);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void scrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollMouseClicked
        removerSelecao();
    }//GEN-LAST:event_scrollMouseClicked

    /**
     * Fecha formulário.
     */
    private void sair() {
        setVisible(true);
        dispose();
    }

    /**
     * Remove seleção da tabela.
     */
    private void removerSelecao() {
        tabela.clearSelection();
        btnSelecionar.setEnabled(false);
    }

    /**
     * Atualiza dados da tabela.
     */
    private void atualizarTabela() {
        JTableUtil.fillCaracteristicas(tabela, caracteristicaService.list());
        removerSelecao();
    }

    /**
     * Retorna ID da característica selecionada.
     *
     * @return ID da característica.
     */
    private int idLinhaSelecionada() {

        int id = -1;

        if (tabela.getSelectedRow() != -1) {
            id = Integer.parseInt(tabela.getModel().getValueAt(tabela.getSelectedRow(), 0).toString());
        }

        return id;
    }

    /**
     * Seleciona uma característica na tabela.
     *
     * @param caracteristica Característica.
     */
    private void selecionarCaracteristica(Caracteristica caracteristica) {
        if (caracteristica != null) {
            int id;
            boolean encontrado = false;
            for (int i = 0; !encontrado && i < tabela.getRowCount(); i++) {
                id = Integer.parseInt(tabela.getModel().getValueAt(i, 0).toString());
                if (caracteristica.getId() == id) {
                    encontrado = true;
                    tabela.setRowSelectionInterval(i, i);
                }
            }
        }
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
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
            java.util.logging.Logger.getLogger(SelecionarCaracteristicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarCaracteristicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarCaracteristicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarCaracteristicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarCaracteristicaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JPanel faixa1;
    private javax.swing.JPanel faixa2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
