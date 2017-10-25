package asigpuestos.AsignacionPuestos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionSingleton {
    private static Connection connection = null;
    
    private ConexionSingleton(){}
    
    public static Connection getConnection(){
        if (connection==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/puestos","usuario","usuario1");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
    
           
    
    
}
