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
import quiz.dao.QuestionDao;
import quiz.pojo.Answer;
import quiz.pojo.AnswerStore;
import quiz.pojo.Performance;
import quiz.pojo.QuestionStore;
import quiz.pojo.Questions;
import quiz.pojo.exampojo;
import quiz.pojo.user;

/**
 *
 * @author Paaty
 */
public class TakeTestFrame extends javax.swing.JFrame {
private exampojo exam;
private QuestionStore qstore;
private AnswerStore astore;

    int qno,pos=0,f;
    String correctAnswer,chosenAnswer;
/**
     * Creates new form TakeTestFrame
     */
    public TakeTestFrame() {
        initComponents();
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
        btnPrevious.setEnabled(false);
    }
    public TakeTestFrame(exampojo exam)
    {
    this();
    this.exam=exam;
    lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
    loadQuestion();
    showQuestion();
    
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
        lblTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQue = new javax.swing.JTextArea();
        jrb1 = new javax.swing.JRadioButton();
        jrb2 = new javax.swing.JRadioButton();
        jrb3 = new javax.swing.JRadioButton();
        jrb4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();

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

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("Paper");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/gui/good luck2.jpg"))); // NOI18N
        jLabel3.setText("                                   ");

        lblQno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 0, 0));
        lblQno.setText("Question no");

        txtQue.setEditable(false);
        txtQue.setColumns(20);
        txtQue.setRows(5);
        jScrollPane1.setViewportView(txtQue);

        buttonGroup1.add(jrb1);
        jrb1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrb1.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroup1.add(jrb2);
        jrb2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrb2.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroup1.add(jrb3);
        jrb3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrb3.setForeground(new java.awt.Color(255, 0, 0));
        jrb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb4);
        jrb4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jrb4.setForeground(new java.awt.Color(255, 0, 0));
        jrb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4ActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 0, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 0, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancle.setBackground(new java.awt.Color(0, 0, 0));
        btnCancle.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(255, 0, 0));
        btnCancle.setText("Cancle");

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 0, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrb1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jrb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrb2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancle)
                        .addGap(18, 18, 18)
                        .addComponent(btnDone)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb1)
                    .addComponent(jrb2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb4)
                    .addComponent(jrb3))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancle)
                    .addComponent(btnDone))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb4ActionPerformed

    private void jrb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb3ActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
     /*    int a=JOptionPane.showConfirmDialog(null,"Are You Sure To Submit the Test..?", "Confirmation...?",JOptionPane.YES_NO_CANCEL_OPTION);
     if(a==JOptionPane.YES_OPTION)
     {
         try {
            boolean b= PerformanceDao.generateResult(astore);
             if(b==true)
             JOptionPane.showMessageDialog(null,"Successfully Submitted..!","Submitted...!",JOptionPane.INFORMATION_MESSAGE);
             else
               JOptionPane.showMessageDialog(null,"Not Submitted..!","Error in Submission....!",JOptionPane.INFORMATION_MESSAGE);  
                 } 
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error "+ex,"Error...!",JOptionPane.INFORMATION_MESSAGE);
         }
     }*/
       String chosenAnswer=getUserAnswer();
     if(chosenAnswer!=null)
     {
     Questions question=qstore.getQuestion(pos);
     String correctAnswer=question.getCorrectAnswer();
     Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
     Answer answer=astore.getAnswerByQno(qno);
     if(answer==null)
         astore.addAnswer(newanswer);
     else{
     if(newanswer.getChosenAnswer().equalsIgnoreCase(answer.getChosenAnswer())==false)
     {int apos=astore.removeAnswer(answer);
     astore.setAnswerAt(apos,newanswer);
     }
     }}
     int right=0,wrong=0;
     for(Questions question:qstore.getAllQuestions())
     {
     int qno=question.getQno();
     Answer answer=astore.getAnswerByQno(qno);
     if(answer==null)
         continue;
     else 
     {
     String chosenAnswer1=answer.getChosenAnswer();
     String correctAnswer=answer.getCorrectAnswer();
     if(chosenAnswer1.equals(correctAnswer))
         ++right;
     else
         ++wrong;
     
     }
     }
     String reportCard="Total Question:"+qstore.getCount();
     reportCard+="\nRight Answer:"+right;
     reportCard+="\nWrong Answer:"+wrong;
     reportCard+="\nUnattempted:"+(qstore.getCount()-(right+wrong));
     JOptionPane.showMessageDialog(null,reportCard,"Your Result",JOptionPane.INFORMATION_MESSAGE);
     try{//String userid, String examid, String language, int right, int wrong, int unattempted, double per
         double r=right*100;
         double tq=exam.getTotalQuestion();
         double per=r/tq;
         System.out.println(per);
         
         Performance perform=new Performance(user.getId(),exam.getExamId(),exam.getLanguage(),right,wrong,(qstore.getCount())-(right+wrong),per);
          PerformanceDao.addPerforrmance(perform);
          JOptionPane.showMessageDialog(null,"Done","done..",JOptionPane.INFORMATION_MESSAGE);
          PaperSelectionFrame cp=new PaperSelectionFrame();
          cp.setVisible(true);
          this.dispose();
     }
     catch(SQLException e){}
     
     
     
    }//GEN-LAST:event_btnDoneActionPerformed
 
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       btnPrevious.setEnabled(true);
    String chosenAnswer=getUserAnswer();
     /*  Answer obj=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);  
       if(f==0)
        astore.setAnswerAt(pos,obj);
       else 
       {
           astore.removeAnswer(pos);
           astore.setAnswerAt(pos,obj);
       }
         //lblQno.setText("Question no"+qno);
           pos++;
       qno++;
          if(qno>qstore.getCount())
       {
      // btnNext.setEnabled(false);
       pos=0;
       qno=1;
       }
          lblQno.setText("Question No.:"+qno);
       showQuestion();
       */
     if(chosenAnswer!=null)
     {
     Questions question=qstore.getQuestion(pos);
     String correctAnswer=question.getCorrectAnswer();
     Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
     Answer answer=astore.getAnswerByQno(qno);
     if(answer==null)
         astore.addAnswer(newanswer);
     else{
     if(newanswer.getChosenAnswer().equalsIgnoreCase(answer.getChosenAnswer())==false)
     {int apos=astore.removeAnswer(answer);
     astore.setAnswerAt(apos,newanswer);
     }
     }}
     pos++;
     if(pos>=qstore.getCount())
     {
     pos=0;
     }
     qno++;
     if(qno>qstore.getCount())
         qno=1;
     lblQno.setText("Question no:"+qno);
     showQuestion();
     
       
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
     /*  if(qno>=0)
       {
             if(jrb1.isSelected())
      chosenAnswer="Answer1";
  else if(jrb2.isSelected())
      chosenAnswer="Answer2";
  else if(jrb3.isSelected())
      chosenAnswer="Answer3";
  else if(jrb4.isSelected())
      chosenAnswer="Answer4";
  Answer obj=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
  if(f==0)
  astore.setAnswerAt(pos,obj);
  else
  {
  astore.removeAnswer(pos);
  astore.setAnswerAt(pos, obj);
  }
         qno--;
         pos--;
     if(qno==0)
     {
     qno=exam.getTotalQuestion();
     pos=qstore.getCount()-1;
     }
     lblQno.setText("Question No. :"+qno);
     showQuestion();
     
       }*/
     
     
             String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Questions question=qstore.getQuestion(pos);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
      qno--;
        if(qno<=0)
        qno=qstore.getCount();
        lblQno.setText("Question no:"+qno);
        showQuestion();
          

             
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
          LoginScreen login=new LoginScreen();
        login.setVisible(true);
        this.dispose(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
       Font f=new Font("tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
           Font f=new Font("tahoma",Font.BOLD,14);
        lblLogout.setFont(f);
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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrb1;
    private javax.swing.JRadioButton jrb2;
    private javax.swing.JRadioButton jrb3;
    private javax.swing.JRadioButton jrb4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtQue;
    // End of variables declaration//GEN-END:variables
public void loadQuestion()
{
try{
    ArrayList<Questions> questionList=QuestionDao.getQuestionsByExamId(exam.getExamId());
    for(Questions obj:questionList)
    {
    qstore.addQuestion(obj);
    }
    
}   catch (SQLException ex) {
JOptionPane.showMessageDialog(null,"Problem in fetching qoustions"+ex,"Error",JOptionPane.ERROR_MESSAGE);
}

}
public void showQuestion()
{
Questions q=qstore.getQuestion(pos);
buttonGroup1.clearSelection();
txtQue.setText(q.getQuestion());
jrb1.setText(q.getAnswer1());
jrb2.setText(q.getAnswer2());
jrb3.setText(q.getAnswer3());
jrb4.setText(q.getAnswer4());
Answer answer=astore.getAnswerByQno(qno);
if(answer==null)
{
 //   f=0;
    return;
}
//f=1;

 chosenAnswer=answer.getChosenAnswer();
 //if(chosenAnswer==null)
 //return;
switch(chosenAnswer)
{
    case"Answer1":
        jrb1.setSelected(true);
        break;
        case"Answer2":
        jrb2.setSelected(true);
        break;
        case"Answer3":
        jrb3.setSelected(true);
        break;
        case"Answer4":
        jrb4.setSelected(true);
        break;
}
}
public String getUserAnswer()
{
  if(jrb1.isSelected())
 return "Answer1";
  else if(jrb2.isSelected())
 return "Answer2";
  else if(jrb3.isSelected())
      return "Answer3";
  else if(jrb4.isSelected())
    return "Answer4";
  else
  return null;
}
        
}
