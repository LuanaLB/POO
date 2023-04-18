public class Emprestimo {
    Cliente cliente;
    double valorEmprestimo;
    double taxaJuros;
    int numParcelas;

    public Emprestimo(Cliente cliente, double valorEmprestimo, double taxaJuros, int numParcelas) {
        this.cliente = cliente;
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
        this.numParcelas = numParcelas;
    }

    public void aprovaçao() {
        if (valorEmprestimo > cliente.salarioCliente * 0.30) {
            System.out.println("Emprestimo negado");
            System.exit(0);
        } else
            System.out.println("Emprestimo aceito");

    }

    double valorParcelas() {
        double valorParcelas = valorTotal() / numParcelas;
        return valorParcelas;

    }

    String imprimirParcelas() {
        String texto = "";
        for (int i = 0; i < numParcelas; i++) {
            texto += (i + 1) + " parcela: R$" + valorParcelas() + "\n";
        }
        return texto;
    }

    double valorTotal() {
        double valorTotal = valorEmprestimo / numParcelas;
        double valorSomado = 0;
        for (int i = 0; i < numParcelas; i++) {
            valorTotal += valorTotal * (taxaJuros / 100);
            valorSomado += valorTotal;
        }

        valorSomado += valorEmprestimo;
        return valorSomado;
    }

    public void mostrarEmTela() {
        Cliente cliente = new Cliente("Juliana", 20000.00);
        Emprestimo emprestimo = new Emprestimo(cliente, 1000.00, 10, 10);

        emprestimo.aprovaçao();
        emprestimo.valorParcelas();
        System.out.println("Valor total já pago: %.2f " + emprestimo.valorTotal() + "\n" + imprimirParcelas());
    }

}