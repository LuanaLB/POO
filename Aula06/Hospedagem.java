package Aula06;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hospedagem {
    Acompanhante acompanhante;
    List<Item01> itens = new ArrayList<Item01>();
    LocalDateTime dataCheckin;
    LocalDateTime dataCheckout;

    public Hospedagem(LocalDateTime dataCheckin, LocalDateTime dataCheckout) {
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
    }

    /*
     * int quantidadeDiarias(int diaria) {
     * for (int diaria = 0; * dataCheckout) {
     * diaria =
     * }
     * }
     */

    double total() {
        double total = 0;
        for (Item01 a : itens) {
            total += a.total();
        }
        return total;
    }

    String dados() {
        return "Data do Checkin: " + dataCheckin
                + "Data Checkout: " + dataCheckout +
                "Acompanhamte: " + acompanhante;
    }
}

// o valor total das diárias é calculado pela multiplicação do número de diárias
// utilizadas pelo valor da diária;
// d) o subtotal é calculado pela soma do valor total das diárias e o valor do
// consumo interno;
