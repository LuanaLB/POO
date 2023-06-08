package Aula09;

public class Principal09 {
    public static void main(String[] args) {

        Funcionario01 funcionario1 = new Funcionario01("Paulo", 1500);
        Funcionario01 funcionario2 = new Funcionario01("Maria", 1500);

        Estagiario01 estagiario1 = new Estagiario01("Juliana", 800, "Nutrição");
        Estagiario01 estagiario2 = new Estagiario01("Luana", 500, "TI");

        Gerente01 gerente1 = new Gerente01("Cláudio", 6000, 500);
        Gerente01 gerente2 = new Gerente01("Jorge", 6000, 450);

        Departamento01 departamento2 = new Departamento01("Administrativo", "5544-6688", gerente2);
        Departamento01 departamento1 = new Departamento01("Administrativo", "5544-6688", gerente1);

        departamento1.getFuncionarios().add(funcionario1);
        departamento1.getFuncionarios().add(funcionario2);
        departamento2.getFuncionarios().add(estagiario1);
        departamento2.getFuncionarios().add(estagiario2);

        Empresa01 empresa = new Empresa01("TI.Tecnologia", "221133");
        empresa.getDepartamentos01().add(departamento1);

        System.out.println(empresa.departamentos());

    }
}
