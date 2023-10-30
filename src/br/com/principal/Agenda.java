package br.com.principal;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> contatos = new ArrayList<>();

	public void adicionarContato(Pessoa pessoa) {
		contatos.add(pessoa);
	}

	public void buscarPorDepartamento(String departamento) {
		for (Pessoa contato : contatos) {
			if (contato instanceof Funcionario) {
				Funcionario funcionario = (Funcionario) contato;
				if (funcionario.getDepartamento().equals(departamento)) {
					System.out.println(funcionario);
				}
			}
		}
	}

	public double calcularSalarioMedio() {
		double totalSalario = 0;
		int numFuncionarios = 0;
		for (Pessoa contato : contatos) {
			if (contato instanceof Funcionario) {
				Funcionario funcionario = (Funcionario) contato;
				totalSalario += funcionario.getSalario();
				numFuncionarios++;
			}
		}
		if (numFuncionarios > 0) {
			return totalSalario / numFuncionarios;
		} else {
			return 0;
		}
	}

}
