import java.util.ArrayList;

public class Empresa {
    String razaoSocial;
    String cnpj;
    ArrayList<Departamento> departamentos = new ArrayList<>();

    Empresa(String razaoString, String cnpj) {
        this.razaoSocial = razaoString;
        this.cnpj = cnpj;
    }

    String dados() {
        return "\nRazão Social: " + razaoSocial
             + "\nCNPJ: " + cnpj +
               "\n" + departamentos();
    }

    String departamentos() {
        String listDepart="";
        for( Departamento d : departamentos) {
            listDepart += "\nDepartamentos: " + d.dados() + "\n";
        } 
        return listDepart;
    }
}
