package Aula08;

import java.util.ArrayList;
import Aula08.Departamento;

public class Empresa {
    public String razaoSocial;
    public String cnpj;
    ArrayList<Departamento> departamentos = new ArrayList<>();

    public Empresa(String razaoString, String cnpj) {
        this.razaoSocial = razaoString;
        this.cnpj = cnpj;
    }

    String dados() {
        return "\nRazão Social: " + razaoSocial
                + "\nCNPJ: " + cnpj +
                "\n" + departamentos();
    }

    String departamentos() {
        return "\nDepartamentos: " + departamentos.toString();
    }
}
