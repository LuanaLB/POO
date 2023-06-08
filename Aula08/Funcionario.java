package Aula08;

public class Funcionario {
    public String nome;
    public double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String dados() {
        return "\nNome do funcionario: " + nome
                + "\nSalario: " + salario;
    }

}
