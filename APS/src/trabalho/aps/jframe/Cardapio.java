package trabalho.aps.jframe;

import javax.swing.JOptionPane;
import trabalho.aps.FormaEntrega;
import trabalho.aps.Pedido;
import trabalho.aps.Produto;
import static trabalho.aps.jframe.AutenticacaoFrame.login;

public class Cardapio extends javax.swing.JFrame {
    public static double valorTotal;
    public String obs, resumoPedido = "";
    public Cardapio() {
        initComponents();
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLanches = new javax.swing.JPanel();
        btnBurguer = new javax.swing.JButton();
        btnSalada = new javax.swing.JButton();
        btnGalinha = new javax.swing.JButton();
        btnBacon = new javax.swing.JButton();
        btnCoracao = new javax.swing.JButton();
        btnEgg = new javax.swing.JButton();
        btnMisto = new javax.swing.JButton();
        btnCalabresa = new javax.swing.JButton();
        btnCasa = new javax.swing.JButton();
        panelBebidas = new javax.swing.JPanel();
        btnAguaSemGas = new javax.swing.JButton();
        btnAguaComGas = new javax.swing.JButton();
        btnCoca350 = new javax.swing.JButton();
        btnCoca600 = new javax.swing.JButton();
        btnCoca1L = new javax.swing.JButton();
        btnCoca2L = new javax.swing.JButton();
        btnFanta350 = new javax.swing.JButton();
        btnFanta600 = new javax.swing.JButton();
        btnFanta2L = new javax.swing.JButton();
        btnSprite350 = new javax.swing.JButton();
        btnSprite2L = new javax.swing.JButton();
        btnPepsi350 = new javax.swing.JButton();
        btnPepsi2L = new javax.swing.JButton();
        btnGuarana350 = new javax.swing.JButton();
        btnGuarana2L = new javax.swing.JButton();
        btnBud600 = new javax.swing.JButton();
        btnDevassa600 = new javax.swing.JButton();
        btnSub600 = new javax.swing.JButton();
        btnSkol600 = new javax.swing.JButton();
        btnItaipava600 = new javax.swing.JButton();
        btnBrahma600 = new javax.swing.JButton();
        labelSubTotal = new javax.swing.JLabel();
        labelCalculoTotal = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAvançar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PEDIDOS");

        panelLanches.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lanches", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnBurguer.setText("X-Burguer");
        btnBurguer.setMaximumSize(new java.awt.Dimension(99, 23));
        btnBurguer.setMinimumSize(new java.awt.Dimension(99, 23));
        btnBurguer.setPreferredSize(new java.awt.Dimension(99, 23));
        btnBurguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurguerActionPerformed(evt);
            }
        });

        btnSalada.setText("X-Salada");
        btnSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaladaActionPerformed(evt);
            }
        });

        btnGalinha.setText("X-Galinha");
        btnGalinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGalinhaActionPerformed(evt);
            }
        });

        btnBacon.setText("X-Bacon");
        btnBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaconActionPerformed(evt);
            }
        });

        btnCoracao.setText("X-Coração");
        btnCoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoracaoActionPerformed(evt);
            }
        });

        btnEgg.setText("X-Egg");
        btnEgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEggActionPerformed(evt);
            }
        });

        btnMisto.setText("Misto");
        btnMisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMistoActionPerformed(evt);
            }
        });

        btnCalabresa.setText("X-Calabresa");
        btnCalabresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalabresaActionPerformed(evt);
            }
        });

        btnCasa.setText("X-Casa");
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLanchesLayout = new javax.swing.GroupLayout(panelLanches);
        panelLanches.setLayout(panelLanchesLayout);
        panelLanchesLayout.setHorizontalGroup(
            panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLanchesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLanchesLayout.createSequentialGroup()
                        .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalada, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(btnEgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGalinha, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnMisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLanchesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnBacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLanchesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalabresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelLanchesLayout.createSequentialGroup()
                        .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLanchesLayout.setVerticalGroup(
            panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLanchesLayout.createSequentialGroup()
                .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalada)
                    .addComponent(btnGalinha)
                    .addComponent(btnBacon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLanchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoracao)
                    .addComponent(btnEgg)
                    .addComponent(btnMisto)
                    .addComponent(btnCalabresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCasa))
        );

        panelBebidas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bebidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnAguaSemGas.setText("Água sem gás");
        btnAguaSemGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAguaSemGasActionPerformed(evt);
            }
        });

        btnAguaComGas.setText("Água com gás");
        btnAguaComGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAguaComGasActionPerformed(evt);
            }
        });

        btnCoca350.setText("Coca 350ml");
        btnCoca350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoca350ActionPerformed(evt);
            }
        });

        btnCoca600.setText("Coca 600ml");
        btnCoca600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoca600ActionPerformed(evt);
            }
        });

        btnCoca1L.setText("Coca 1L");
        btnCoca1L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoca1LActionPerformed(evt);
            }
        });

        btnCoca2L.setText("Coca 2L");
        btnCoca2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoca2LActionPerformed(evt);
            }
        });

        btnFanta350.setText("Fanta 350ml");
        btnFanta350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFanta350ActionPerformed(evt);
            }
        });

        btnFanta600.setText("Fanta 600ml");
        btnFanta600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFanta600ActionPerformed(evt);
            }
        });

        btnFanta2L.setText("Fanta 2L");
        btnFanta2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFanta2LActionPerformed(evt);
            }
        });

        btnSprite350.setText("Sprite 350ml");
        btnSprite350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSprite350ActionPerformed(evt);
            }
        });

        btnSprite2L.setText("Sprite 2L");
        btnSprite2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSprite2LActionPerformed(evt);
            }
        });

        btnPepsi350.setText("Pepsi 350ml");
        btnPepsi350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPepsi350ActionPerformed(evt);
            }
        });

        btnPepsi2L.setText("Pepsi 2L");
        btnPepsi2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPepsi2LActionPerformed(evt);
            }
        });

        btnGuarana350.setText("Guaraná 350ml");
        btnGuarana350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarana350ActionPerformed(evt);
            }
        });

        btnGuarana2L.setText("Guaraná 2L");
        btnGuarana2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarana2LActionPerformed(evt);
            }
        });

        btnBud600.setText("Budweiser 600ml");
        btnBud600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBud600ActionPerformed(evt);
            }
        });

        btnDevassa600.setText("Devassa 600ml");
        btnDevassa600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevassa600ActionPerformed(evt);
            }
        });

        btnSub600.setText("Sub-zero 600ml");
        btnSub600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub600ActionPerformed(evt);
            }
        });

        btnSkol600.setText("Skol 600ml");
        btnSkol600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkol600ActionPerformed(evt);
            }
        });

        btnItaipava600.setText("Itaipava 600ml");
        btnItaipava600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItaipava600ActionPerformed(evt);
            }
        });

        btnBrahma600.setText("Brahma 600ml");
        btnBrahma600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrahma600ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBebidasLayout = new javax.swing.GroupLayout(panelBebidas);
        panelBebidas.setLayout(panelBebidasLayout);
        panelBebidasLayout.setHorizontalGroup(
            panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBebidasLayout.createSequentialGroup()
                        .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnAguaSemGas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAguaComGas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnFanta2L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSprite350, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnSprite2L, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPepsi350, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnCoca350, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCoca600, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBebidasLayout.createSequentialGroup()
                        .addComponent(btnCoca1L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCoca2L, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFanta350, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFanta600, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBebidasLayout.createSequentialGroup()
                        .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBrahma600, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDevassa600, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnPepsi2L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnGuarana350, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuarana2L, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBud600, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBebidasLayout.createSequentialGroup()
                                .addComponent(btnSub600, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSkol600, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnItaipava600, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelBebidasLayout.setVerticalGroup(
            panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidasLayout.createSequentialGroup()
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAguaSemGas)
                    .addComponent(btnAguaComGas)
                    .addComponent(btnCoca350)
                    .addComponent(btnCoca600))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoca1L)
                    .addComponent(btnCoca2L)
                    .addComponent(btnFanta350)
                    .addComponent(btnFanta600))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFanta2L)
                    .addComponent(btnSprite350)
                    .addComponent(btnSprite2L)
                    .addComponent(btnPepsi350))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPepsi2L)
                    .addComponent(btnGuarana350)
                    .addComponent(btnGuarana2L)
                    .addComponent(btnBud600))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDevassa600)
                    .addComponent(btnSub600)
                    .addComponent(btnSkol600)
                    .addComponent(btnItaipava600))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBrahma600))
        );

        labelSubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelSubTotal.setText("Subtotal: ");

        labelCalculoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCalculoTotal.setText("0.00");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAvançar.setText("Avançar");
        btnAvançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvançarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCalculoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvançar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelLanches, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBebidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLanches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSubTotal)
                    .addComponent(labelCalculoTotal)
                    .addComponent(btnAvançar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAguaSemGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaSemGasActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(10);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnAguaSemGasActionPerformed

    private void btnAvançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvançarActionPerformed
        Object[] options = { "Confirmar", "Cancelar" };
        int aux = JOptionPane.showOptionDialog(null, "Seu pedido: \n " + resumoPedido, "Confirmação do pedido", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(aux == 0){
            AutenticacaoFrame.cdCliente = Pedido.buscarCdCliente(AutenticacaoFrame.login);
            Pedido.inserirPedido(AutenticacaoFrame.cdCliente, 1, (float) valorTotal);
            dispose();
            new FormaEntregaFrame().setVisible(true);
        }
    }//GEN-LAST:event_btnAvançarActionPerformed

    private void btnBurguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurguerActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(1);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnBurguerActionPerformed

    private void btnPepsi2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPepsi2LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(22);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnPepsi2LActionPerformed

    private void btnDevassa600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevassa600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(26);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnDevassa600ActionPerformed

    private void btnBrahma600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrahma600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(28);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnBrahma600ActionPerformed

    private void btnSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaladaActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(2);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnSaladaActionPerformed

    private void btnGalinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGalinhaActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(3);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnGalinhaActionPerformed

    private void btnBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaconActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(4);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnBaconActionPerformed

    private void btnCoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoracaoActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(5);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCoracaoActionPerformed

    private void btnEggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEggActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(6);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnEggActionPerformed

    private void btnMistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMistoActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(7);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnMistoActionPerformed

    private void btnCalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalabresaActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(8);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCalabresaActionPerformed

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(9);
        String nomeLanche = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorLanche = produto.getVlProduto();
        obs = JOptionPane.showInputDialog(nomeLanche + " (" + ingredientes + ") --- R$" + valorLanche, "Obs: ex(Sem milho, ervilha)");
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Lanche não confirmado no pedido.");
        } else {
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorLanche;
            resumoPedido = resumoPedido + "1 " + nomeLanche + " (" + obs + ") R$" + valorLanche + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnAguaComGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaComGasActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(11);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnAguaComGasActionPerformed

    private void btnCoca350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoca350ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(12);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCoca350ActionPerformed

    private void btnCoca600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoca600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(13);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCoca600ActionPerformed

    private void btnCoca1LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoca1LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(14);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCoca1LActionPerformed

    private void btnCoca2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoca2LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(15);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnCoca2LActionPerformed

    private void btnFanta350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFanta350ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(16);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnFanta350ActionPerformed

    private void btnFanta600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFanta600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(17);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnFanta600ActionPerformed

    private void btnFanta2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFanta2LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(18);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnFanta2LActionPerformed

    private void btnSprite350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSprite350ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(19);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnSprite350ActionPerformed

    private void btnSprite2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSprite2LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(20);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnSprite2LActionPerformed

    private void btnPepsi350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPepsi350ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(21);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnPepsi350ActionPerformed

    private void btnGuarana350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarana350ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(23);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnGuarana350ActionPerformed

    private void btnGuarana2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarana2LActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(24);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnGuarana2LActionPerformed

    private void btnBud600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBud600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(25);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnBud600ActionPerformed

    private void btnSub600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(27);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnSub600ActionPerformed

    private void btnSkol600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkol600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(30);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnSkol600ActionPerformed

    private void btnItaipava600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItaipava600ActionPerformed
        Produto produto = new Produto();
        produto.buscarCardapio(29);
        //String nomeBebida = produto.getProduto();
        String ingredientes = produto.getDe_produto();
        double valorBebida = produto.getVlProduto();
        int quantidade;
        obs = JOptionPane.showInputDialog("Quantidade de " + ingredientes + ": ", 1);
        if(obs == null || obs.equals("")){
            JOptionPane.showMessageDialog(null, "Bebida não confirmada no pedido.");
        } else {
            quantidade = Integer.parseInt(obs);
            valorBebida = valorBebida * quantidade;
            valorTotal = Double.parseDouble(labelCalculoTotal.getText());
            valorTotal = valorTotal + valorBebida;
            resumoPedido = resumoPedido + quantidade + " " + ingredientes + " R$" + valorBebida + "\n";
            labelCalculoTotal.setText("" + valorTotal);
        }
    }//GEN-LAST:event_btnItaipava600ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cardapio().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAguaComGas;
    private javax.swing.JButton btnAguaSemGas;
    private javax.swing.JButton btnAvançar;
    private javax.swing.JButton btnBacon;
    private javax.swing.JButton btnBrahma600;
    private javax.swing.JButton btnBud600;
    private javax.swing.JButton btnBurguer;
    private javax.swing.JButton btnCalabresa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnCoca1L;
    private javax.swing.JButton btnCoca2L;
    private javax.swing.JButton btnCoca350;
    private javax.swing.JButton btnCoca600;
    private javax.swing.JButton btnCoracao;
    private javax.swing.JButton btnDevassa600;
    private javax.swing.JButton btnEgg;
    private javax.swing.JButton btnFanta2L;
    private javax.swing.JButton btnFanta350;
    private javax.swing.JButton btnFanta600;
    private javax.swing.JButton btnGalinha;
    private javax.swing.JButton btnGuarana2L;
    private javax.swing.JButton btnGuarana350;
    private javax.swing.JButton btnItaipava600;
    private javax.swing.JButton btnMisto;
    private javax.swing.JButton btnPepsi2L;
    private javax.swing.JButton btnPepsi350;
    private javax.swing.JButton btnSalada;
    private javax.swing.JButton btnSkol600;
    private javax.swing.JButton btnSprite2L;
    private javax.swing.JButton btnSprite350;
    private javax.swing.JButton btnSub600;
    private javax.swing.JLabel labelCalculoTotal;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JPanel panelBebidas;
    private javax.swing.JPanel panelLanches;
    // End of variables declaration//GEN-END:variables
}
