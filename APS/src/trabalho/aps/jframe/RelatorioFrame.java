package trabalho.aps.jframe;

import trabalho.aps.FormaEntrega;

public class RelatorioFrame extends javax.swing.JFrame {

    public RelatorioFrame() {
        initComponents();
        int cdPedido = FormaEntrega.buscarCdPedido();
        labelNumeroPedido.setText("" + cdPedido);
        labelResultEntrega.setText(FormaEntregaFrame.nmFormaEntrega);
        labelResultPagamento.setText(FormaPagamentoFrame.nmFormaPagamento);
        if(!FormaPagamentoFrame.nmFormaPagamento.equals("Dinheiro")){
            labelTroco.setText("");
            labelResultTroco.setText("");
        } else {
            labelResultTroco.setText("R$ " + FormaPagamentoFrame.trocoDouble);
        }
        labelResultValorTotal.setText("R$ " + Cardapio.valorTotal);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelNumeroPedido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelFormaEntrega = new javax.swing.JLabel();
        labelFormaPagamento = new javax.swing.JLabel();
        labelTroco = new javax.swing.JLabel();
        labelResultEntrega = new javax.swing.JLabel();
        labelResultPagamento = new javax.swing.JLabel();
        labelResultTroco = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelResultValorTotal = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relátorio pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Seu pedido de número: ");

        labelNumeroPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNumeroPedido.setText("00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("está sendo preparado, dentro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("de 50 minutos estará pronto.");

        labelFormaEntrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFormaEntrega.setText("Forma de entrega: ");

        labelFormaPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFormaPagamento.setText("Forma de pagamento:");

        labelTroco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTroco.setText("Troco: ");

        labelResultEntrega.setText("jLabel9");

        labelResultPagamento.setText("jLabel9");

        labelResultTroco.setText("jLabel11");

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTotal.setText("Valor total:");

        labelResultValorTotal.setText("jLabel13");

        btnOk.setText("OK");
        btnOk.setToolTipText("");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelNumeroPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelFormaPagamento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelResultPagamento))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelFormaEntrega)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelResultEntrega))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelTroco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelResultTroco))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelTotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelResultValorTotal)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnOk)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelNumeroPedido)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFormaEntrega)
                    .addComponent(labelResultEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFormaPagamento)
                    .addComponent(labelResultPagamento))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTroco)
                    .addComponent(labelResultTroco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(labelResultValorTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnOkActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFormaEntrega;
    private javax.swing.JLabel labelFormaPagamento;
    public static javax.swing.JLabel labelNumeroPedido;
    public static javax.swing.JLabel labelResultEntrega;
    public static javax.swing.JLabel labelResultPagamento;
    public static javax.swing.JLabel labelResultTroco;
    public static javax.swing.JLabel labelResultValorTotal;
    private javax.swing.JLabel labelTotal;
    public static javax.swing.JLabel labelTroco;
    // End of variables declaration//GEN-END:variables
}
