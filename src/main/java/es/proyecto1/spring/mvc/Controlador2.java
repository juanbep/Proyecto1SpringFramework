package es.proyecto1.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class Controlador2 {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {// Proporciona el formulario

		return "holaAlumnosFormulario";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {

		return "holaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
	// public String otroProcesoFormulario(HttpServletRequest request, Model modelo)
	// {

	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		//String nombre = request.getParameter("nombreAlumno");

		nombre += "  es el mejor alumno ";

		String mensajeFinal = "¿Quién es el mejor alumno? " + nombre;

		// agregando información al modelo

		modelo.addAttribute("mensajeClaro", mensajeFinal);

		return "holaAlumnosSpring";
	}

}
