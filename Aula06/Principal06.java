package Aula06;

public class Principal06 {
    public static void main(String[] args) {
        /*
         * Apartamento ap1 = new Apartamento();
         * ap1.tipoApartam = TipoApartam.INDIVIDUAL;
         * System.out.printf(ap1.tipoApartam.descricao);
         */

        Apartamento apartam = new Apartamento(0, 0, null);
        Acompanhante acompanhante01 = new Acompanhante("Juliana", "555.888.777.111");

        Produto01 produto1 = new Produto01("Porção de camarão", 200.50);
        Produto01 produto2 = new Produto01("Suco de laranja", 12.75);
        System.out.println(produto1.dados() + "\n" + produto2.dados());
        System.out.println("-----------------------------");
        Item01 itens1 = new Item01(1, produto1);
        Item01 itens2 = new Item01(2, produto2);
        System.out.println(itens1.dados() + "\n" + itens2.dados());
    }
}
