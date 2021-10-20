package es.proyecto1.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/alumno")
public class AlumnoControlador {

	
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		
		StringTrimmerEditor eliminaEspaciosBlanco = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, eliminaEspaciosBlanco);
		
	}
	
	
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
