package Aula04;

public class Pessoa {
    String nome;
    int dataNascimento;

    public Pessoa(String nome, int dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // int idade(){}

    String dados() {
        return "\nPessoa: " + nome +
                "\nAniversário: " + dataNascimento;
    }
}
