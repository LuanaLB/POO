public class Estagiario extends Funcionario {
    public String curso;

    public Estagiario(String nome, double salario, String curso) {
        super(nome, salario);
        this.curso = curso;
    }

    String dados() {
        return super.dados()
                + "\nCurso: " + curso;
    }
}
