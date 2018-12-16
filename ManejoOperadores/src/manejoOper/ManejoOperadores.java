package manejoOper;


public class ManejoOperadores {

	public static void main(String[] args) {
		
		
		System.out.println("Operadores Aritmeticos:");
		
		int a = 1+2;
		int b = a*4;
		int c = b/2;
		int d = c+a;
		int e = -d;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println("e= " + e);
		
		
		System.out.println("\nOperador Modulo Residuo:");
		System.out.println("x mod 10 = " +a %2);
		
		System.out.println("\nOperador Compuesto:");
		
		a +=2;
		b-=4;
		c*=a;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		
		
		System.out.println("\nOperador Incremento:");
		
		a++;
		
		System.out.println("a= " + a);
		
		c= ++a;
		
		d=b++;
		
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		
		
		System.out.println("\nOperador Relacional:");
		
		boolean res = a < b;
		
		System.out.println("res = "+ res);
		
		System.out.println("\nOperador Ternario:");
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		int min = (a < b) ? a : b;
		
		System.out.println("min = "+ min);
		
		System.out.println("\nOperador Asignacion:");
		
		int i , j , k;
		
		
		i=j=k=100;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		
		
		
		
	}

}
