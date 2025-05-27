package oop;

public class mainEscola {
	public static void main(String[] args)
	{
		Aluno a1 = new Aluno();
		
		if(a1.resultado(2) < 7.0) {
			System.out.println("Aluno não passou");
		}
	}
}
