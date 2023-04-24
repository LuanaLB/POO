package Aula06;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hospedagem {
    List<Item01> itens = new ArrayList<Item01>();
    LocalDateTime dataCheckin;
    LocalDateTime dataCheckout;

    public Hospedagem(LocalDateTime dataCheckin, LocalDateTime dataCheckout) {
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
    }

    /*
     * int quantidadeDiarias() {
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
                + "Data Checkout: " + dataCheckout;
    }
}
