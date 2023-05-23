package Aula08;

public abstract class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String dados() {
        return "\nNome do funcionario: " + nome
                + " Salario: " + salario;
    }
}
