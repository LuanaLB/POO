package Aula06;

public class Principal06 {
    public static void main(String[] args) {

        Hospede hospede = new Hospede("Luana", "(63) 98433-6075", "000.111.222.33");
        System.out.println(hospede.dados());

        Acompanhante acompanhante01 = new Acompanhante("Juliana", "555.888.777.00");
        Acompanhante acompanhante02 = new Acompanhante("Carlos", "333.111.666.11");
        Acompanhante acompanhante03 = new Acompanhante("Bianca", "222.444.555.22");
        System.out.println(acompanhante01.dadosAcomp() + acompanhante02.dadosAcomp() + acompanhante03.dadosAcomp());

        Apartamento apartam = new Apartamento(011, 289.90, TipoApartam.TRIPLO);
        System.out.println(apartam.dados());

        Produto01 produto1 = new Produto01("Porção de camarão", 200.50);
        Produto01 produto2 = new Produto01("Suco de laranja", 12.75);
        System.out.println(produto1.dados() + "\n" + produto2.dados());
        System.out.println("-----------------------------");
        Item01 itens1 = new Item01(1, produto1);
        Item01 itens2 = new Item01(2, produto2);
        System.out.println(itens1.dados() + "\n" + itens2.dados());

    }
}
