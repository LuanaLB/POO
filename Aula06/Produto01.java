package Aula06;

public class Produto01 {
    String descricao;
    double valor;

    public Produto01(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    String dados() {
        return "Descrição do produto: " + descricao +
                "\nValor: " + valor;
    }
}
