/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bro
 */
public class LogInPass {
    private String uName;

    public LogInPass(String uName) {
        this.uName = uName;
    }
    
    public String getUserPass() throws ClassNotFoundException, SQLException{
        String pass=null;
        
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/custro","root","");
        
        Statement stmt=con.createStatement();
            
        String query="SELECT `passWord` FROM `user` WHERE uName=\""+uName+"\"";
        ResultSet rslt=stmt.executeQuery(query);
        
        while (rslt.next())
        {
            pass=rslt.getString("passWord");
        }
        stmt.close();

        return pass;
    }    
}
