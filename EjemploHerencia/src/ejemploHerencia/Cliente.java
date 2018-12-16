package ejemploHerencia;

import java.util.Date;

public class Cliente extends Persona {
	
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes;
	
	
	public Cliente (Date fehaDate, boolean vip){
	
		this.idCliente= ++contadorClientes;
		this.fechaRegistro = fehaDate;
		this.vip = vip;
		
	}
	
	
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
	@Override
	public String toString(){
		return super.toString() + "Cliente [" +"IdCliente: " +idCliente +" fechaRegistro: " +fechaRegistro +" vip= " +vip +"]";
	}
	

}
