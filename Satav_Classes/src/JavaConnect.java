/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:SATAV_CLASS.sqlite");
           //JOptionPane.showMessageDialog(null,"connection established");
                    
          return conn;  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e+"\nConnection Error\nplease check..");
            return null;
        }
        
    }
    
    
}
