package Aula04;

public class Endereco {
    Pessoa1 pessoa1;
    String logradouro;
    String bairro;
    int cep;
    String complemento;

    public Endereco(String logradouro, String bairro, int cep, String complemento, Pessoa1 pessoa1) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.pessoa1 = pessoa1;
    }

    String dados() {
        return pessoa1.dados() + "\nLogradouro: " + logradouro +
                "\nBairro: " + bairro +
                "\nCEP: " + cep +
                "\nComplemento: " + complemento;
    }
}
