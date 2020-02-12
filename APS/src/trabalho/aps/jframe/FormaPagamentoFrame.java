package trabalho.aps.jframe;

import java.util.Scanner;
import javax.swing.JOptionPane;
import trabalho.aps.FormaPagamento;

public class FormaPagamentoFrame extends javax.swing.JFrame {
    public static String nmFormaPagamento, trocoString;
    public static double trocoDouble;
    Scanner scanner = new Scanner(System.in);
    FormaPagamento fP = new FormaPagamento();
    public FormaPagamentoFrame() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPagamento = new javax.swing.JPanel();
        btnDinhero = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forma de pagamento");

        panelPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnDinhero.setText("Dinheiro");
        btnDinhero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheroActionPerformed(evt);
            }
        });

        btnCartao.setText("Cartão");
        btnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagamentoLayout = new javax.swing.GroupLayout(panelPagamento);
        panelPagamento.setLayout(panelPagamentoLayout);
        panelPagamentoLayout.setHorizontalGroup(
            panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDinhero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCartao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPagamentoLayout.setVerticalGroup(
            panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDinhero)
                    .addComponent(btnCartao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDinheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheroActionPerformed
        nmFormaPagamento = "Dinheiro";
        fP.inserirFormaPagamento(nmFormaPagamento, FormaEntregaFrame.cdPedido);
        Object[] options = { "Sim", "Não" };
        int aux = JOptionPane.showOptionDialog(null, "Troco?", "TROCO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(aux == 0){
            trocoString = JOptionPane.showInputDialog("Troco para?");
            trocoDouble = Double.parseDouble(trocoString);
            trocoDouble = trocoDouble - Cardapio.valorTotal;
            dispose();
            new EnderecoFrame().setVisible(true);
        } else if(aux == 1){
            JOptionPane.showMessageDialog(null, "Sem troco");
            dispose();
            new EnderecoFrame().setVisible(true);
        }
    }//GEN-LAST:event_btnDinheroActionPerformed

    private void btnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoActionPerformed
        nmFormaPagamento = "Cartão";
        fP.inserirFormaPagamento(nmFormaPagamento, FormaEntregaFrame.cdPedido);
        dispose();
        new EnderecoFrame().setVisible(true);
    }//GEN-LAST:event_btnCartaoActionPerformed

    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaPagamentoFrame().setVisible(true);
            }
        });
    } */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnDinhero;
    private javax.swing.JPanel panelPagamento;
    // End of variables declaration//GEN-END:variables
}
