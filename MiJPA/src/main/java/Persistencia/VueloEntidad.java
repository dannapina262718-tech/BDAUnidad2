
package Persistencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author piña
 */
@Entity
@Table (name = "vuelos")
public class VueloEntidad implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "numeroPasajeros", nullable = false)
    private int numeroPasajeros;
    
    @ManyToOne
    @JoinColumn(name = "id_nave", nullable = false)
    private NaveEntidad nave;

    public VueloEntidad(int numeroPasajeros, NaveEntidad nave) {
        this.numeroPasajeros = numeroPasajeros;
        this.nave = nave;
    }

    public VueloEntidad() {
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public NaveEntidad getNave() {
        return nave;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public void setNave(NaveEntidad nave) {
        this.nave = nave;
    }
    
    

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    
    
}
