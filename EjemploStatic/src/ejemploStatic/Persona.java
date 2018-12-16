package ejemploStatic;

public class Persona {

	private String nombre;
	private int idPersona;
	private static int contadorPersonas;

	
	public Persona (String nombre){
		
		contadorPersonas++;
		
		idPersona = contadorPersonas;
		
		this.nombre= nombre;
				
		
	}
	
	
	public String toString() {

		return "Persona [id Persona: " + idPersona + ", nombre" + nombre +  "]";
		
	}
	
	
	public static int getContadorPersona() {
		return contadorPersonas;
	
	}
	
	
}
