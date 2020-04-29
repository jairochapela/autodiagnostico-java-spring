package es.jairochapela.autodiagnostico;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private ComunidadAutonoma comunidadAutonoma;
    
    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "edad")
    private int edad;

    @ManyToMany
    private Set<Sintoma> sintomas;
    

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param comunidadAutonoma the comunidadAutonoma to set
     */
    public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    /**
     * @return the comunidadAutonoma
     */
    public ComunidadAutonoma getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}