package es.jairochapela.autodiagnostico;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String showForm(Paciente paciente) {
        //model.addAttribute("paciente", new Paciente());
		return "form";
    }
    
    /**
     * Este método recibe por POST los datos que el usuario introduce en el formulario,
     * contenidos todos en el objeto paciente.
     * @param paciente Los datos del paciente del formulario.
     * @return
     */
    @PostMapping("/")
    public String procesarDatos(@Valid Paciente paciente, BindingResult bindingResult, Model model) {
        // Primero comprobamos que no haya errores en los campos del formulario.
        if (bindingResult.hasErrors()) {
            return "form";
        }

        // Si no hay errores en el formulario, seguimos por aquí.
        model.addAttribute("resultado", "No estás enfermo");
        return "resultado";
    }

}