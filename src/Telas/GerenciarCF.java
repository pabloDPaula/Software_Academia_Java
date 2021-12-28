package Telas;

import Classes.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarCF extends javax.swing.JFrame {

    Alunos a = new Alunos();
    ControleFinanceiro cf = new ControleFinanceiro();

    public GerenciarCF() {
        ResultSet rs;
        initComponents();
        setSize(800, 609);

        try {
            rs = cf.buscar();
            if (rs != null) {
                while (rs.next()) {
                    boxAlunosCadastrados.addItem(rs.getString("codMatricula"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum"
                        + " Aluno cadastrado!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxMetodo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        boxAlunosCadastrados = new javax.swing.JComboBox<>();
        boxPlano = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        boxDataPagamento = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxDataVencimento = new javax.swing.JFormattedTextField();
        boxValorMensal = new javax.swing.JTextField();
        boxValorPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        boxPesquisarData = new javax.swing.JComboBox<>();
        excluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        NomeAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Financeiro");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Pesquisar Aluno");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Financeiro do Aluno");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Plano de Mensalidade");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor da Mensalidade");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Valor Pagamento");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Metodo Pagamento");

        boxMetodo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Cheque", "Boleto" }));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Data De Pagamento");

        boxAlunosCadastrados.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boxAlunosCadastrados.setMinimumSize(new java.awt.Dimension(47, 30));
        boxAlunosCadastrados.setPreferredSize(new java.awt.Dimension(47, 30));
        boxAlunosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAlunosCadastradosActionPerformed(evt);
            }
        });

        boxPlano.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensal", "Trimestral", "Semestral", "Anual" }));
        boxPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPlanoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        try {
            boxDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boxDataPagamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxDataPagamento.setMinimumSize(new java.awt.Dimension(6, 30));
        boxDataPagamento.setPreferredSize(new java.awt.Dimension(76, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(534, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciar Controle Financeiro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data de Vencimento");

        try {
            boxDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boxDataVencimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxDataVencimento.setMinimumSize(new java.awt.Dimension(6, 30));
        boxDataVencimento.setPreferredSize(new java.awt.Dimension(76, 30));

        boxValorMensal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxValorMensal.setMinimumSize(new java.awt.Dimension(6, 30));
        boxValorMensal.setPreferredSize(new java.awt.Dimension(6, 30));

        boxValorPago.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxValorPago.setMinimumSize(new java.awt.Dimension(6, 30));
        boxValorPago.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Pesquisa por Data de Pagamento");

        boxPesquisarData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxPesquisarData.setMinimumSize(new java.awt.Dimension(47, 30));
        boxPesquisarData.setPreferredSize(new java.awt.Dimension(47, 30));
        boxPesquisarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPesquisarDataActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/200x100.png"))); // NOI18N

        NomeAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPesquisarData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(boxAlunosCadastrados, javax.swing.GroupLayout.Alignment.LEADING, 0, 261, Short.MAX_VALUE)
                        .addComponent(NomeAluno, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(boxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(boxDataPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxDataVencimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxValorPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(boxValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxAlunosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(boxPesquisarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(boxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boxDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(boxValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alterar)
                        .addComponent(jButton2)
                        .addComponent(excluir))
                    .addComponent(jLabel14))
                .addGap(77, 77, 77))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxAlunosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAlunosCadastradosActionPerformed
       boxPesquisarData.removeAllItems();
        String aux;
        aux = (String) boxAlunosCadastrados.getSelectedItem();
        ResultSet rs = null;
        ResultSet rs2 = null;
        try {
            rs = cf.buscarControle(aux);
             if (rs != null) {
                while (rs.next()) {
                    boxPesquisarData.addItem(rs.getString("dataPagamento"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum controle financeiro"
                        + "cadastrado!");
            }
             
       
             rs2= a.buscarMatricula(aux);             
            if (!rs2.first()) {
                JOptionPane.showMessageDialog(null, "Aluno"
                        + " não encontrada!");
            } else {
                NomeAluno.setText(rs2.getString("nome"));
                NomeAluno.setEditable(false);
               
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_boxAlunosCadastradosActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        String aux;
        aux = (String) boxPesquisarData.getSelectedItem();
        cf.setPlanoMensalidade((String) boxPlano.getSelectedItem());
        cf.setValorMensalidade(Float.parseFloat(boxValorMensal.getText()));
        cf.setFormaPagamento((String) boxMetodo.getSelectedItem());
        cf.setDataPagamento(boxDataPagamento.getText());
        cf.setDataVencimento(boxDataVencimento.getText());
        cf.setValorPago(Float.parseFloat(boxValorPago.getText()));
        try {
            cf.alterar(aux);
            JOptionPane.showMessageDialog(null, "Controle alterado "
                    + "com sucesso!");
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boxPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPlanoActionPerformed

    private void boxPesquisarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPesquisarDataActionPerformed
       String aux;
        aux = ((String) boxPesquisarData.getSelectedItem());
        ResultSet rs;
        try {
            rs = cf.selecionarData(aux);
            if (!rs.first()) {                        
            } 
            else {
                boxPlano.setSelectedItem(rs.getString("planoMensalidade"));
                boxMetodo.setSelectedItem(rs.getString("formaPagamento"));  
                boxValorMensal.setText(rs.getString("valorMensalidade"));              
                boxDataPagamento.setText(rs.getString("DataPagamento"));
                boxValorPago.setText(rs.getString("ValorPago"));
                boxDataVencimento.setText(rs.getString("DataVencimento")); 
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarCF.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boxPesquisarDataActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
          String aux, aux2;
        aux = (String) boxAlunosCadastrados.getSelectedItem();
        aux2 = (String) boxPesquisarData.getSelectedItem();
        cf.setPlanoMensalidade((String) boxPlano.getSelectedItem());
        cf.setValorMensalidade(Float.parseFloat(boxValorMensal.getText()));
        cf.setFormaPagamento((String) boxMetodo.getSelectedItem());
        cf.setDataPagamento(boxDataPagamento.getText());
        cf.setDataVencimento(boxDataVencimento.getText());
        cf.setValorPago(Float.parseFloat(boxValorPago.getText()));

        try {
            cf.excluirCF(aux,aux2);

            JOptionPane.showMessageDialog(null, "Controle Financeiro excluído"
                    + " com sucesso!");
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarCF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeAluno;
    private javax.swing.JButton alterar;
    private javax.swing.JComboBox<String> boxAlunosCadastrados;
    private javax.swing.JFormattedTextField boxDataPagamento;
    private javax.swing.JFormattedTextField boxDataVencimento;
    private javax.swing.JComboBox<String> boxMetodo;
    private javax.swing.JComboBox<String> boxPesquisarData;
    private javax.swing.JComboBox<String> boxPlano;
    private javax.swing.JTextField boxValorMensal;
    private javax.swing.JTextField boxValorPago;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
