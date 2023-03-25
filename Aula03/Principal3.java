package Aula03;

public class Principal3 {
    public static void main(String[] args) {

        // Quadrado, Retangulo e Circulo
        Quadrado quadrado = new Quadrado(6, 6);
        Retangulo retangulo = new Retangulo(8, 8);
        Circulo circulo = new Circulo(16);

        System.out.println(quadrado.dados() +
                "\n" + retangulo.dados() +
                "\n" + circulo.dados() +
                "\n ----------------------------------------------");

        // Automovel
        double percentual = 3;
        double percentualDistribuidor = 5;

        Automovel automovel01 = new Automovel("Honda city", 132200);
        System.out.println(automovel01.dadosAutomo());

    }
}
