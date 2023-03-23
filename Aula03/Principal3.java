package Aula03;

public class Principal3 {
    public static void main(String[] args) {

        /*
         * Quadrado quadrado = new Quadrado(6, 6);
         * Retangulo retangulo = new Retangulo(8, 8);
         * Circulo circulo = new Circulo(16);
         * 
         * System.out.println();
         */

        // automove
        double percentual = 3;
        double percentualDistribuidor = 5;

        Automovel automovel1 = new Automovel();
        automovel1.modelo = "Honda city";
        automovel1.valorFabrica = 132200;

        System.out.println(automovel1.dados(percentual, percentualDistribuidor));

    }
}
