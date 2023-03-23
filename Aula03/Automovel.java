package Aula03;

public class Automovel {
    String modelo;
    double valorFabrica;

    public Automovel(String modelo, double valorFabrica) {
        this.modelo = modelo;
        this.valorFabrica = valorFabrica;
    }

    double imposto(double porcentual) {
        return valorFabrica * (porcentual / 100);
    }

    double porcentagemDistribuidor(double percentualDistribuidor, double percentual) {
        return (valorFabrica + imposto(percentual)) * (percentualDistribuidor / 100);
    }

    double valorVeiculo() {
        return this.valorFabrica = imposto(12) + porcentagemDistribuidor(8);
    }

    String dados() {
        return "Modelo: " + modelo +
                "\n" + "Valor fábrica: " + String.format("%.2f", valorFabrica) +
                "\n" + "Imposto: R$" + String.format("%.2f", imposto(percentual)) +
                "\nDistribuidor: R$"
                + String.format("%.2f", porcentagemDistribuidor(percentualDistribuidor, percentual));
    }

}