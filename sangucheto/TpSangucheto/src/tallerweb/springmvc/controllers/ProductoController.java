package tallerweb.springmvc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.springmvc.model.Ingrediente;
import tallerweb.springmvc.model.Stock;
import tallerweb.springmvc.model.TipoIngrediente;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@RequestMapping(value="/altaProducto")
	public ModelAndView altaProducto() {
		ModelMap modelMap = new ModelMap();
		
		ArrayList<String> tipos = new ArrayList<String>();
		tipos.add(TipoIngrediente.CONDIMENTO.name());
		tipos.add(TipoIngrediente.INGREDIENTE.name());
		
		modelMap.put("tipos",tipos);
		
		modelMap.put("ingrediente", new Ingrediente()); 
		
		return new ModelAndView("altaProducto",modelMap);
	}
	
	@RequestMapping(value="/darAlta",method=RequestMethod.POST)
	public ModelAndView darAlta(@ModelAttribute("ingrediente") Ingrediente ingrediente) {
		Ingrediente ingrediente1 = new Ingrediente();
		String mensaje;
		ModelMap miMap = new ModelMap();
		
		ingrediente1.setNombre(ingrediente.getNombre());
		ingrediente1.setPrecio(ingrediente.getPrecio());
		
		if(ingrediente.getTipo().equals("INGREDIENTE")){
			ingrediente1.setTipo(TipoIngrediente.INGREDIENTE);
		} else {
			ingrediente1.setTipo(TipoIngrediente.CONDIMENTO);
		}
			
		Boolean resultado = Stock.getInstance().agregarIngrediente(ingrediente1);		
		
		if(resultado == true) {
			mensaje = "Se dio de alta a su producto " + ingrediente.getNombre();
		}
		else {
			mensaje = "No se pudo dar de alta el ingrediente";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("resultado",miMap);
	}

}
