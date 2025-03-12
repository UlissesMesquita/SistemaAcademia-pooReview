package mesquita.model;

import java.util.ArrayList;

public class Ficha {
	private Aluno aluno;
	private Aluno numeroMatricula;
	private Personal personal;
	private ArrayList<Exercicio> exercicios;
	private char sexo;
	private String dataFim;


	public Ficha(Aluno aluno, ArrayList<Exercicio> exercicios, char sexo, Personal personal) {
		this.aluno = aluno;
		this.personal = personal;
		this.exercicios = new ArrayList<>();
		this.sexo = sexo;
	}

	public Ficha(Aluno aluno ,char sexo){
		this.aluno = aluno;
		this.personal = new Personal();
		this.exercicios = new ArrayList<>();
		this.sexo = sexo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Aluno numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(ArrayList<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Ficha{" +
				"aluno=" + aluno +
				", numeroMatricula=" + numeroMatricula +
				", exercicios=" + exercicios +
				", sexo=" + sexo +
				'}';
	}

	public void adicionarExercicios(Exercicio exercicio){
		return exercicios.add(exercicio);
	}

	public void removerExercicios(Exercicio exercicio){
		return exercicios.remove(exercicio);
	}

}
