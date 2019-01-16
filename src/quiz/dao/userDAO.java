/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.*;
import quiz.dbutil.DbConnection;
import quiz.pojo.user;

/**
 *
 * @author Paaty
 */
public class userDAO {
    public static boolean loginScreen(user us)throws SQLException
    {
        //user us=new user();
   Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select *from users where userid=? and password=? and usertyp=?");
        ps.setString(1,us.getId());
        ps.setString(2,us.getPwd());
        ps.setString(3,us.getType());
        ResultSet rs=ps.executeQuery();
        if(rs.next()==true)
        return true;
        else
        return false;
        
    }
    public static boolean registerStudent(user u)throws SQLException
    {
    Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1,u.getId());
        ps.setString(2,u.getPwd());
        ps.setString(3,u.getType());
        int rs=ps.executeUpdate();
        if(rs>0)
            return true;
        return false;
    }
    public static boolean updatePassword(user Id)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where usertyp=? and userid=?");
        ps.setString(1,Id.getPwd());
        ps.setString(2,Id.getType());
        ps.setString(3,Id.getId());
       int rs=ps.executeUpdate();
       if(rs!=0)
           return true;
       return false;
    }
}
