package es.jairochapela.autodiagnostico;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class DiagnosticoController implements WebMvcConfigurer {


    /**
     * Este método del controlador únicamente muestra la plantilla del formulario HTML.
     * @param model
     * @return
     */
	@GetMapping("/")
	public String showForm(Model model) {
        model.addAttribute("paciente", new Paciente());
		return "form";
    }
    
    /**
     * Este método recibe por POST los datos que el usuario introduce en el formulario,
     * contenidos todos en el objeto paciente.
     * @param paciente Los datos del paciente del formulario.
     * @return
     */
    @PostMapping("/")
    public String procesarDatos(@ModelAttribute Paciente paciente) {
        return "form";
    }
}