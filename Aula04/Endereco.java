package Aula04;

public class Endereco {
    String logradouro;
    String bairro;
    int cep;
    String complemento;

    String dados() {
        return "\nLogradouro: " + logradouro +
                "\nBairro: " + bairro +
                "\nCEP: " + cep +
                "\nComplemento: " + complemento;
    }
}
