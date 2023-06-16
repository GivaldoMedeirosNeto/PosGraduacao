package testes;

import java.util.ArrayList;
import java.util.List;

import aluno.Aluno;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno(1, "Penelope", "Analista de Sacolas"));
		alunos.add(new Aluno(2, "Penelope", "Inspetora de Atividades"));
		alunos.add(new Aluno(3, "Penelope", "Inspetora de Caixas"));
		alunos.add(new Aluno(4, "Penelope", "Inspetora de Comida"));
		alunos.add(new Aluno(5, "Penelope", "Analista de Gravidade"));
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
