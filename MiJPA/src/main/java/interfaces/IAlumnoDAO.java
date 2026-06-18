
package interfaces;

import Excepciones.PersistenciaException;
import Persistencia.AlumnoEntidad;

/**
 *
 * @author piña
 */
public interface IAlumnoDAO {
    
    AlumnoEntidad guardar(AlumnoEntidad nuevoAlumno) throws PersistenciaException;
    
    AlumnoEntidad editar(AlumnoEntidad editarAlumno) throws PersistenciaException;
    
    AlumnoEntidad buscarPorId(int id) throws PersistenciaException;
    
}
