package tallerweb.springmvc.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sanguchetto {

	private static Sanguchetto instance = new Sanguchetto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
	
	private Sanguchetto(){}
	
	public static Sanguchetto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	public void vaciar(){
		// Implementar
		this.ingredientes.clear();
		
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	
	public void agregarIngrediente(Ingrediente ingrediente){
		// Implementar 
		this.ingredientes.add(ingrediente);
	    
		
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	
	public List<Ingrediente> verIngredientes(){
		// Implementar ,preguntar
		List<Ingrediente> lista = new LinkedList<Ingrediente>();
		Iterator<Ingrediente> r = lista.iterator();
		while (r.hasNext()){
			System.out.println(r.next());
			}
		
		return null;
	}
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
    	//preguntar
    	List<Ingrediente> lista = new LinkedList<Ingrediente>();
		Iterator<Ingrediente> r = lista.iterator();
		while (r.hasNext()){
			System.out.println(r.next());
			}
    	
        return null;
    }
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		// Implementar
		return null;
	}
}
