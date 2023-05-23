package Aula08;

public class Gerente extends Funcionario {
    public double gratificacao;

    public Gerente(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    @Override
    String dados() {
        return "\nGerente com gratificacao de: " + gratificacao;
    }
}
