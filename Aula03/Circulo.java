package Aula03;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double area() {
        return Math.PI * (raio * raio);
    }

    double perimetro() {
        return 2 * Math.PI * raio;
    }

    String dados() {
        return "Area do circulo: " + area() +
                "\n" + "Perimetro do circulo: " + perimetro() +
                "\n*******************************";
    }

}
