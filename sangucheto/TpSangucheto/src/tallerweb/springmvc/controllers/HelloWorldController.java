package tallerweb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.springmvc.model.Persona;

@Controller
//agrupan comportamientos en un solo lugar;
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/hi")
	public ModelAndView helloWorld(@RequestParam("nombre") String nombre) {

		String message = "Hola, " + nombre + "!";
		ModelMap model = new ModelMap();
		model.put("persona", new Persona());
		model.put("message", message);
		return new ModelAndView("hello", model);
	}

	@RequestMapping("/hola/{nombre}")
	public ModelAndView helloWorld2(@PathVariable String nombre) {

		String message = "Hola, " + nombre + "!";
		ModelMap model = new ModelMap();
		model.put("persona", new Persona());
		model.put("message", message);
		return new ModelAndView("hello", model);
	}
	
	@RequestMapping(value = "/saludo", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("persona") Persona persona) {
		ModelMap model = new ModelMap(); 
		model.put("nombre", persona.getNombre());
		model.put("apellido", persona.getApellido());
		model.put("mail", persona.getMail());
		return new ModelAndView("bye", model);
    }

}
