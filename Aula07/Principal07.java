public class Principal07 {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Honda Civic SI", 120000);
        Veiculo veiculo2 = new Veiculo("Wolkswagen Gol", 100000);
        Veiculo veiculo3 = new Veiculo("Fiat Uno Mille", 15000);
        Veiculo veiculo4 = new Veiculo("Kia Ceratto", 200000);
        Veiculo veiculo5 = new Veiculo("Chevrolet Onix", 65000);
        Veiculo veiculo6 = new Veiculo("Fiat Uno Mille", 15000);

        Concessionaria concessionaria1 = new Concessionaria("Planeta", "Palmas-TO, Av. Teotônio Segurado");
        Concessionaria concessionaria2 = new Concessionaria("Umuarama", "Araguaína-TO");

        Cliente cliente1 = new Cliente("Luana Batista", "123.456.789-00");
        Cliente cliente2 = new Cliente("Ismar Vinicius", "987.654.321-00");
    }
}