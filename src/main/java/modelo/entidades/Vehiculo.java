package modelo.entidades;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private String Placa;
	private String Marca;
	private int A�o;
	private String Modelo;
	private String Chasis;
	private String Propietario;
	
	
	public Vehiculo() {
	}
	
	

	public Vehiculo(String placa, String marca, int a�o, String modelo, String chasis, String propietario) {
		super();
		Placa = placa;
		Marca = marca;
		A�o = a�o;
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


	public int getA�o() {
		return A�o;
	}


	public void setA�o(int a�o) {
		A�o = a�o;
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
		return "Vehiculo [Placa=" + Placa + ", Marca=" + Marca + ", A�o=" + A�o + ", Modelo=" + Modelo + ", Chasis="
				+ Chasis + ", Propietario=" + Propietario + "]";
	}
	
	
	
	
}