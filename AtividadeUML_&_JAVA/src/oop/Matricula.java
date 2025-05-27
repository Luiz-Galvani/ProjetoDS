package oop;

public class Matricula {
	private String dataMatric;
	private int numPrest;
	
	public Matricula() {
		
	}
	public Matricula(String dataMatric, int numPrest) {
		this.dataMatric = dataMatric;
		this.numPrest = numPrest;
		
	}
	
	public String getDataMatric() {
		return dataMatric;
	}
	public void setDataMatric(String dataMatric) {
		this.dataMatric = dataMatric;
	}
	public int getNumPrest() {
		return numPrest;
	}
	public void setNumPrest(int numPrest) {
		this.numPrest = numPrest;
	}
	
	
	
	
	
}
