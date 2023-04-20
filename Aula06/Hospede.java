package Aula06;

public class Hospede {
    String nome;
    String telefone;
    String cpf;
 
    public Hospede(String nome, String telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    String dados(){
        return "Nome do cliente: " + nome
        + "\nTelefone: " + telefone
        + "\nCPF: " + cpf;
    }
}
