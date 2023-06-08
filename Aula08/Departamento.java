package Aula08;

import java.util.ArrayList;

public class Departamento {
    String nome;
    String telefone;
    Gerente gerente;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    Departamento(String nome, String telefone, Gerente gerente) {
        this.nome = nome;
        this.telefone = telefone;
        this.gerente = gerente;
    }

    // laço de repetição para imprimir a lista de funcionarios(incluindo
    // funcionarios, gerentes, estagiarios)
    String funcionarios() {
        String listFunc = "";
        for (Funcionario f : funcionarios) {
            listFunc += "\nFuncionarios: " + f.dados() + "\n";
        }
        return listFunc;
    }

    String dados() {
        return "\nNome do departamento: " + nome
                + "\nTefone: " + telefone;
    }
}
