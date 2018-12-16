package ejemploStatic;

public class EjemploEstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p1 =new Persona ("Juan");
		System.out.println("Persona1: "+ p1);
		
		Persona p2 =new Persona ("Karla");
		System.out.println("Persona2: "+ p2);
		
		Persona p3 =new Persona ("Maria");
		System.out.println("Persona3: "+ p3);
		
		Persona p4 =new Persona ("Pancho");
		System.out.println("Persona4: "+ p4);
		
		
		
		
		System.out.println("No de Personas: " + Persona.getContadorPersona());
	}

}
