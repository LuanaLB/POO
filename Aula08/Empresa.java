package Aula08;

public class Empresa {
    public String razaoSocial;
    public String cnpj;

    public Empresa(String razaoString, String cnpj) {
        this.razaoSocial = razaoString;
        this.cnpj = cnpj;
    }

    String dados() {
        return "\nRazão Social: " + razaoSocial
                + "\nCNPJ: " + cnpj;
    }
}
