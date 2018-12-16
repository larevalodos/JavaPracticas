package ejemploHerencia;

import java.util.Date;

public class EjemploHerencia {

	public static void main (String[] args){
	
		Empleado e1 = new Empleado("Juan",1000); 
		System.out.println("\nImprimimos Empleado 1");
		System.out.println(e1);
		
		Empleado e2 = new Empleado("Pedro",1500); 
		e2.setEdad(28);
		e2.setgenero('M');
		e2.setDireccion("Caracas,Ve");
		System.out.println("\nImprimimos Empleado 2");
		System.out.println(e2);
		
		
		Cliente c1 = new Cliente(new Date(), false);
		System.out.println("\nImprimimos Cliente 1");
		System.out.println(c1);
		
		c1.setNombre("Karla");
		c1.setEdad(18);
		c1.setgenero('F');
		c1.setDireccion("Santiago, CL");
		System.out.println("\nImprimimos Cliente 1");
		System.out.println(c1);












	}
}
