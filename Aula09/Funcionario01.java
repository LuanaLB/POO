package Aula09;

public class Funcionario01 {
    private String nome;
    private double salario;

    Funcionario01(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    String dados() {
        return "\nNome do funcionario: " + getNome()
                + "\nSalario: " + getSalario();
    }

}