package Aula06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal06 {
    public static void main(String[] args) {

        System.out.println("-------------******-------------");
        Hospede hospede = new Hospede("Luana", "(63) 98433-6075", "000.111.222.33");
        System.out.println(hospede.dados());

        System.out.println("-------------******-------------");
        Acompanhante acompanhante01 = new Acompanhante("Juliana", "555.888.777.00");
        Acompanhante acompanhante02 = new Acompanhante("Bianca", "444.999.888.11");
        System.out.println(acompanhante01.dadosAcomp());

        System.out.println("-------------******-------------");
        Apartamento apartam = new Apartamento(011, 289.90, TipoApartam.TRIPLO);
        System.out.println(apartam.dados());

        System.out.println("-------------******-------------");
        Produto01 produto1 = new Produto01("Porção de camarão", 200.50);
        Produto01 produto2 = new Produto01("Suco de laranja", 12.75);
        System.out.println(produto1.dados() + "\n" + produto2.dados());

        System.out.println("-------------******-------------");
        Item01 itens1 = new Item01(1, produto1);
        Item01 itens2 = new Item01(2, produto2);
        System.out.println(itens1.dados() + "\n" + itens2.dados());

        System.out.println("-------------******-------------");
        Hospedagem hospedagem = new Hospedagem(hospede, apartam);
        hospedagem.dataCheckout(
                LocalDateTime.parse("2023-8-22 07:52:09", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        hospedagem.acompanhantes.add(0, acompanhante01);
        hospedagem.itens.add(0, itens1);
        hospedagem.itens.add(0, itens2);
        hospedagem.acompanhantes.add(0, acompanhante02);
        System.out.println(hospedagem.dados());

    }
}
