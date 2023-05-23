package Aula08;

public class Departamento {
    public String nome;
    public String telefone;

    public Departamento(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    String dados() {
        return "\nNome do departamento: " + nome
                + "\nTefone: " + telefone;
    }
}
