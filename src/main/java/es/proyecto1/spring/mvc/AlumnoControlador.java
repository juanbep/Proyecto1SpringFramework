package es.proyecto1.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/alumno")
public class AlumnoControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {

		Alumno elAlumno = new Alumno();

		modelo.addAttribute("elAlumno", elAlumno);

		return "alumnoRegistroFormulario";

	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno elAlumno,
			BindingResult resultadoValidacion) {

		if (resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		} else {
			return "confirmacionRegistroAlumno";
		}

	}

}
