package trabalho.aps.jframe;

import trabalho.aps.FormaEntrega;

public class FormaEntregaFrame extends javax.swing.JFrame {
    public static String nmFormaEntrega;
    
    FormaEntrega fE = new FormaEntrega();
    public static int cdPedido = FormaEntrega.buscarCdPedido();
    
    public FormaEntregaFrame() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormaEntrega = new javax.swing.JPanel();
        btnBalcao = new javax.swing.JButton();
        btnDomicilio = new javax.swing.JButton();
        labelObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forma de entrega");

        panelFormaEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de entrega", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnBalcao.setText("Retirar no balcão");
        btnBalcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalcaoActionPerformed(evt);
            }
        });

        btnDomicilio.setText("Entrega a domicilio");
        btnDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDomicilioActionPerformed(evt);
            }
        });

        labelObs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelObs.setText("Obs: Taxa de entrega R$4,00.");

        javax.swing.GroupLayout panelFormaEntregaLayout = new javax.swing.GroupLayout(panelFormaEntrega);
        panelFormaEntrega.setLayout(panelFormaEntregaLayout);
        panelFormaEntregaLayout.setHorizontalGroup(
            panelFormaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormaEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormaEntregaLayout.createSequentialGroup()
                        .addComponent(btnBalcao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelObs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormaEntregaLayout.setVerticalGroup(
            panelFormaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormaEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBalcao)
                    .addComponent(btnDomicilio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelObs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDomicilioActionPerformed
        Cardapio.valorTotal = Cardapio.valorTotal + 4;
        nmFormaEntrega = "Entrega domicilio";
        fE.inserirFormaEntrega(cdPedido, nmFormaEntrega);
        dispose();
        new FormaPagamentoFrame().setVisible(true);
    }//GEN-LAST:event_btnDomicilioActionPerformed

    private void btnBalcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalcaoActionPerformed
        nmFormaEntrega = "Retirar balcão";
        fE.inserirFormaEntrega(cdPedido, nmFormaEntrega);
        dispose();
        new FormaPagamentoFrame().setVisible(true);
    }//GEN-LAST:event_btnBalcaoActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaEntregaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalcao;
    private javax.swing.JButton btnDomicilio;
    private javax.swing.JLabel labelObs;
    private javax.swing.JPanel panelFormaEntrega;
    // End of variables declaration//GEN-END:variables
}
