public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public String dadosVeiculo() {
        return "\n Modelo do veículo: " + modelo +
                "\n Preço: " + preco;
    }
}
