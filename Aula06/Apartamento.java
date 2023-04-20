package Aula06;

public class Apartamento {
    int numero;
    double valorDiaria;
    Enum tipoApartam;

    public Apartamento(int numero, double valorDiaria, Enum tipoApartam) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.tipoApartam = tipoApartam;
    }

    String dados() {
        return "";
    }
}
