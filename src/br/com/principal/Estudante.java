package br.com.principal;

public class Estudante extends Pessoa {
	private String curso;
	private String matricula;
	private int ano;

	public Estudante(String nome, int idade, String curso, String matricula, int ano) {
		super();
		setNome(nome);
		setIdade(idade);
		this.curso = curso;
		this.matricula = matricula;
		this.ano = ano;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Estudante: " + getNome() + ", Curso: " + curso + ", Matrícula: " + matricula + ", Ano: " + ano;
	}
}
