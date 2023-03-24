package Aula04;

public class Cidade {
    Endereco endereco;
    String nomeCidade;

    public Cidade(String nomeCidade, Endereco endereco) {
        this.nomeCidade = nomeCidade;
        this.endereco = endereco;
    }

    String dados() {
        return endereco.dados() + "\nCidade: " + nomeCidade;
    }
}
