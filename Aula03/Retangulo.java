package Aula03;

public class Retangulo {
    double lado;
    double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    double area() {
        return lado * altura;
    }

    double perimetro() {
        return (altura * 2) + (lado * 2);
    }
}