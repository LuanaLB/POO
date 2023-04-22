package Aula06;

import java.time.LocalDateTime;

public class Hospedagem {
    LocalDateTime dataCheckin;
    LocalDateTime dataCheckout;

    public Hospedagem(LocalDateTime dataCheckin, LocalDateTime dataCheckout) {
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
    }

    int quantidadeDiarias() {
        int dias = Days.daysBetween(dataCheckin, dataCheckout).getDays();
    }

    /*
     * double total(){
     * 
     * }
     */

    String dados() {
        return "";
    }
}
