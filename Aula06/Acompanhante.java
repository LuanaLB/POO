package Aula06;

public class Acompanhante {
    String nomeAcom;
    String cpfAcom;

    public Acompanhante(String nomeAcom, String cpfAcom) {
        this.nomeAcom = nomeAcom;
        this.cpfAcom = cpfAcom;
    }

    String dadosAcomp() {
        return "\nNome do Acompanhante: " + nomeAcom
                + " CPF: " + cpfAcom;
    }
}
