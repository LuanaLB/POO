package Aula05;

import java.time.LocalDateTime;

public class Principal5 {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 18.89);
        Produto produto2 = new Produto("Oléo", 8.49);
        System.out.println(produto1.dados() + "\n" + produto2.dados());
        System.out.println("-----------------------------");
        Item itens1 = new Item(4, produto1);
        Item itens2 = new Item(4, produto2);
        System.out.println(itens1.dados() + "\n" + itens2.dados());

        Venda venda = new Venda(LocalDateTime.now());
        venda.itens.add(itens1);
        venda.itens.add(itens2);
        System.out.println("-----------------------------");

        System.out.println(venda.dados());
    }
}
