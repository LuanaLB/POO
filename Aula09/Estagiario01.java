package Aula09;

public class Estagiario01 extends Funcionario01 {
    private String curso;

    public Estagiario01(String nome, double salario, String curso) {
        super(nome, salario);
        this.curso = curso;
    }

    String dados() {
        return super.dados()
                + "\nCurso: " + getCurso();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
