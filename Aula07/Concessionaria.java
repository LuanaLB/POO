import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome, endereco;

    public Concessionaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String dadosConcessionaria() {
        return "\n Nome da concessionária: " + nome +
                "\n Endereço: " + endereco;
    }
}
