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
import java.sql.*;
import java.util.ArrayList;
import quiz.dbutil.DbConnection;
import quiz.pojo.Performance;
import quiz.pojo.StudentScore;

/**
 *
 * @author Paaty
 */
public class PerformanceDao {
    public static ArrayList<String> getAllStudentId()throws SQLException
    {
        String qry="select distinct userid from performance";
        ArrayList<String> studentIdList=new ArrayList<>();
    Connection conn=DbConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(qry);
    while(rs.next())
            {
            String id=rs.getString(1);
            studentIdList.add(id);
            }
 return studentIdList;   }
    public static ArrayList<String> getAllExamId(String studentId)throws SQLException
    {
    String qry="select examid from performance where userid=?";
    ArrayList<String>examIdList=new ArrayList<>();
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,studentId);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    String id=rs.getString(1);
    examIdList.add(id);
    }
    return examIdList;
    }
    public static StudentScore getScore(String studentId,String examId )throws SQLException
    {
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select language,per from performance where userid=? and examid=?");
    ps.setString(1,studentId);
    ps.setString(2, examId);
    
    ResultSet rs=ps.executeQuery();
    rs.next();
    StudentScore st=new StudentScore();
    st.setLanguage(rs.getString(1));
    st.setPercent(rs.getDouble(2));
    //System.out.println(studentId +""+st.getPercent()+""+examId);
    return st;
    }
    public static ArrayList<Performance> getAllData()throws SQLException
    {
    Connection conn=DbConnection.getConnection();
    PreparedStatement st=conn.prepareStatement("select *from performance");
    ResultSet rs=st.executeQuery();
    ArrayList<Performance> pList=new ArrayList<>();
    while(rs.next())
    {
    String userId=rs.getString("userid");
    String examId=rs.getString("examid");
    String language=rs.getString("language");
    
    int right=rs.getInt("right");
    int wrong=rs.getInt("wrong");
    int unattempted=rs.getInt("unattempted");
    double per=rs.getDouble("per");
    
    Performance p=new Performance(examId,language,userId,right,wrong,unattempted,per);
   pList.add(p);
    }
   return pList; }
     public static ArrayList<String> getAllExamId1(String lang)throws SQLException
    {
    String qry="select examid from exam where language=?";
    ArrayList<String>examIdList=new ArrayList<>();
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,lang);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    String id=rs.getString(1);
    examIdList.add(id);
    }
    return examIdList;
    }
     public static void addPerforrmance(Performance prf)throws SQLException
     {
     Connection conn=DbConnection.getConnection();
     String qry="insert into performance values(?,?,?,?,?,?,?)";
     PreparedStatement ps=conn.prepareStatement(qry);
     ps.setString(1,prf.getUserid());
     ps.setString(2,prf.getExamid());
     ps.setInt(3,prf.getRight());
     ps.setInt(4,prf.getWrong());
      ps.setInt(5,prf.getUnattempted());
      ps.setDouble(6,prf.getPer());
      ps.setString(7,prf.getLanguage());
      ps.executeUpdate();
     }
}
         
