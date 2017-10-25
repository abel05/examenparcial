
package asigpuestos.AsignacionPuestos.dao;

import java.util.Date;

public class Asignacion {
    private int IdAsignacion;
    private Date Fecha_inicio;
    private Date Fecha_fin;
    private boolean Activo;
    private Puesto puesto;
    private Empleado empleado;


    public Asignacion() {
    this.IdAsignacion=0;
    this.Fecha_inicio=new Date();
    this.Fecha_fin=new Date();
    this.empleado=new Empleado();
    }

    public Asignacion(int IdAsignacion, Date Fecha_inicio, Date Fecha_fin, boolean Activo, Puesto puesto, Empleado empleado) {
        this.IdAsignacion = IdAsignacion;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.Activo = Activo;
        this.puesto = puesto;
        this.empleado = empleado;
    }

    public int getIdAsignacion() {
        return IdAsignacion;
    }

    public void setIdAsignacion(int IdAsignacion) {
        this.IdAsignacion = IdAsignacion;
    }

    public Date getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Date Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public Date getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(Date Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    
    
    
    
   
}




