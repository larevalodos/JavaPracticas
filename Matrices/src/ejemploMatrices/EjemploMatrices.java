package ejemploMatrices;
import ejemploMatrices.Persona;


public class EjemploMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edades [][]; 
		
		edades = new int [3] [2] ;
		
		
		edades [0] [0] =30;
		edades [0] [1] =15;
		edades [1] [0] =20;
		edades [1] [1] =45;
		edades [2] [0] =5;
		edades [2] [1] =38;

		
		System.out.println("Matriz de enteros indice 00 : "+ 	edades [0] [0]);
		System.out.println("Matriz de enteros indice 01 : "+ 	edades [0] [1]);
		System.out.println("Matriz de enteros indice 10 : "+ 	edades [1] [0]);
		System.out.println("Matriz de enteros indice 11 : "+ 	edades [1] [1]);
		System.out.println("Matriz de enteros indice 20 : "+ 	edades [2] [0]);
		System.out.println("Matriz de enteros indice 21 : "+ 	edades [2] [1]);
		
		
		Persona personas[] [];
		personas = new Persona[3][2];
		
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Miguel");
		personas[1][0] = new Persona("Luis");
		personas[1][1] = new Persona("Pepe");
		personas[2][1] = new Persona("Karla");
		personas[2][0] = new Persona("Felipe");

	
		System.out.println("");
		
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {

				System.out.println("Matriz de personas indice " + i + j + " : " + personas[i][j]);

			}
		}

		
		String nombres[] [] = {{"Sara","Samuel","Santos","Lucho"},{"Camila","Sarai","Manuel","Pancho"}};

		System.out.println("");
		
		System.out.println("Largo  de Reglones  " + nombres.length);
		System.out.println("Largo  de Columnas  " + nombres[1].length);
		
		System.out.println("");
		
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0; j < nombres[i].length; j++) {

				System.out.println("Matriz de nombres indice " + i + j + " : " + nombres[i][j]);

			}
		}


		
		
		
	}

}
