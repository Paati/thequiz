/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import quiz.dbutil.DbConnection;
import quiz.pojo.QuestionStore;
import quiz.pojo.Questions;

/**
 *
 * @author Paaty
 */
public class QuestionDao {
    public static void addQuestions(QuestionStore qstore)throws SQLException
    {
        String qry="insert into questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList <Questions> questionList = qstore.getAllQuestions();
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    for(Questions obj:questionList)
    {
    ps.setString(1,obj.getExamId());
    ps.setInt(2,obj.getQno());
    ps.setString(3,obj.getQuestion());
    ps.setString(4,obj.getAnswer1());
   ps.setString(5,obj.getAnswer2());
   ps.setString(6,obj.getAnswer3());
   ps.setString(7,obj.getAnswer4());
   ps.setString(8,obj.getCorrectAnswer());
   ps.setString(9,obj.getLanguage());
   ps.executeUpdate();
    }
}
public static ArrayList<Questions> getQuestionsByExamId(String examId)throws SQLException{
ArrayList<Questions> que=new ArrayList<>();
    Connection conn=DbConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("select * from questions where examid=? order by qno");
ps.setString(1,examId);
ResultSet rs=ps.executeQuery();

while(rs.next())
{
    String id=rs.getString(1);
    int qno=rs.getInt(2);
    String q=rs.getString(3);
    String ans1=rs.getString(4);
    String ans2=rs.getString(5);
       String ans3=rs.getString(6);
       String ans4=rs.getString(7);
       String coans=rs.getString(8);
       String lang=rs.getString(9);
      
        Questions question=new Questions(id,lang,qno,q,ans1,ans2,ans3,ans4,coans);
        que.add(question);
       
}
return que;

}
public static void updateQuestion(QuestionStore qstore)throws SQLException
{
    String qry="update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correctanswer=? where examid=? and qno=?";
    ArrayList<Questions> questionList=qstore.getAllQuestions();
  Connection conn=DbConnection.getConnection();
PreparedStatement ps=conn.prepareStatement(qry);
for(Questions obj:questionList)
{
ps.setString(1,obj.getQuestion());
ps.setString(2,obj.getAnswer1());
ps.setString(3,obj.getAnswer2());
ps.setString(4,obj.getAnswer3());
ps.setString(5,obj.getAnswer4());
ps.setString(6,obj.getCorrectAnswer());
ps.setString(7,obj.getExamId());
ps.setInt(8,obj.getQno());
ps.executeUpdate();
}

}
        
}
