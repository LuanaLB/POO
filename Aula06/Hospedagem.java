package Aula06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Hospedagem {
    List<Item01> itens = new ArrayList<Item01>();
    List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
    LocalDateTime dataCheckin;
    LocalDateTime dataCheckout;
    Apartamento apartamento;
    Hospede hospede;
    Acompanhante acompanhante;

    public Hospedagem(Hospede hospede, Apartamento apartamento) {
        this.hospede = hospede;
        this.apartamento = apartamento;
        this.dataCheckin = LocalDateTime.now();
    }

    int quantidadeDiarias(int diaria) {
        return (int) ChronoUnit.DAYS.between(dataCheckout, dataCheckin);
    }

    public double total() {
        double valorItens = itens.stream().mapToDouble(Item01::total).sum();
        return (quantidadeDiarias(0) * apartamento.valorDiaria) + valorItens;
    }

    String dados() {
        return "Data do Checkin: " + dataCheckin
                + "Data Checkout: " + dataCheckout +
                "Acompanhamte: " + acompanhante;
    }

    public void dataCheckout(LocalDateTime parse) {
    }
}

// o valor total das diárias é calculado pela multiplicação do número de diárias
// utilizadas pelo valor da diária;
// d) o subtotal é calculado pela soma do valor total das diárias e o valor do
// consumo interno;
