package encapsulamientojava;

public class Encapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona ("Juna","Perez",false);
		
		System.out.println("Nombre p1: " + p1.getNombre());
		
		
		Persona p2 = new Persona ("Karla","Lopez",false);
		
		System.out.println(" Estado objeto p2: " + p2);
		
		
		
		p2.setBorrado(true);
		
		System.out.println(" Estado objeto p2: " + p2);
		
		Persona p3 = new Persona();
		p3.setApellido("Arevalo");
		p3.setNombre("Luis");
		p3.setBorrado(false);
		
		System.out.println(" Estado objeto p3: " + p3);
		System.out.println(" Luis Borrado: " + p3.isBorrado());
	}
	
	
	
	
	
	

}
