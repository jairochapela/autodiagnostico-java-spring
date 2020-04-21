package es.jairochapela.autodiagnostico;

public class Paciente {

    private String comunidadAutonoma;
    
    private String ciudad;

    private String codigoPostal;
    
    /**
     * @return the comunidadAutonoma
     */
    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    /**
     * @param comunidadAutonoma the comunidadAutonoma to set
     */
    public void setComunidadAutonoma(String comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
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