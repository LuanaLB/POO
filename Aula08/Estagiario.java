package Aula08;

public class Estagiario extends Funcionario {
    public String curso;

    public Estagiario(String nome, double salario, String curso) {
        super(nome, salario);
        this.curso = curso;
    }

    @Override
    String dados() {
        return "\nCurso: " + curso
                + super.dados();
    }
}
