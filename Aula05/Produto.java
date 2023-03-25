package Aula05;

public class Produto {
    String descricao;
    double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    String dados() {
        return "Descrição do produto: " + descricao +
                "\nValor: " + valor;
    }
}
