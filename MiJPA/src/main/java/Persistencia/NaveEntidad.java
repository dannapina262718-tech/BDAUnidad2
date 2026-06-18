
package Persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author piña
 */
@Entity
@Table (name = "Naves")
public class NaveEntidad implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "nave")
    private List<VueloEntidad> vuelos;
    
    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    public NaveEntidad() {
    }

    public NaveEntidad(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
    
}
