package Aula05;

public class Principal5 {
    public static void main(String[] args) {

        Produto produto = new Produto("Arroz", 18.89);
        Item itens = new Item(4, produto);
        Venda venda = new Venda(null, itens);

        System.out.println(venda.dados());
    }
}
