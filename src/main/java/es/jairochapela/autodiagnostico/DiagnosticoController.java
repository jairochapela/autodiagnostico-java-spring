package es.jairochapela.autodiagnostico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class DiagnosticoController implements WebMvcConfigurer {


	@GetMapping("/")
	public String showForm() {
		return "form";
	}
}