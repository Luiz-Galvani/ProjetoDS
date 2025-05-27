package oop;

public class Avaliacao {
	private String data;
	private double nota;
	
	
	public Avaliacao() {
		
	}
	public Avaliacao(String data, double nota) {
		this.data = data;
		this.nota = nota;
		
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}	
}
