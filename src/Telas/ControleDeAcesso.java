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

public class ControleDeAcesso extends javax.swing.JFrame {

 
    Alunos a = new Alunos();
    ControleAcesso ca = new ControleAcesso();
    
    public ControleDeAcesso() {
        initComponents();
        carregarTabelaAluno();
        carregarTabelaAcesso();
        
         ResultSet rs;
        try {
            rs = a.selecionarAluno();
            if (rs != null) {
                while (rs.next()) {
                    boxMatriculas.addItem(rs.getString("matricula"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum"
                        + " Aluno cadastrado!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
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
                boxTabelaAcesso.setModel(new DefaultTableModel(vetLinhas, vetColuna));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void carregarTabelaAcesso(){
    ResultSet rs;
        try {
            rs = ca.buscar();
             if (rs == null) {
                return;
             }else
             {
             Vector vetColuna = new Vector();
             vetColuna.add("Data");
             Vector vetLinhas = new Vector();
             while (rs.next()) {
                    Vector vetLin = new Vector();
                    vetLin.add(rs.getString("entrada"));                 
                    vetLinhas.add(vetLin);
                }
             boxData.setModel(new DefaultTableModel(vetLinhas, vetColuna));
             }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        boxData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxTabelaAcesso = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxMatriculas = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Acesso");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        boxData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Data"
            }
        ));
        jScrollPane1.setViewportView(boxData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 498, 430, 125);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquisar Aluno");
        jLabel2.setMaximumSize(new java.awt.Dimension(185, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(185, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(185, 30));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 148, 185, 30);

        boxTabelaAcesso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxTabelaAcesso.setModel(new javax.swing.table.DefaultTableModel(
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
        boxTabelaAcesso.setMinimumSize(new java.awt.Dimension(105, 95));
        boxTabelaAcesso.setPreferredSize(new java.awt.Dimension(525, 95));
        jScrollPane2.setViewportView(boxTabelaAcesso);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 264, 1004, 125);

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setMaximumSize(new java.awt.Dimension(95, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(95, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(95, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(459, 688, 125, 40);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Acesso");
        jLabel1.setMaximumSize(new java.awt.Dimension(340, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(340, 45));
        jLabel1.setPreferredSize(new java.awt.Dimension(340, 45));

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

        boxMatriculas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxMatriculas.setMaximumSize(new java.awt.Dimension(200, 30));
        boxMatriculas.setMinimumSize(new java.awt.Dimension(200, 30));
        boxMatriculas.setName(""); // NOI18N
        boxMatriculas.setPreferredSize(new java.awt.Dimension(200, 30));
        boxMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMatriculasActionPerformed(evt);
            }
        });
        getContentPane().add(boxMatriculas);
        boxMatriculas.setBounds(261, 148, 300, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/200x100.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(741, 628, 190, 100);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Histórico de Acesso do Aluno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(405, 430, 233, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Dados do Aluno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(447, 205, 127, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMatriculasActionPerformed
    
    }//GEN-LAST:event_boxMatriculasActionPerformed

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
            java.util.logging.Logger.getLogger(ControleDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDeAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable boxData;
    private javax.swing.JComboBox<String> boxMatriculas;
    private javax.swing.JTable boxTabelaAcesso;
    private javax.swing.JButton jButton1;
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
