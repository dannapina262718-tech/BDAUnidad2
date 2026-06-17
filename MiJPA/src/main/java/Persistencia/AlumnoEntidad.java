
package Persistencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author piña
 */
@Entity 
@Table(name = "Alumnos")
public class AlumnoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellidoPaterno", nullable = false, length = 50)
    private String apellidoPaterno;
    @Column(name = "apellidoPaterno", nullable = false, length = 50)
    private String apellidoMaterno;
    @Column(name = "esActivo", nullable = false)
    private boolean esActivo;
    @Column(name = "esEliminado", nullable = false)
    private boolean esEliminado;

    public AlumnoEntidad() {
    }

    public AlumnoEntidad(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.esActivo = true;
        this.esEliminado = false;
    }
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public boolean isEsEliminado() {
        return esEliminado;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }

    public void setEsEliminado(boolean esEliminado) {
        this.esEliminado = esEliminado;
    }
    
    
    
}
