/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.gui;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quiz.dao.PerformanceDao;
import quiz.pojo.user;

/**
 *
 * @author Paaty
 */
public class StudentChoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form PaperSelectionFrame
     */
    public StudentChoiceFrame() {
        initComponents();
        super.setLocation(375,125);
        lblName.setText("hello "+user.getId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbTakeTest = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        jrbPass = new javax.swing.JRadioButton();
        btnDo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 0, 0));

        lblLogout.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 0, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ONLINE QUIZ STUDENT PANEL");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Make A Choice");

        buttonGroup1.add(jrbTakeTest);
        jrbTakeTest.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrbTakeTest.setForeground(new java.awt.Color(255, 0, 0));
        jrbTakeTest.setText("Take Test");

        buttonGroup1.add(jrbViewScores);
        jrbViewScores.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 0, 0));
        jrbViewScores.setText("View Scores");
        jrbViewScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewScoresActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbPass);
        jrbPass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrbPass.setForeground(new java.awt.Color(255, 0, 0));
        jrbPass.setText("Change Password");
        jrbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPassActionPerformed(evt);
            }
        });

        btnDo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDo.setForeground(new java.awt.Color(255, 0, 0));
        btnDo.setText("Do Task");
        btnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/gui/stud1.jpg"))); // NOI18N
        jLabel1.setText("                ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbViewScores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jrbTakeTest, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnDo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jrbTakeTest)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScores)
                        .addGap(18, 18, 18)
                        .addComponent(jrbPass))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnDo)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbViewScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewScoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbViewScoresActionPerformed

    private void jrbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbPassActionPerformed

    private void btnDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoActionPerformed
       if(jrbPass.isSelected())
       {
       ChangePasswordFrame cv=new ChangePasswordFrame();
       cv.setVisible(true);
       this.dispose();
       }
       else if(jrbTakeTest.isSelected())
       {
       PaperSelectionFrame cv=new PaperSelectionFrame();
       cv.setVisible(true);
       this.dispose();
       }
      else if(jrbViewScores.isSelected())
       {
           try
           {
               ArrayList<String> examIdList=PerformanceDao.getAllExamId(UserName.getUserName());
               if(examIdList.size()==0)
               {
               JOptionPane.showMessageDialog(null,"Not given any test","No id found",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                //ViewSingleStudentScoreFrame sc=new ViewSingleStudentScoreFrame();
           ViewStudentScoreFrame sc=new ViewStudentScoreFrame(examIdList);
           sc.setVisible(true);
           this.dispose();
       }  } catch (SQLException ex) {
               Logger.getLogger(StudentChoiceFrame.class.getName()).log(Level.SEVERE, null, ex);
           }}
      
       else
      {
          JOptionPane.showMessageDialog(null,"Select any radio button","Select any..",JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_btnDoActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
         LoginScreen login=new LoginScreen();
        login.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        Font f=new Font("tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
          Font f=new Font("tahoma",Font.BOLD,14);
        lblLogout.setFont(f);// TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(StudentChoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentChoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentChoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentChoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentChoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbPass;
    private javax.swing.JRadioButton jrbTakeTest;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
