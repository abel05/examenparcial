package asigpuestos.AsignacionPuestos.dao;

import java.util.ArrayList;
import java.util.List;

public class Puesto {
private int IdPuesto;
private String Nombre; 
private List<Asignacion> Asignaciones;

    public Puesto() {
        IdPuesto=0;
        Nombre="";
        Asignaciones =new ArrayList<>();
        
 
    }

    public Puesto(int IdPuesto, String Nombre, List<Asignacion> Asignaciones) {
        this.IdPuesto = IdPuesto;
        this.Nombre = Nombre;
        this.Asignaciones = Asignaciones;
    }

    public Puesto(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPuesto() {
        return IdPuesto;
    }

    public void setIdPuesto(int IdPuesto) {
        this.IdPuesto = IdPuesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Asignacion> getAsignaciones() {
        return Asignaciones;
    }

    public void setAsignaciones(List<Asignacion> Asignaciones) {
        this.Asignaciones = Asignaciones;
    }
    
    

}

