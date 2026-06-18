
package implementaciones;

import Excepciones.PersistenciaException;
import Persistencia.AlumnoEntidad;
import interfaces.IAlumnoDAO;

/**
 *
 * @author piña
 */
public class AlumnoDAO implements IAlumnoDAO{
    
   // public AlumnoDAO
    //conecionBD

    @Override
    public AlumnoEntidad guardar(AlumnoEntidad nuevoAlumno) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AlumnoEntidad editar(AlumnoEntidad editarAlumno) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AlumnoEntidad buscarPorId(int id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
