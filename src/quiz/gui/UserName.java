/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.gui;

/**
 *
 * @author Paaty
 */
public class UserName {
    
private static String userName;
    private static String userType;
    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserName.userName = userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserName.userType = userType;
    }
    
  
}
