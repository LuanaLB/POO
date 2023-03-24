package Aula04;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa1 {
    String nome;
    int dataNascimento;

    public Pessoa1(String nome, int dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    int idade() {
        Period idade = dataNascimento.until(LocalDate.now());
        return idade.getYears();
    }

    String dados() {
        return "\nPessoa: " + nome +
                "\nAniversário: " + dataNascimento;
    }
}
