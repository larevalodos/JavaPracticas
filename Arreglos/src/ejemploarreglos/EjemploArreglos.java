package ejemploarreglos;
import ejemploarreglos.Persona;


public class EjemploArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edades[];

		edades = new int [3];
		
		edades[0] =30;
		edades[1] =15;
		edades[2] =20;

		
		System.out.println("Arreglo enteros indice 0: " +edades[0]);
		System.out.println("Arreglo enteros indice 1: " +edades[1]);
		System.out.println("Arreglo enteros indice 2: " +edades[2]);
		
		
		
		Persona personas[];
		personas = new Persona[4];
		
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Karla");
		personas[2] = new Persona("Luis");
	
		System.out.println("");
		
		System.out.println("Arreglo personas indice 0: " +personas[0]);
		System.out.println("Arreglo personas indice 1: " +personas[1]);
		System.out.println("Arreglo personas indice 2: " +personas[2]);
		
		String nombres [] = {"Sara","Samuel","Santos","Lucho"} ;
		
		System.out.println("");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Arreglo String indice" + i + ": " + nombres[i]);
			
		}
		
		
	}

}
