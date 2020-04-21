package es.jairochapela.autodiagnostico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Esta es la clase principal, encargada de "levantar" el servicio mediante el
 * cual podemos poner en marcha la aplicación.
 * 
 * Al incorporar la anotación @RestController, hacemos que esta clase gestione
 * peticiones GET, POST, ...
 * 
 * En un proyecto más grande sería conveniente separar el código de controlador
 * en otras clases en vez de tenerlo aquí todo junto.
 */
@SpringBootApplication
public class AutodiagnosticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutodiagnosticoApplication.class, args);
	}
	
}
