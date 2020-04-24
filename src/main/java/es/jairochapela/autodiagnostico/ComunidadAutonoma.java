package es.jairochapela.autodiagnostico;

public class ComunidadAutonoma {
    private long id;
    private String nombre;

    public ComunidadAutonoma() {
    }


    public ComunidadAutonoma(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
	}

	/**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
