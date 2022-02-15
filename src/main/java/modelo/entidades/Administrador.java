package modelo.entidades;

import java.io.Serializable;

public class Administrador implements Serializable{
	
	private int idAdministrador;
	private String usuario;
	private String clave;
	
	
	public Administrador() {
	}
	
	
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}


	@Override
	public String toString() {
		return "idAdministrador:" + this.idAdministrador + " usuario:" + this.usuario + " clave:" + this.clave;
	}
	
	
	
}

