package modelo.entidades;

import java.io.Serializable;

public class Multa implements Serializable{
	
	private String Placa;
	private float Valor;
	private int Año;
	private String Descripcion;
	
	
	public Multa() {
	}

	public Multa(String placa, float valor, int año, String descripcion) {
		super();
		Placa = placa;
		Valor = valor;
		Año = año;
		Descripcion = descripcion;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Multa [Placa=" + Placa + ", Valor=" + Valor + ", Año=" + Año + ", Descripcion=" + Descripcion + "]";
	}
	
	
	

}
