package es.jairochapela.autodiagnostico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class DiagnosticoController implements WebMvcConfigurer {

    
    @PersistenceContext
    EntityManager entityManager;

    /**
     * Este método del controlador únicamente muestra la plantilla del formulario HTML.
     * @param model
     * @return
     */
	@GetMapping("/")
	public String showForm(final Paciente paciente, final Model model) {
        //model.addAttribute("paciente", new Paciente());

        final List<ComunidadAutonoma> comunidadesAutonomas = entityManager.createQuery("SELECT c FROM ComunidadAutonoma c", ComunidadAutonoma.class).getResultList();
        final List<Sintoma> sintomas = entityManager.createQuery("SELECT s FROM Sintoma s", Sintoma.class).getResultList();
        
        model.addAttribute("comunidadesAutonomas", comunidadesAutonomas);
        model.addAttribute("sintomas", sintomas);
		return "form";
    }

    /**
     * Este método recibe por POST los datos que el usuario introduce en el
     * formulario, contenidos todos en el objeto paciente.
     * 
     * @param paciente Los datos del paciente del formulario.
     * @return
     */
    @PostMapping("/")
    public String procesarDatos(@Valid final Paciente paciente, final BindingResult bindingResult, final Model model) {
        // Primero comprobamos que no haya errores en los campos del formulario.
        if (bindingResult.hasErrors()) {
            return "form";
        }

        // Si no hay errores en el formulario, seguimos por aquí.
        model.addAttribute("resultado", "No estás enfermo");
        return "resultado";
    }

}