
package asigpuestos.AsignacionPuestos.dao.implementacion;

import asigpuestos.AsignacionPuestos.dao.Interfaces.PuestoDao;
import asigpuestos.AsignacionPuestos.dao.Puesto;
import asigpuestos.AsignacionPuestos.jdbc.ConexionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PuestoImplementacion implements PuestoDao {

    @Override
    public List<Puesto> listar() {
        Statement statement = null;
        try {
            Connection connection = ConexionSingleton.getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *FROM Puesto");
            List<Puesto> puestos = new ArrayList<>();
            
            while(rs.next()){
                Puesto puesto = new Puesto();
                puesto.setNombre(rs.getString("Nombre"));
                puestos.add(puesto);
            }
            return puestos;
        } catch (SQLException ex) {
            Logger.getLogger(PuestoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
   }

    @Override
    public void guardar(Puesto puesto) {
        try{
    Connection connection = ConexionSingleton.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Puesto VALUES(?)");
            ps.setString(1, puesto.getNombre());
            
            ps.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(PuestoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
                       
        }
        
    }

    @Override
    public void modificar(Puesto puesto) {
     try{
    Connection connection = ConexionSingleton.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE Puesto SET Nombre= ? WHERE Nombre=?");
            ps.setString(1, puesto.getNombre());
            ps.setString(2, puesto.getNombre());
            ps.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(PuestoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
                       
        }
    }

    @Override
    public void borrar(Puesto puesto) {
     try{
    Connection connection = ConexionSingleton.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM Puesto WHERE Nombre="+puesto.getNombre());
        }catch(SQLException ex){
            Logger.getLogger(PuestoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
                       
        }
    }
    
    
}
