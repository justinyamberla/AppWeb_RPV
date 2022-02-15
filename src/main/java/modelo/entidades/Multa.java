package modelo.entidades;

import java.io.Serializable;

public class Multa implements Serializable{
	
	private String Placa;
	private float Valor;
	private int A�o;
	private String Descripcion;
	
	
	public Multa() {
	}

	public Multa(String placa, float valor, int a�o, String descripcion) {
		super();
		Placa = placa;
		Valor = valor;
		A�o = a�o;
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

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Multa [Placa=" + Placa + ", Valor=" + Valor + ", A�o=" + A�o + ", Descripcion=" + Descripcion + "]";
	}
	
	
	

}
