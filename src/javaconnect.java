import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    public static Connection connecrDb(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarymanagementsystem","root","ashima");
        return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }

    
}         
            
    
    
  
    
