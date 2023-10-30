package br.com.principal;

public class Funcionario extends Pessoa {
	private double salario;
	private String cargo;
	private String departamento;

	public Funcionario(String nome, int idade, double salario, String cargo, String departamento) {
		super(); 
		setNome(nome);
		setIdade(idade);
		this.salario = salario;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionário: " + getNome() + ", Salário: " + salario + ", Cargo: " + cargo + ", Departamento: "
				+ departamento;
	}
}
