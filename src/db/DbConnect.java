
package db;
import gui.Home;
import java.sql.*;
import javax.swing.*;
public class DbConnect {
    static public Connection c;
    static public Statement st;
    static public PreparedStatement insertClient;
    static public PreparedStatement getClient;
    static public PreparedStatement updateClient; 
    static{
        try{
        Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/clientmanagementdb","root","password");
            st=c.createStatement();
            insertClient=c.prepareStatement(
  "insert into client_info (name,gender,dob,country,address,language) "+ "values(?,?,?,?,?,?)");
            getClient=c.prepareStatement("select * from client_info where name like ?");
            updateClient=c.prepareStatement(
                    "update client_info set name=?,gender=?,dob=?,country=?,address=?," + ""
                    + "language=? where cid=?");
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
