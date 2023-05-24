package Aula08;

public class Principal08 {
    public static void main(String[] args) {
        Estagiario estag = new Estagiario(
                "Lucas",
                1250,
                "Nutrição");

        Gerente geren = new Gerente(
                "Cláudio",
                6000,
                500);
        imprimir(geren);

    }

    private static void imprimir(Funcionario funcionario) {
        System.out.println(funcionario.dados());
    }
}
