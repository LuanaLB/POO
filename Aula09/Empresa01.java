package Aula09;

import java.util.ArrayList;

public class Empresa01 {
    private String razaoSocial;
    private String cnpj;
    private ArrayList<Departamento01> departamentos01 = new ArrayList<>();

    Empresa01(String razaoString, String cnpj) {
        this.razaoSocial = razaoString;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Departamento01> getDepartamentos01() {
        return departamentos01;
    }

    public void setDepartamentos01(ArrayList<Departamento01> departamentos01) {
        this.departamentos01 = departamentos01;
    }

    String dados() {
        return "\nRazão Social: " + getRazaoSocial()
                + "\nCNPJ: " + getCnpj() +
                "\n" + departamentos();
    }

    String departamentos() {
        String listDepart = "";
        for (Departamento01 d : departamentos01) {
            listDepart += "\nDepartamentos: " + d.dados() + "\n";
        }
        return listDepart;
    }
}
