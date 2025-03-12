package mesquita.model;

public class Exercicio {
	private String nome;
	private int quantidadeRepeticoes;
	private double carga;
	
	
	public Exercicio(String nome, int quantidadeRepeticoes, double carga) {
		this.nome = nome;
		this.quantidadeRepeticoes = quantidadeRepeticoes;
		this.carga = carga;
	}
	
	public Exercicio(String nome) {
		this.nome = nome;
		this.quantidadeRepeticoes = 0;
		this.carga = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeRepeticoes() {
		return quantidadeRepeticoes;
	}

	public void setQuantidadeRepeticoes(int quantidadeRepeticoes) {
		this.quantidadeRepeticoes = quantidadeRepeticoes;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Exercicio{" +
				"nome='" + nome + '\'' +
				", quantidadeRepeticoes=" + quantidadeRepeticoes +
				", carga=" + carga +
				'}';
	}
}
