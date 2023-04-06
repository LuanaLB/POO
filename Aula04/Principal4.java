package Aula04;

import java.time.LocalDate;

public class Principal4 {
    public static void main(String[] args) {

        System.out.println("***** Dados da Pessoa *****");
        Pessoa1 pessoa1 = new Pessoa1("Luana", LocalDate.of(2000, 06, 16));
        Endereco endereco = new Endereco("Quadra Arse 122 Al 30", "Plano diretor sul", 77024508, "Perto do rodoshopp",
                pessoa1);
        Cidade cidade = new Cidade("Palmas", endereco);
        Estado estado = new Estado("Tocantins", "TO", cidade);

        System.out.println(estado.dados());
    }
}
