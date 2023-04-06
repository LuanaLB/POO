package Aula04;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa1 {
    String nome;
    LocalDate dataNascimento;

    public Pessoa1(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    LocalDate dataNascimento() {
        return dataNascimento;
    }

    int idade() {
        Period idade = dataNascimento.until(LocalDate.now());
        return idade.getYears();
    }

    String dados() {
        return "\nPessoa: " + nome
                + "\nData de nascimento: " + dataNascimento
                + "\nIdade: " + idade();
    }
}
