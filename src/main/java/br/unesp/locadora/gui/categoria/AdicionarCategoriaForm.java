package br.unesp.locadora.gui.categoria;

import br.unesp.locadora.model.Categoria;
import br.unesp.locadora.service.CategoriaService;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class AdicionarCategoriaForm extends javax.swing.JFrame {

    /**
     * Categoria criada.
     */
    private Categoria categoria;

    /**
     * Flag para fechar formulário.
     */
    private boolean fechar;

    /**
     * Serviço de persistência de categorias.
     */
    private CategoriaService categoriaService = new CategoriaService();

    /**
     * Creates new form AdicionarCategoriaForm
     */
    public AdicionarCategoriaForm() {
        initComponents();
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
        lblDiaria = new javax.swing.JLabel();
        txtDiaria = new javax.swing.JFormattedTextField();
        lblMulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JFormattedTextField();
        painel3 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        faixa2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Categoria");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));

        faixa1.setBackground(new java.awt.Color(44, 62, 80));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title_categoria.png"))); // NOI18N

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

        lblDiaria.setText("Diária:");

        txtDiaria.setColumns(10);
        txtDiaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        lblMulta.setText("Multa:");

        txtMulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblDiaria)
                            .addComponent(lblMulta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMulta))
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
                .addComponent(lblDiaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel1.add(painel2, java.awt.BorderLayout.CENTER);

        painel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        painel3.add(btnAdicionar);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painel3.add(btnSair);

        painel1.add(painel3, java.awt.BorderLayout.SOUTH);

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

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {

            categoria = new Categoria();

            categoria.setNome(txtNome.getText().trim());
            categoria.setDiaria(new BigDecimal((txtDiaria.getText().trim().equals("") ? "0.00" : txtDiaria.getText().replace(",", "."))));
            categoria.setMulta(new BigDecimal((txtMulta.getText().trim().equals("") ? "0.00" : txtMulta.getText().replace(",", "."))));

            categoriaService.save(categoria);
            limparFormulario();

            if (fechar) {
                sair();
            } else {
                JOptionPane.showMessageDialog(this, "Categoria adicionada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * Limpa formulário.
     */
    private void limparFormulario() {
        txtNome.setText("");
        txtDiaria.setText("");
        txtMulta.setText("");
    }

    /**
     * Fecha formulário.
     */
    private void sair() {
        setVisible(true);
        dispose();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setFechar(boolean fechar) {
        this.fechar = fechar;
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
            java.util.logging.Logger.getLogger(AdicionarCategoriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarCategoriaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel faixa1;
    private javax.swing.JPanel faixa2;
    private javax.swing.JLabel lblDiaria;
    private javax.swing.JLabel lblMulta;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JLabel titulo;
    private javax.swing.JFormattedTextField txtDiaria;
    private javax.swing.JFormattedTextField txtMulta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
