package Aula08;

import Empresa.Imprimir;

public class Principal08 {
    public static void main(String[] args) {

        Estagiario estagiario01 = new Estagiario("Juliana", 800, "Nutrição");
        Estagiario estagiario02 = new Estagiario("Luana", 500, "TI");

        Gerente gerente = new Gerente("Cláudio", 6000, 500);

        Departamento departamento01 = new Departamento("Administrativo", "5544-6688", gerente);
        departamento01.funcionarios.add(gerente);
        departamento01.funcionarios.add(estagiario01);

        Departamento departamento02 = new Departamento("Administrativo", "5544-6688", gerente);
        departamento01.funcionarios.add(estagiario02);

        Empresa empresa = new Empresa("TI.Tecnologia", "221133");
        empresa.departamentos.add(departamento01);
        System.out.println(empresa.dados());
        // (empresa.departamentos());

    }
}
