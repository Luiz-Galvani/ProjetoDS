package oop;

public class Aluno extends Avaliacao {
	private String nomeAluno;
	private String cpf;
	private String dataNascimento;
	private String dataMatric;
	private int numPrest;
	public Avaliacao prova;
	private int fkAvaliacao;
	
	public Aluno() {
		
	}
	public Aluno(String nomeAluno, String cpf, String dataNascimento, String dataMatric, int numPrest) {
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nomeAluno = nomeAluno;
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
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double resultado(int id) {
		double notaTotal = 0;
		foreach(Object i : prova){
			if(id == fkAvaliacao)
				notaTotal += fkAvaliacao.nota;
		}
		return notaTotal;
	}
}
