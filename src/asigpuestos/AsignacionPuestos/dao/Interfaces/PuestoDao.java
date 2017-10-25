
package asigpuestos.AsignacionPuestos.dao.Interfaces;

import asigpuestos.AsignacionPuestos.dao.Puesto;
import java.util.List;

public interface PuestoDao {
    public List<Puesto>listar();
    public void guardar(Puesto puesto);
    public void modificar(Puesto puesto);
    public void borrar (Puesto puesto);
}

