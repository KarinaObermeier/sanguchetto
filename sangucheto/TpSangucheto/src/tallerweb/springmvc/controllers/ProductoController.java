package tallerweb.springmvc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import tallerweb.springmvc.model.Ingrediente;
import tallerweb.springmvc.model.Stock;
import tallerweb.springmvc.model.TipoIngrediente;

@Controller

public class ProductoController {
	        
			@RequestMapping("/AgregarStock")
			public ModelAndView AgregarStock() {
				ModelMap miMap = new ModelMap();
				miMap.put("command", new AgregarStock());
				miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
				return new ModelAndView("agregarStock",miMap);
			}
	
		    
	
	
			@RequestMapping("/eliminarStock")
			public ModelAndView eliminarStock() {
		    	ModelMap miMap = new ModelMap();
				miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
				miMap.put("command", new Ingrediente());
				return new ModelAndView("eliminarStock",miMap);
			}
	
	
	
  	   		@RequestMapping("/eliminar")
  		    public ModelAndView eliminar(Ingrediente ingrediente) {
  			String mensaje;
  			ModelMap miMap = new ModelMap();
  			Boolean resultado = Stock.getInstance().eliminarIngrediente(ingrediente);
  			
  			if(resultado == true) {
  				mensaje = ingrediente.getNombre()+" eliminado con exito";
  			}
  			else {
  				mensaje = "Hubo un error al eliminar el ingrediente";
  			}
  			miMap.put("mensaje",mensaje);
  			return new ModelAndView("resultado",miMap);
  		}
	
	
	
		@RequestMapping("/stock")
		public ModelAndView obtenerStock() {
			ModelAndView stock = new ModelAndView("stock");
			stock.addObject("stock",Stock.getInstance().obtenerStock());
			return stock;
		}  
	
	
	
	  @RequestMapping(value = "/altaProducto", method = RequestMethod.GET)
	   public ModelAndView altaProducto() {
	      return new ModelAndView("altaProducto", "command", new Ingrediente());
	   }
	   
	  
	   
	  @RequestMapping(value = "/darAlta", method = RequestMethod.POST)
	   public String darAlta(@ModelAttribute("TpSangucheto")Ingrediente ingrediente, 
	                         ModelMap model) {
		   
		  String mensaje;
		  model.addAttribute("nombre", ingrediente.getNombre());
	      model.addAttribute("precio", ingrediente.getPrecio());
	   
	      
	    if(ingrediente.getTipo()==TipoIngrediente.INGREDIENTE){
			model.addAttribute("tipo",TipoIngrediente.INGREDIENTE);
		} else {
			model.addAttribute("tipo",TipoIngrediente.CONDIMENTO);
		}
			
		Boolean resultado = Stock.getInstance().agregarIngrediente(ingrediente);		
		
		if(resultado == true) {
			mensaje = "Se dio de alta a el  "+ ingrediente.getTipo() + ingrediente.getNombre() 
			           + " , Precio :" + ingrediente.getPrecio() ;
		}
		else {
			mensaje = "No se pudo dar de alta el producto";
		}
	      
		model.addAttribute("mensaje",mensaje); 
	      
	    return "resultado";
	   }
	
}
