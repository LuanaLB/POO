import java.time.LocalDateTime;

public class Venda {
    private LocalDateTime data;
    private Veiculo veiculo;
    private Concessionaria concessionaria;
    private Cliente cliente;

    public boolean verificarEstoque() {
        if (veiculos.modelo == veiculos.modelo) {
            return true;
        } else
            return false;
    }

    public void venda() {
        verificarEstoque();
        double valorTotal = veiculos.preco;
    }

    public String dadosVenda() {
        return "\n Dados da concessionária: \n" +
                concessionaria.dadosConcessionaria() +
                "\n Dados do veículo: \n" +
                veiculo.dadosVeiculo() +
                "\n Dados do cliente: \n" +
                cliente.dadosCliente();
    }
}
