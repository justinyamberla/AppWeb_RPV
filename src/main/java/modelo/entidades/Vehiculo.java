package modelo.entidades;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private String Placa;
	private String Marca;
	private int Año;
	private String Modelo;
	private String Chasis;
	private String Propietario;
	
	
	public Vehiculo() {
	}
	
	

	public Vehiculo(String placa, String marca, int año, String modelo, String chasis, String propietario) {
		super();
		Placa = placa;
		Marca = marca;
		Año = año;
		Modelo = modelo;
		Chasis = chasis;
		Propietario = propietario;
	}



	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public int getAño() {
		return Año;
	}


	public void setAño(int año) {
		Año = año;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getChasis() {
		return Chasis;
	}


	public void setChasis(String chasis) {
		Chasis = chasis;
	}


	public String getPropietario() {
		return Propietario;
	}


	public void setPropietario(String propietario) {
		Propietario = propietario;
	}


	@Override
	public String toString() {
		return "Vehiculo [Placa=" + Placa + ", Marca=" + Marca + ", Año=" + Año + ", Modelo=" + Modelo + ", Chasis="
				+ Chasis + ", Propietario=" + Propietario + "]";
	}
	
	
	
	
}