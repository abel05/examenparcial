/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigpuestos.AsignacionPuestos.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABEL
 */
public class Empleado {
    private int IdEmpleado;
    private String dni;
    private String Nombre;
    private String ApPaterno;
    private String ApMaternno;
    private List<Asignacion> Asignaciones;

    public Empleado() {
        this.IdEmpleado = 0;
        this.dni = "";
        this.Nombre = "";
        this.ApPaterno = "";
        this.ApMaternno = "";
        this.Asignaciones = new ArrayList<>();
    }

    public Empleado(int IdEmpleado, String dni, String Nombre, String ApPaterno, String ApMaternno, List<Asignacion> Asignaciones) {
        this.IdEmpleado = IdEmpleado;
        this.dni = dni;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaternno = ApMaternno;
        this.Asignaciones = Asignaciones;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaternno() {
        return ApMaternno;
    }

    public void setApMaternno(String ApMaternno) {
        this.ApMaternno = ApMaternno;
    }

    public List<Asignacion> getAsignaciones() {
        return Asignaciones;
    }

    public void setAsignaciones(List<Asignacion> Asignaciones) {
        this.Asignaciones = Asignaciones;
    }
    
    
}
