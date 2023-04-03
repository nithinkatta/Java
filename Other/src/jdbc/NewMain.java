/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;
import java.sql.*;
/**
 *
 * @author nithin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        try
        {
            Class.forName(("com.mysql.cj.jdbc.Driver"));
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","P@ssWord01");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students;");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            
            new f2().setVisible(true);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
    
}
