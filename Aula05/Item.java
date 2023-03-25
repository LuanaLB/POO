package Aula05;

public class Item {
    Produto produto;
    double quantidade;

    public Item(double quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    double total(){
        return
    }

    String dados() {
        return produto.dados() +
                "\nQuantidade: " + quantidade;
    }
}
