/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Paaty
 */
public class DbConnection {
    private static Connection conn;
static{
    try
    {
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-SD63RTL:1521/xe","project","java");
          JOptionPane.showMessageDialog(null,"connected Successfully to DB","Success!!",JOptionPane.INFORMATION_MESSAGE);
              
    }
    catch(Exception e)
    {
                    JOptionPane.showMessageDialog(null,"Error Connecting DataBase"+e,"Errror",JOptionPane.ERROR_MESSAGE);
                    System.out.println("Error"+e);
                    
    }
}
public static Connection getConnection()
{
    return conn;
}
public static void closeConnection()
{      if(conn!=null)
        {try {
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error disconnecting DB"+ex,"Errror",JOptionPane.ERROR_MESSAGE);
           }
        
}}
    
}
