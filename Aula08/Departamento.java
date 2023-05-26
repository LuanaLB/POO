package Aula08;

import java.util.ArrayList;

public class Departamento {
    public String nome;
    public String telefone;
    Gerente gerente;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome, String telefone, Gerente gerente) {
        this.nome = nome;
        this.telefone = telefone;
        this.gerente = gerente;
    }

    String Funcionarios() {
        return "\nTodos os funcionarios da empresa: " + funcionarios;
    }

    String dados() {
        return "\nNome do departamento: " + nome
                + "\nTefone: " + telefone;
    }
}
