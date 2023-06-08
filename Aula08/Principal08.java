package Aula08;

public class Principal08 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Cláudio", 6000, 500);
        Gerente gerente2 = new Gerente("Jorge", 6000, 450);

        Departamento departamento2 = new Departamento("Administrativo", "5544-6688", gerente2);
        Departamento departamento1 = new Departamento("Administrativo", "5544-6688", gerente1);

        Funcionario Funcionario1 = new Funcionario("Paulo", 1500);
        Funcionario Funcionario2 = new Funcionario("Maria", 1500);

        Estagiario estagiario1 = new Estagiario("Juliana", 800, "Nutrição");
        Estagiario estagiario2 = new Estagiario("Luana", 500, "TI");

        // departamento01.funcionarios.add(gerente01);
        departamento1.funcionarios.add(estagiario1);
        departamento2.funcionarios.add(estagiario2);

        Empresa empresa = new Empresa("TI.Tecnologia", "221133");
        empresa.departamentos.add(departamento1);

        System.out.println(departamento1.funcionarios());

    }
}
