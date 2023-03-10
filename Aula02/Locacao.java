public class Locacao {
    int duracao;
    double valorHora;
    double valorDiaria;
    double valorImposto;
    double valorTotal;

    public Locacao(int duracao, double valorHora, double valorDiaria) {
        this.duracao = duracao;
        this.valorHora = valorHora;
        this.valorDiaria = valorDiaria;
        this.valorImposto = calcularImposto();
        this.valorTotal = calcularValorTotalLocacao();
    }

    public int getDuracao() {
        return duracao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularValorSemImposto() {
        if (duracao <= 12) {
            return duracao * valorHora;
        } else {
            int numDias = duracao / 24;
            int horasRestantes = duracao % 24;
            double valorTotalDiarias = numDias * valorDiaria;
            double valorRestante = horasRestantes * valorHora;
            return valorTotalDiarias + valorRestante;
        }
    }

    public double calcularImposto() {
        double valorSemImposto = calcularValorSemImposto();
        if (valorSemImposto <= 200) {
            return valorSemImposto * 0.2;
        } else {
            return valorSemImposto * 0.15;
        }
    }

    public double calcularValorTotalLocacao() {
        return calcularValorSemImposto() + valorImposto;
    }

    public String mostrarTela() {
        Locacao locacao1 = new Locacao(15, 12.0, 75.0);

        return ("----- Sistema Locadora veiculo -----"
                + "\n" + "Duração: " + locacao1.getDuracao() + " horas"
                + "\n" + "Valor por hora: R$" + locacao1.getValorHora()
                + "\n" + "Valor diária: R$" + locacao1.getValorDiaria()
                + "\n" + "Valor do imposto: R$" + locacao1.getValorImposto()
                + "\n" + "Valor total: R$" + locacao1.getValorTotal()
                + "\n"
                + "*************");
    }

}