
package Crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
 private final String base = "sql9380113";
    private final String user = "sql9380113";
    private final String password = "9UeVeF2yEy";
    private final String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/" + base;
    private java.sql.Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return   (Connection) con;  
    }

}
