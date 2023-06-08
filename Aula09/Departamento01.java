package Aula09;

import java.util.ArrayList;

public class Departamento01 {
    private String nome;
    private String telefone;
    private Gerente01 gerente01;
    private ArrayList<Funcionario01> funcionarios = new ArrayList<>();

    Departamento01(String nome, String telefone, Gerente01 gerente01) {
        this.nome = nome;
        this.telefone = telefone;
        this.gerente01 = gerente01;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Gerente01 getGerente01() {
        return gerente01;
    }

    public void setGerente01(Gerente01 gerente01) {
        this.gerente01 = gerente01;
    }

    public ArrayList<Funcionario01> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario01> funcionarios) {
        this.funcionarios = funcionarios;
    }

    // laço de repetição para imprimir a lista de funcionarios(incluindo
    // funcionarios, gerentes, estagiarios)
    String funcionarios() {
        String listFunc = "";
        for (Funcionario01 f : funcionarios) {
            listFunc += "\nFuncionarios: " + f.dados() + "\n";
        }
        return listFunc;
    }

    String dados() {
        return "\nNome do departamento: " + getNome()
                + "\nTefone: " + getTelefone();
    }
}
