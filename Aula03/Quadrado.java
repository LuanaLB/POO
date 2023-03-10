package Aula03;

public class Quadrado {
    double lado;
    double altura;

    public Quadrado(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    double area() {
        return lado * lado;
    }

    double perimetro() {
        return lado * 4;
    }
}
