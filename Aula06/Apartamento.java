package Aula06;

public class Apartamento {
    int numero;
    double valorDiaria;
    TipoApartam tipoApartam;

    public Apartamento(int numero, double valorDiaria, TipoApartam tipoApartam) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.tipoApartam = tipoApartam;
    }

    /*
     * double valorDaDiaria(){
     * 
     * }
     */

    String dados() {
        return "\nNumero do Apart.: " + numero
                + "Valor diaria: " + valorDiaria
                + "Tipo do Apart.: " + tipoApartam;
    }
}