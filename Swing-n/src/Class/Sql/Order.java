/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Bro
 */
public class Order {
    private String name;
    private String phoneNo;
    private String address;
    private String pName;
    private String qty;
    private String uPrice;

    public Order(String name, String phoneNo, String address, String pName, String qty, String uPrice) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.pName = pName;
        this.qty = qty;
        this.uPrice = uPrice;
    }

    public Order() {
    }
    
    public boolean insertOrder() throws SQLException{
        boolean rt = false;
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/custro","root","");
                        
            String query="INSERT INTO `orders`(`phoneNo`, `name`, `address`, `pName`, `pUPrice`, `qty`) "
                    + "    VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            preparedStmt.setString(1, this.phoneNo);            
            preparedStmt.setString(2, this.name);
            preparedStmt.setString(3, this.address);
            preparedStmt.setString(4, this.pName);
            preparedStmt.setString(5, this.uPrice);
            preparedStmt.setString(6, this.qty);
            
            rt=preparedStmt.execute();
                
            con.close();
            
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }
    
    
    
    public void getPhnODet(String cPhoneNo) throws SQLException{
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/custro","root","");
            Statement stmt=con.createStatement();
            String query="SELECT `phoneNo`, `name`, `address`, `pName`, `pUPrice`, `qty` FROM `orders` WHERE phoneNo='"+cPhoneNo+"'";
            ResultSet rslt=stmt.executeQuery(query);
            while (rslt.next())
            {
                this.name=rslt.getString("name");
                this.phoneNo=rslt.getString("phoneNo");
                this.address=rslt.getString("address");                
            }
            stmt.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList getOrder() throws ClassNotFoundException, SQLException{   
        ArrayList list=new ArrayList();
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/custro","root","");
        
        Statement stmt=con.createStatement();
            
        String query="SELECT `id` as InvoiceId, date(`date`) as Date, `phoneNo` as PhoneNo, "
                + "           `name` as Name, "
                + "           `address` as Address, "
                + "           `pName` as ProductName, "
                + "           `pUPrice` as ProductPrice, "
                + "           `qty` as QTY FROM `orders` WHERE 1";
        ResultSet rslt=stmt.executeQuery(query);


        while(rslt.next()) { 
            list.add(1,rslt);
        } 

        stmt.close();
        
        return list;
    }
}
