package br.com.principal;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(30);
        
        Funcionario funcionario1 = new Funcionario("Maria", 35, 50000, "Gerente", "TI");
        
        Estudante estudante1 = new Estudante("Carlos", 20, "Engenharia", "12345", 2);
        
        agenda.adicionarContato(pessoa1);
        agenda.adicionarContato(funcionario1);
        agenda.adicionarContato(estudante1);
        
        for (Pessoa contato : agenda.getContatos()) {
            System.out.println(contato);
        }
        
        agenda.buscarPorDepartamento("TI");
        
        double salarioMedio = agenda.calcularSalarioMedio();
        System.out.println("Salário Médio dos Funcionários: " + salarioMedio);
    }
}
