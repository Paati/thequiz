/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import quiz.dbutil.DbConnection;
import quiz.pojo.exampojo;

/**
 *
 * @author Paaty
 */
public class ExamDao {
    public static String getExamId()throws SQLException
    {
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select count(*)as totalrows from exam");
    ResultSet rs=ps.executeQuery();
    int total_rows=0;
    if(rs.next())
       total_rows=rs.getInt(1);
    String newId="EX"+(total_rows+1);
    return newId;
    }
    public static void addExam(exampojo newExam)throws SQLException
    {
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
    ps.setString(1,newExam.getExamId());
    ps.setString(2,newExam.getLanguage());
    ps.setInt(3,newExam.getTotalQuestion());
    ps.executeUpdate();
    
    }    
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where language=?");
        ps.setString(1,subject);
    ArrayList<String> examList=new ArrayList<>();
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    examList.add(rs.getString(1));
    }
       return examList;
    }
    public static int getQuestionCountByExam(String examId)throws SQLException
    {
    Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select totalquestion from exam where examId=?");
        ps.setString(1,examId);
      ResultSet rs=ps.executeQuery();
      rs.next();
          int Que=rs.getInt(1);
          return Que;
    }
}
