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

    String dados() {
        return "\nNumero do Apartamento: " + numero
                + "     Valor diaria: " + valorDiaria
                + "     Tipo do Apart.: " + tipoApartam;
    }
}
