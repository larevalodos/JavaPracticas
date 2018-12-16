package ejemploarreglos;

public class Persona {

	private String nombre;
	private String direccion;
	private char genero;
	private int edad;

 
	public Persona (){}
	
	public Persona (String nombre){
		
		this.nombre= nombre;
		
	}
	public Persona (String nombre, int edad){
		
		this.nombre= nombre;
		this.edad= edad;
		
	}
	public Persona (String nombre, char genero ,int edad, String direccion){
		
		this.nombre= nombre;
		this.genero= genero;
		this.edad= edad;
		this.direccion= direccion;
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	
	}
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	
	}
	public char getgenero() {
		return genero;
	
	}
	
	public void setgenero(char genero) {
		this.genero=genero;
		
	
	}
	
	public int getEdad() {
		return edad;
	
	}
	
	
	public void setEdad(int edad) {
		 this.edad=edad;
	
	}
	
	public String getDireccion() {
		return direccion;
	
	}
	public void setDireccion(String direccion) {
		
		this.direccion=direccion;
	
	}
	
	
	@Override
	public String toString(){
		return "Persona {"+ "nombre=" + getNombre()+ "}";
	}
	
	
}
