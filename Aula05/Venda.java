package Aula05;

import java.time.LocalDateTime;

public class Venda {
    Item item;
    LocalDateTime data;

    public Venda(LocalDateTime data, Item item) {
        this.data = data;
        this.item = item;
    }

    double total(){
        return 
    }

    String dados() {
        return item.dados() +
                "\nData/horário da venda: " + data;
    }
}
