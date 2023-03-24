package Aula04;

public class Estado {
    Cidade cidade;
    String nomeEstado;
    String sigla;

    public Estado(String nomeEstado, String sigla, Cidade cidade) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
        this.cidade = cidade;
    }

    String dados() {
        return cidade.dados() + "\nEstado: " + nomeEstado +
                "\nSigla: " + sigla;
    }
}
