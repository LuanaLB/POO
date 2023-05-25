package Aula08;

public class Gerente extends Funcionario {
    public double gratificacao;

    public Gerente(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    public double totalSalario() {
        return super.salario + gratificacao;
    }

    @Override
    String dados() {
        return super.dados() +
                "\nGratificacao gerente: " + gratificacao;

    }
}
