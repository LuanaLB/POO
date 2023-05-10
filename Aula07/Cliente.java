public class Cliente {
    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String dadosCliente() {
        return "\n Nome do Cliente: " + getNome() +
                "\n CPF: " + getCpf();
    }
}