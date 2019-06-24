package br.unesp.locadora.gui.pedido;

import br.unesp.locadora.model.Fatura;
import br.unesp.locadora.model.Pedido;
import br.unesp.locadora.service.FaturaService;
import br.unesp.locadora.service.PedidoService;
import javax.swing.JOptionPane;

public class FinalizarPedidoForm extends javax.swing.JFrame {

    /**
     * ID do pedio.
     */
    private int id;

    /**
     * Pedido.
     */
    private Pedido pedido;

    /**
     * Fatura do pedido.
     */
    private Fatura fatura;

    /**
     * Serviço de persistência de pedidos.
     */
    PedidoService pedidoService = new PedidoService();

    /**
     * Serviço de persistência de faturas.
     */
    FaturaService faturaService = new FaturaService();

    /**
     * Creates new form FinalizarPedidoForm
     */
    public FinalizarPedidoForm() {
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
        lblVeiculo = new javax.swing.JLabel();
        txtVeiculo = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblMulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        painel3 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        txtSair = new javax.swing.JButton();
        faixa2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finalizar Pedido");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));

        faixa1.setBackground(new java.awt.Color(44, 62, 80));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title_pedido.png"))); // NOI18N

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

        lblVeiculo.setText("Veículo:");

        txtVeiculo.setEditable(false);

        lblCliente.setText("Cliente:");

        txtCliente.setEditable(false);

        lblValor.setText("Valor:");

        txtValor.setEditable(false);

        lblMulta.setText("Multa:");

        txtMulta.setEditable(false);

        lblTotal.setText("Total:");

        txtTotal.setEditable(false);

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVeiculo)
                    .addComponent(txtCliente)
                    .addComponent(txtValor)
                    .addComponent(txtMulta)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVeiculo)
                            .addComponent(lblCliente)
                            .addComponent(lblValor)
                            .addComponent(lblMulta)
                            .addComponent(lblTotal))
                        .addGap(0, 543, Short.MAX_VALUE))
                    .addComponent(txtTotal))
                .addContainerGap())
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel1.add(painel2, java.awt.BorderLayout.CENTER);

        painel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        painel3.add(btnFinalizar);

        txtSair.setText("Sair");
        txtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSairActionPerformed(evt);
            }
        });
        painel3.add(txtSair);

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

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {

            pedidoService.save(pedido);
            faturaService.save(fatura);

            JOptionPane.showMessageDialog(this, "Pedido finalizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            visualizar();
            sair();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSairActionPerformed
        sair();
    }//GEN-LAST:event_txtSairActionPerformed

    /**
     * Preenche formulário.
     */
    private void preencherFormulario() {

        pedido = pedidoService.getById(id);
        fatura = pedido.finalizar();

        txtVeiculo.setText(String.format("%s - %s, %s", pedido.getVeiculo().getPlaca(), pedido.getVeiculo().getModelo().getNome(), pedido.getVeiculo().getModelo().getMarca().getNome()));
        txtCliente.setText(pedido.getCliente().getNome());
        txtValor.setText(fatura.getValor().toString());
        txtMulta.setText(fatura.getMulta().toString());
        txtTotal.setText(fatura.getTotal().toString());
    }
    
    /**
     * Fecha formulário.
     */
    private void sair() {
        setVisible(true);
        dispose();
    }
    
    /**
     * Abre formulário de visualização de pedido.
     */
    private void visualizar() {
        VisualizarPedidoForm form = new VisualizarPedidoForm();
        form.setId(pedido.getId());
        form.setVisible(true);
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
            java.util.logging.Logger.getLogger(FinalizarPedidoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarPedidoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarPedidoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarPedidoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarPedidoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JPanel faixa1;
    private javax.swing.JPanel faixa2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMulta;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JButton txtSair;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVeiculo;
    // End of variables declaration//GEN-END:variables
}
