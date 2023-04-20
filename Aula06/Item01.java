package Aula06;

public class Item01 {
    Produto01 produto01;
    double quantidade;

    public Item01(double quantidade, Produto01 produto01) {
        this.quantidade = quantidade;
        this.produto01 = produto01;
    }

    double total() {
        return quantidade * produto01.valor;
    }

    String dados() {
        return produto01.dados() +
                "\nQuantidade: " + quantidade +
                "\nTotal: " + total();
    }
}