package com.gm.ventas;

public class Orden {

	private final int idOrden;
	private final Producto productos;
	private int contadorProductos;
	private static int contadorOrdenes;
	private static final int maxProductos = 10;
	
	public Orden () {
		this.idOrden=++contadorOrdenes;
		productos= new Producto(maxProductos);
		
	}
	
	public void agregarProducto(Producto producto) {
		
		if (contadorProductos< maxProductos) {
			
			productos[contadorProductos++] = producto;
			
		}else {
			System.out.println("Se ha superado el max de productos : " + maxProductos);
		}
		
		
		
	}
	
	private double calcularTotal() {
		double total = 0;
		for (int i = 0; i < contadorProductos.length; i++) {
			total += productos[i].getPrecio();
			
		}
		
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: " + idOrden);
		System.out.println("Total de Orden #: " + idOrden + ": $ "+ calcularTotal() + " - ");
		System.out.println("Productos de Orden #: " + idOrden + ": ");
		
		for (int i = 0; i < contadorProductos.length; i++) {
			
			System.out.println(productos[i]);
		}
		
	}
	
	
	
}
