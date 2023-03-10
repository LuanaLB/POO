public class Pessoa {
    String nome;
    double peso;
    double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String situacao() {
        double imc = calcularImc();

        if (imc < 18.5) {
            return "Você está abaixo do peso ideal.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Parabéns, você está em seu peso normal.";
        } else {
            return "Você está acima de seu peso (sobrepeso)";
        }

    }

}/*
  * Implementar uma classe Pessoa, com atributos (nome, peso e
  * altura). Nesta classe, você deverá implementar métodos para:
  * 
  * a) retornar o IMC – Índice de massa corporal.
  * b) retornar a situação considerando o resultado do IMC.
  * abaixo de 18,5 → imprimir “Você está abaixo do peso ideal.”
  * entre 18,5 e 24,9 → imprimir “Parabéns, você está em seu
  * peso normal.”
  * acima de 24,9 → imprimir “Você está acima de seu peso
  * (sobrepeso).”
  * Por fim, crie uma classe Principal, crie objetos, faça a chamada
  * de métodos e apresente os dados
  */