package trabalho.aps.jframe;

import javax.swing.JOptionPane;
import trabalho.aps.*;

public class Cadastro extends javax.swing.JFrame {
    public Cadastro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuCadastro = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNome4 = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelCEP = new javax.swing.JLabel();
        labelNomeRua = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelComplemento = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        tFNome = new javax.swing.JTextField();
        tFCPF = new javax.swing.JTextField();
        tFEmail = new javax.swing.JTextField();
        tFCEP = new javax.swing.JTextField();
        tFNomeRua = new javax.swing.JTextField();
        tFNumero = new javax.swing.JTextField();
        tFBairro = new javax.swing.JTextField();
        tFComplemento = new javax.swing.JTextField();
        tFCidade = new javax.swing.JTextField();
        tFEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelAutenticacao = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        tFTelefone = new javax.swing.JTextField();
        tFCelular = new javax.swing.JTextField();
        tFLogin = new javax.swing.JTextField();
        tFDataNascimento = new javax.swing.JTextField();
        tFSenha = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LANCHONETE - Menu Cadastro");

        panelMenuCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panelMenuCadastro.setToolTipText("");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNome.setText("Nome completo: ");

        labelDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDataNascimento.setText("Data de nascimento: ");

        labelCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCpf.setText("CPF: ");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEmail.setText("E-mail: ");

        labelNome4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEndereco.setText("Endereço");

        labelCEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCEP.setText("CEP: ");

        labelNomeRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNomeRua.setText("Nome da rua: ");

        labelNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNumero.setText("Número:");

        labelBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelBairro.setText("Bairro: ");

        labelComplemento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelComplemento.setText("Complemento:");

        labelCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCidade.setText("Cidade:");

        labelEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEstado.setText("Estado:");

        tFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNomeActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTelefone.setText("Telefone(Não obrigatório):");

        labelCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCelular.setText("Celular(Obrigatório):");

        labelAutenticacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAutenticacao.setText("Autenticação");

        labelLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelLogin.setText("Login:");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSenha.setText("Senha:");

        tFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFTelefoneActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuCadastroLayout = new javax.swing.GroupLayout(panelMenuCadastro);
        panelMenuCadastro.setLayout(panelMenuCadastroLayout);
        panelMenuCadastroLayout.setHorizontalGroup(
            panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome4)
                    .addGroup(panelMenuCadastroLayout.createSequentialGroup()
                        .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuCadastroLayout.createSequentialGroup()
                                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataNascimento)
                                    .addComponent(labelNome)
                                    .addComponent(labelCpf)
                                    .addComponent(labelEmail)
                                    .addComponent(labelCEP)
                                    .addComponent(labelNomeRua)
                                    .addComponent(labelNumero)
                                    .addComponent(labelBairro)
                                    .addComponent(labelComplemento)
                                    .addComponent(labelCidade)
                                    .addComponent(labelEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFNome)
                                    .addComponent(tFCPF)
                                    .addComponent(tFEmail)
                                    .addComponent(tFCEP)
                                    .addComponent(tFNomeRua)
                                    .addComponent(tFNumero)
                                    .addComponent(tFBairro)
                                    .addComponent(tFComplemento)
                                    .addComponent(tFCidade)
                                    .addComponent(tFEstado)
                                    .addComponent(tFDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                            .addComponent(labelEndereco)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuCadastroLayout.createSequentialGroup()
                                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone)
                                    .addComponent(jLabel1)
                                    .addComponent(labelCelular)
                                    .addComponent(labelLogin)
                                    .addComponent(labelSenha)
                                    .addComponent(labelAutenticacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(tFLogin)
                                    .addComponent(tFCelular)
                                    .addComponent(tFTelefone)))
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuCadastroLayout.setVerticalGroup(
            panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuCadastroLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(tFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(labelTelefone)
                    .addComponent(tFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimento)
                    .addComponent(labelCelular)
                    .addComponent(tFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(tFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(tFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(labelAutenticacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEP)
                    .addComponent(tFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin)
                    .addComponent(tFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeRua)
                    .addComponent(tFNomeRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha)
                    .addComponent(tFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(tFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(tFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComplemento)
                    .addComponent(tFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(tFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(tFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenuCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenuCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFTelefoneActionPerformed

    private void tFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNomeActionPerformed
       
    }//GEN-LAST:event_tFNomeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try{
            //Dados do cliente
            String nomeCliente = tFNome.getText();
            String dtNasc = tFDataNascimento.getText();
            String cpfCliente = tFCPF.getText();
            String email = tFEmail.getText();

            //Dados do endereço
            String cep = tFCEP.getText();
            String rua = tFNomeRua.getText();
            int numeroRes = Integer.parseInt(tFNumero.getText());
            String bairro = tFBairro.getText();
            String complemento = tFComplemento.getText();
            String cidade = tFCidade.getText();
            String estado = tFEstado.getText();

            //Dados telefone
            String telefone = tFTelefone.getText();
            String celular = tFCelular.getText();

            //Dados login
            String login = tFLogin.getText();
            String senha = tFSenha.getText();
            //Inserindo os dados no banco
            Endereco endereco = new Endereco(cep, numeroRes, bairro, rua, cidade, estado, complemento);
            endereco.inserirEndereco(cep, numeroRes, bairro, rua, cidade, estado, complemento);

            Telefone tel = new Telefone(telefone, celular);
            tel.inserirTelefone(telefone, celular);

            Autenticacao autenticacao = new Autenticacao(login, senha);
            autenticacao.inserirAutenticacao(login, senha);

            //Buscar codigo de cada um para adicionar na tabela cliente
            int cdEndereco = endereco.buscarCdEndereco();
            int cdAutenticacao = autenticacao.buscarCdAut();
            int cdTelefone = tel.buscarCdTelefone();
            //Chamando os cliente e inserindo no banco
            Cliente cliente = new Cliente(nomeCliente, cpfCliente, dtNasc, email, cdEndereco, cdAutenticacao, cdTelefone);
            cliente.inserirCliente(nomeCliente, cpfCliente, dtNasc, email, cdEndereco, cdAutenticacao, cdTelefone);
            
            dispose();
            new AutenticacaoFrame().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");
        }
        //JOptionPane.showMessageDialog(null, cep + rua + numeroRes + bairro + complemento + cidade + estado);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    } */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAutenticacao;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome4;
    private javax.swing.JLabel labelNomeRua;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelMenuCadastro;
    private javax.swing.JTextField tFBairro;
    private javax.swing.JTextField tFCEP;
    private javax.swing.JTextField tFCPF;
    private javax.swing.JTextField tFCelular;
    private javax.swing.JTextField tFCidade;
    private javax.swing.JTextField tFComplemento;
    private javax.swing.JTextField tFDataNascimento;
    private javax.swing.JTextField tFEmail;
    private javax.swing.JTextField tFEstado;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JTextField tFNome;
    private javax.swing.JTextField tFNomeRua;
    private javax.swing.JTextField tFNumero;
    private javax.swing.JPasswordField tFSenha;
    private javax.swing.JTextField tFTelefone;
    // End of variables declaration//GEN-END:variables
}
