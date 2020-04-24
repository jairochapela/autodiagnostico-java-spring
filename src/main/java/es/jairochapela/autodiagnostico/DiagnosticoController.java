package es.jairochapela.autodiagnostico;

import java.util.List;

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
	public String showForm(final Paciente paciente, final Model model) {
        //model.addAttribute("paciente", new Paciente());
        final List<ComunidadAutonoma> comunidadesAutonomas = List.of(
            new ComunidadAutonoma(1, "Andalucía"),
            new ComunidadAutonoma(2, "Aragón"),
            new ComunidadAutonoma(3, "Principado de Asturias"),
            new ComunidadAutonoma(4, "Islas Baleares"),
            new ComunidadAutonoma(5, "País Vasco"),
            new ComunidadAutonoma(6, "Canarias"),
            new ComunidadAutonoma(7, "Cantabria"),
            new ComunidadAutonoma(8, "Castilla-La Mancha"),
            new ComunidadAutonoma(9, "Castilla y León"),
            new ComunidadAutonoma(10, "Cataluña"),
            new ComunidadAutonoma(11, "Extremadura"),
            new ComunidadAutonoma(12, "Galicia"),
            new ComunidadAutonoma(13, "Comunidad de Madrid"),
            new ComunidadAutonoma(14, "Región de Murcia"),
            new ComunidadAutonoma(15, "Comunidad Foral de Navarra"),
            new ComunidadAutonoma(16, "La Rioja"),
            new ComunidadAutonoma(17, "Comunidad Valenciana"),
            new ComunidadAutonoma(18, "Ceuta"),
            new ComunidadAutonoma(19, "Melilla")
        );
        model.addAttribute("comunidadesAutonomas", comunidadesAutonomas);
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