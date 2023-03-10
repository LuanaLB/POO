package Aula03;

public class Automovel {
    String modelo;
    double valorFabrica;

    public Automovel(String modelo, double valorFabrica) {
        this.modelo = modelo;
        this.valorFabrica = valorFabrica;
    }

    double imposto(double porcentual) {
        if (porcentual >= 12) {
            return this.valorFabrica * 0.12;
        } else {
            return this.valorFabrica * 0.15;
        }
    }

    /*
     * double porcentagemDistribuidor(double percentual){
     * 
     * }
     */

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome :" + this.modelo;
    }

}