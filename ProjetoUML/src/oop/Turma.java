package oop;

public class Turma {
	private int numTurma;
	private String dataInicio;
	private int numVagas;
	
	
	
	public Turma() {
		
	}
	
	
	public Turma(int numTurma, String dataInicio,int numVagas) {
		this.numTurma = numTurma;
		this.dataInicio = dataInicio;
		this.numVagas = numVagas;
	}
	
	
	public int getNumTurma() {
		return numTurma;
	}
	public void setNumTurma(int numTurma) {
		this.numTurma = numTurma;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getNumVagas() {
		return numVagas;
	}
	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}
	
	
	
	

}
