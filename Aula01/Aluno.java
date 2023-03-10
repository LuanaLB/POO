public class Aluno {
    String nome;
    double notaB1;
    double notaB2;

    public Aluno(String nome, double notaB1, double notaB2) {
        this.nome = nome;
        this.notaB1 = notaB1;
        this.notaB2 = notaB2;
    }

    public double calcularMedia() {
        return (notaB1 + notaB2) / 2;
    }

    public String retornarDados() {
        return "Nome: " + nome + ", Nota B1: " + notaB1 + ", Nota B2: " + notaB2;
    }

    public String retornarSituacao() {
        double media = calcularMedia();
        if (media < 6.0) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}
