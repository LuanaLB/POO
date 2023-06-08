package Aula08;

public class Gerente extends Funcionario {
    double gratificacao;

    Gerente(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    double totalSalario() {
        return super.salario + gratificacao;
    }

    String dados() {
        return super.dados() +
                "\nGratificacao gerente: " + gratificacao;

    }
}
