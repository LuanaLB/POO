package Aula04;

public class Principal4 {
    public static void main(String[] args) {

        Pessoa1 pessoa1 = new Pessoa1("Luana", 16 / 06 / 2000);
        Endereco endereco = new Endereco("Quadra Arse 122 Al:30", "Plano diretor sul", 77024508, "Perto do rodoshopp",
                pessoa1);
        Cidade cidade = new Cidade("Palmas", endereco);
        Estado estado = new Estado("Tocantins", "TO", cidade);

        System.out.println(estado.dados());
    }
}
