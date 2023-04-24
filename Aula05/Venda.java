package Aula05;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    List<Item> itens = new ArrayList<Item>();
    DecimalFormat df = new DecimalFormat("#,###.00");
    LocalDateTime data;

    public Venda(LocalDateTime data) {
        this.data = data;
    }

    double total() {
        double total = 0;
        for (Item a : itens) {
            total += a.total();
        }
        return total;
    }

    String dados() {
        return "Total da venda: " + df.format(total()) +
                "\nData e hora das venda: " + data;
    }

}