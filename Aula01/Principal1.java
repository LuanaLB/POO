public class Principal1 {
        public static void main(String[] args) {

                System.out.println("----- Sistema Notas -----");
                Aluno aluno1 = new Aluno("juliana", 9.5, 8.0);
                Aluno aluno2 = new Aluno("Paulo", 4.0, 6.5);

                System.out.println("Dados do aluno 1: " + aluno1.retornarDados()
                                + "\n" + "Média do aluno 1: " + aluno1.calcularMedia()
                                + "\n" + "Situação do aluno 1: " + aluno1.retornarSituacao()
                                + "\n" + "***********---------****************"
                                + "\n" + "Dados do aluno 2: " + aluno2.retornarDados()
                                + "\n" + "Média do aluno 2: " + aluno2.calcularMedia()
                                + "\n" + "Situação do aluno 2: " + aluno2.retornarSituacao());

                // Sistema Conta
                Conta conta1 = new Conta("João ", 1000, 500);
                Conta conta2 = new Conta("Maria", 500, 1000);

                System.out.println("----- Sistema bancario -----"
                                + "\n" + "Dados da conta 1: " + conta1.retornarDados());
                conta1.sacar(700);
                conta1.depositar(200);
                System.out.println("Dados atualizados da conta 1: "
                                + "\n" + conta1.retornarDados()
                                + "\n" + "************-----------******************"
                                + "\n" + "Dados da conta 2: " + conta2.retornarDados());
                conta2.sacar(700);
                conta2.depositar(200);
                System.out.println("Dados atualizados da conta 2: "
                                + "\n" + conta2.retornarDados());

                // Sistema IMC
                System.out.println("----- Sistema IMC ----");
                Pessoa pessoa1 = new Pessoa("Luana", 48, 1.60);
                System.out.println("Situação: " + pessoa1.situacao()
                                + "\n" + "IMC: " + pessoa1.calcularImc());

        }
}
