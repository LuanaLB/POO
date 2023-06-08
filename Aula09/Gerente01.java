package Aula09;

public class Gerente01 extends Funcionario01 {
    private double gratificacao;

    Gerente01(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    double totalSalario() {
        return super.getSalario() + gratificacao;
    }

    String dados() {
        return super.dados() +
                "\nGratificacao gerente: " + getGratificacao();

    }
}
