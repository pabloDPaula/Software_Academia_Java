package Telas;

import Classes.Alunos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastrarAluno extends javax.swing.JFrame {

      private Alunos a = new Alunos();
    
    public CadastrarAluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        boxNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxProfes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        boxHorar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        boxTurma = new javax.swing.JTextField();
        boxModal = new javax.swing.JTextField();
        boxTurno = new javax.swing.JTextField();
        boxDia = new javax.swing.JTextField();
        boxSituacao = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxNasc = new javax.swing.JFormattedTextField();
        boxAdmis = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome");
        jLabel3.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 149, 170, 30);

        boxNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxNome.setMaximumSize(new java.awt.Dimension(200, 30));
        boxNome.setMinimumSize(new java.awt.Dimension(200, 30));
        boxNome.setPreferredSize(new java.awt.Dimension(200, 30));
        boxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(boxNome);
        boxNome.setBounds(550, 151, 300, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Modalidade");
        jLabel4.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 199, 170, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Turno");
        jLabel5.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 239, 170, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dias");
        jLabel6.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 289, 170, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Turma");
        jLabel7.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 379, 170, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Professor");
        jLabel8.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel8.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel8.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 429, 170, 30);

        boxProfes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxProfes.setMaximumSize(new java.awt.Dimension(200, 30));
        boxProfes.setMinimumSize(new java.awt.Dimension(200, 30));
        boxProfes.setPreferredSize(new java.awt.Dimension(200, 30));
        boxProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProfesActionPerformed(evt);
            }
        });
        getContentPane().add(boxProfes);
        boxProfes.setBounds(550, 431, 300, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Situação");
        jLabel9.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel9.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel9.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 479, 170, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data de Nascimento");
        jLabel10.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel10.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel10.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 531, 170, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Data de Admissão");
        jLabel11.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel11.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel11.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 581, 170, 30);

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(150, 30));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(150, 30));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(150, 30));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar);
        botaoCadastrar.setBounds(379, 665, 111, 30);

        botaoCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setMaximumSize(new java.awt.Dimension(150, 30));
        botaoCancelar.setMinimumSize(new java.awt.Dimension(150, 30));
        botaoCancelar.setPreferredSize(new java.awt.Dimension(150, 30));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(550, 665, 111, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Horário");
        jLabel12.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel12.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel12.setPreferredSize(new java.awt.Dimension(230, 30));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 329, 170, 30);

        boxHorar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxHorar.setMaximumSize(new java.awt.Dimension(200, 30));
        boxHorar.setMinimumSize(new java.awt.Dimension(200, 30));
        boxHorar.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(boxHorar);
        boxHorar.setBounds(550, 331, 80, 30);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(300, 97, 207, 0);

        boxTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxTurma.setMaximumSize(new java.awt.Dimension(200, 30));
        boxTurma.setMinimumSize(new java.awt.Dimension(200, 30));
        boxTurma.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(boxTurma);
        boxTurma.setBounds(550, 381, 150, 30);

        boxModal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxModal.setMaximumSize(new java.awt.Dimension(200, 30));
        boxModal.setMinimumSize(new java.awt.Dimension(200, 30));
        boxModal.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(boxModal);
        boxModal.setBounds(550, 199, 150, 30);

        boxTurno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxTurno.setMaximumSize(new java.awt.Dimension(200, 30));
        boxTurno.setMinimumSize(new java.awt.Dimension(200, 30));
        boxTurno.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(boxTurno);
        boxTurno.setBounds(550, 241, 300, 30);

        boxDia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxDia.setMaximumSize(new java.awt.Dimension(200, 30));
        boxDia.setMinimumSize(new java.awt.Dimension(200, 30));
        boxDia.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(boxDia);
        boxDia.setBounds(550, 289, 300, 30);

        boxSituacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativado", "Desativado" }));
        boxSituacao.setMaximumSize(new java.awt.Dimension(150, 35));
        boxSituacao.setMinimumSize(new java.awt.Dimension(150, 35));
        boxSituacao.setPreferredSize(new java.awt.Dimension(150, 35));
        getContentPane().add(boxSituacao);
        boxSituacao.setBounds(550, 481, 150, 35);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Aluno");
        jLabel1.setMaximumSize(new java.awt.Dimension(320, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(320, 45));
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
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

        try {
            boxNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boxNasc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxNasc.setMaximumSize(new java.awt.Dimension(150, 30));
        boxNasc.setMinimumSize(new java.awt.Dimension(150, 30));
        boxNasc.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(boxNasc);
        boxNasc.setBounds(550, 531, 111, 30);

        try {
            boxAdmis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boxAdmis.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boxAdmis.setMaximumSize(new java.awt.Dimension(150, 30));
        boxAdmis.setMinimumSize(new java.awt.Dimension(150, 30));
        boxAdmis.setPreferredSize(new java.awt.Dimension(150, 30));
        boxAdmis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAdmisActionPerformed(evt);
            }
        });
        getContentPane().add(boxAdmis);
        boxAdmis.setBounds(550, 581, 111, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/200x100.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(750, 610, 190, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNomeActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
       if (!boxNome.getText().equals("")) {
            a.setNome(boxNome.getText());
            a.setHorario(boxHorar.getText());
            a.setTurma(boxTurma.getText());
            a.setProfessor(boxProfes.getText());
            a.setDataNascimento(boxNasc.getText());
            a.setDataAdmissao(boxAdmis.getText());
            a.setTurno(boxTurno.getText()); 
            a.setDias(boxDia.getText());
            a.setModalidade(boxModal.getText());
            a.setSituacao((String)boxSituacao.getSelectedItem());
            try {
               a.inserir();
               JOptionPane.showMessageDialog(null,
                        "Cadastro Efetuado Com Sucesso!!");
                dispose();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(CadastrarAluno.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(CadastrarAluno.class.getName()).log(Level.SEVERE, null, ex);
           }
       }       
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void boxProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProfesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxProfesActionPerformed

    private void boxAdmisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAdmisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxAdmisActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JFormattedTextField boxAdmis;
    private javax.swing.JTextField boxDia;
    private javax.swing.JTextField boxHorar;
    private javax.swing.JTextField boxModal;
    private javax.swing.JFormattedTextField boxNasc;
    private javax.swing.JTextField boxNome;
    private javax.swing.JTextField boxProfes;
    private javax.swing.JComboBox<String> boxSituacao;
    private javax.swing.JTextField boxTurma;
    private javax.swing.JTextField boxTurno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
