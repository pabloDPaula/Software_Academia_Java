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

public class HistoricoMensalidades extends javax.swing.JFrame {

    Alunos a = new Alunos();
    ControleFinanceiro cf = new ControleFinanceiro();
    
    public HistoricoMensalidades() {
        initComponents();
        carregarTabelaAluno();
         ResultSet rs;
        try {
            rs = a.selecionarAluno();
            if (rs != null) {
                while (rs.next()) {
                    boxAlunosCadastrados.addItem(rs.getString("matricula"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum"
                        + " Aluno cadastrado!");
            }        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void carregarTabelaAluno() {
        ResultSet rs;
        try {
            rs = a.buscar();

            if (rs == null) {
                return;
            } else {
                Vector vetColuna = new Vector();
                vetColuna.add("Matricula");
                vetColuna.add("Nome");
                vetColuna.add("Turma");
                vetColuna.add("Professor");
                vetColuna.add("Situação");
                vetColuna.add("Data Nascimento");
                vetColuna.add("Data Admissão");
                Vector vetLinhas = new Vector();
                while (rs.next()) {
                    Vector vetLin = new Vector();
                    vetLin.add(rs.getString("matricula"));
                    vetLin.add(rs.getString("nome"));
                    vetLin.add(rs.getString("turma"));
                    vetLin.add(rs.getString("professor"));                  
                    vetLin.add(rs.getString("situacao"));
                    vetLin.add(rs.getString("dataNascimento"));
                     vetLin.add(rs.getString("dataAdmissao"));
                    vetLinhas.add(vetLin);
                }
                boxTabelaAluno.setModel(new DefaultTableModel(vetLinhas, vetColuna));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        }//fecha o if
    }

    public void carregarTabelaControle(String cod) {
        ResultSet rs;
        try {
            rs = cf.buscarControle(cod);
            if (rs == null) {
                return;
            } else {
                Vector vetColuna = new Vector();
                vetColuna.add("Matricula");
                vetColuna.add("Plano Mensalidade");
                vetColuna.add("Valor Mensalidade");
                vetColuna.add("Data Vencimento");
                vetColuna.add("Forma Pagamento");
                //vetColuna.add("Situacao Pagamento");
                vetColuna.add("Valor Pago");
                vetColuna.add("Data Pagamento");
                Vector vetLinhas = new Vector();
                while (rs.next()) {
                    Vector vetLin = new Vector();
                    vetLin.add(rs.getString("codMatricula"));
                    vetLin.add(rs.getString("planoMensalidade"));
                    vetLin.add(rs.getString("valorMensalidade"));
                    vetLin.add(rs.getString("dataVencimento"));                  
                    vetLin.add(rs.getString("formaPagamento"));
                   // vetLin.add(rs.getString("situacaoPagamento"));
                    vetLin.add(rs.getString("valorPago"));
                    vetLin.add(rs.getString("dataPagamento"));
                    vetLinhas.add(vetLin);
                }
                boxTabelaFinanceiro.setModel(new DefaultTableModel(vetLinhas, vetColuna));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxTabelaAluno = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxTabelaFinanceiro = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        boxAlunosCadastrados = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de Mensalidades");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Pesquisar Aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 364, 130, 22);

        boxTabelaAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxTabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Turma", "Professor", "Situação", "Data de Nascimento", "Data de Admissão"
            }
        ));
        jScrollPane1.setViewportView(boxTabelaAluno);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 178, 1004, 125);

        boxTabelaFinanceiro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxTabelaFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Data Vencimento", "Data Pagamento", "Valor", "Situação", "Metodo Pagamento"
            }
        ));
        jScrollPane2.setViewportView(boxTabelaFinanceiro);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 492, 1004, 125);

        jButton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(460, 666, 108, 31);

        boxAlunosCadastrados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxAlunosCadastrados.setMaximumSize(new java.awt.Dimension(300, 30));
        boxAlunosCadastrados.setMinimumSize(new java.awt.Dimension(300, 30));
        boxAlunosCadastrados.setPreferredSize(new java.awt.Dimension(300, 30));
        boxAlunosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAlunosCadastradosActionPerformed(evt);
            }
        });
        getContentPane().add(boxAlunosCadastrados);
        boxAlunosCadastrados.setBounds(158, 360, 300, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Histórico de Mensalidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 1004, 80);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/200x100.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(760, 623, 200, 100);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Histórico do Aluno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(436, 124, 145, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Histórico Financeiro do Aluno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 439, 234, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxAlunosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAlunosCadastradosActionPerformed
        
        carregarTabelaControle((String)boxAlunosCadastrados.getSelectedItem());              
        
    }//GEN-LAST:event_boxAlunosCadastradosActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(HistoricoMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoMensalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAlunosCadastrados;
    private javax.swing.JTable boxTabelaAluno;
    private javax.swing.JTable boxTabelaFinanceiro;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
