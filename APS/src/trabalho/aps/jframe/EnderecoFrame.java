package trabalho.aps.jframe;

import trabalho.aps.Endereco;
import trabalho.aps.FormaEntrega;

public class EnderecoFrame extends javax.swing.JFrame {
    int cdEndereco;
    
    public EnderecoFrame() {
        initComponents();
        cdEndereco = Endereco.selectEndereco(AutenticacaoFrame.cdCliente);
        Endereco.buscarDadosEndereco(cdEndereco);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panelEnderecoFrame = new javax.swing.JPanel();
        labelCEPFrame = new javax.swing.JLabel();
        labelNomeRuaFrame = new javax.swing.JLabel();
        labelNumeroFrame = new javax.swing.JLabel();
        labelBairroFrame = new javax.swing.JLabel();
        labelComplementoFrame = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelEstadoFrame = new javax.swing.JLabel();
        tFComplementoFrame = new javax.swing.JTextField();
        tFBairroFrame = new javax.swing.JTextField();
        tFNumeroFrame = new javax.swing.JTextField();
        tFNomeRuaFrame = new javax.swing.JTextField();
        tFCEPFrame = new javax.swing.JTextField();
        tFCidadeFrame = new javax.swing.JTextField();
        tFEstadoFrame = new javax.swing.JTextField();
        btnConfirmarFrame = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmar endereço");

        panelEnderecoFrame.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar endereço de entrega", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        labelCEPFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCEPFrame.setText("CEP: ");

        labelNomeRuaFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNomeRuaFrame.setText("Nome da rua: ");

        labelNumeroFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNumeroFrame.setText("Número: ");

        labelBairroFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelBairroFrame.setText("Bairro:");

        labelComplementoFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelComplementoFrame.setText("Complemento: ");

        labelCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCidade.setText("Cidade:");

        labelEstadoFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelEstadoFrame.setText("Estado:");

        btnConfirmarFrame.setText("Confirmar");
        btnConfirmarFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEnderecoFrameLayout = new javax.swing.GroupLayout(panelEnderecoFrame);
        panelEnderecoFrame.setLayout(panelEnderecoFrameLayout);
        panelEnderecoFrameLayout.setHorizontalGroup(
            panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEnderecoFrameLayout.createSequentialGroup()
                        .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComplementoFrame)
                            .addComponent(labelBairroFrame)
                            .addComponent(labelNumeroFrame)
                            .addComponent(labelCidade)
                            .addComponent(labelEstadoFrame))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFNumeroFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFBairroFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFComplementoFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFCidadeFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFEstadoFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoFrameLayout.createSequentialGroup()
                                .addComponent(btnConfirmarFrame)
                                .addGap(115, 115, 115))))
                    .addGroup(panelEnderecoFrameLayout.createSequentialGroup()
                        .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeRuaFrame)
                            .addComponent(labelCEPFrame))
                        .addGap(24, 24, 24)
                        .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tFCEPFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFNomeRuaFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEnderecoFrameLayout.setVerticalGroup(
            panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEPFrame)
                    .addComponent(tFCEPFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeRuaFrame)
                    .addComponent(tFNomeRuaFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroFrame)
                    .addComponent(tFNumeroFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairroFrame)
                    .addComponent(tFBairroFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComplementoFrame)
                    .addComponent(tFComplementoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(tFCidadeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstadoFrame)
                    .addComponent(tFEstadoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmarFrame))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEnderecoFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEnderecoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarFrameActionPerformed
        
        String cep = tFCEPFrame.getText();
        String nomeRua = tFNomeRuaFrame.getText();
        int numero = Integer.parseInt(tFNumeroFrame.getText());
        String bairro = tFBairroFrame.getText();
        String complemento = tFComplementoFrame.getText();
        String cidade = tFCidadeFrame.getText();
        String estado = tFEstadoFrame.getText();
        
        Endereco.updateEndereco(cep, numero, bairro, nomeRua, cidade, estado, complemento, cdEndereco);
        
        dispose();
        new RelatorioFrame().setVisible(true);
    }//GEN-LAST:event_btnConfirmarFrameActionPerformed

    /*public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnderecoFrame().setVisible(true);
            }
        });
    } */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarFrame;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelBairroFrame;
    private javax.swing.JLabel labelCEPFrame;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplementoFrame;
    private javax.swing.JLabel labelEstadoFrame;
    private javax.swing.JLabel labelNomeRuaFrame;
    private javax.swing.JLabel labelNumeroFrame;
    private javax.swing.JPanel panelEnderecoFrame;
    public static javax.swing.JTextField tFBairroFrame;
    public static javax.swing.JTextField tFCEPFrame;
    public static javax.swing.JTextField tFCidadeFrame;
    public static javax.swing.JTextField tFComplementoFrame;
    public static javax.swing.JTextField tFEstadoFrame;
    public static javax.swing.JTextField tFNomeRuaFrame;
    public static javax.swing.JTextField tFNumeroFrame;
    // End of variables declaration//GEN-END:variables
}
