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
        return valorFabrica = (imposto(3) + porcentagemDistribuidor(valorFabrica, valorFabrica));
    }

    String dadosAutomo() {
        return "Modelo: " + modelo +
                "\n" + "Valor fábrica: " + String.format("%.2f", valorFabrica) +
                "\n" + "Imposto: R$" + String.format("%.2f", imposto(3)) +
                "\nDistribuidor: R$" + String.format("%.2f", porcentagemDistribuidor(5, 3));
    }
    // 12 8
}