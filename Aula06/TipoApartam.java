package Aula06;

public enum TipoApartam {

    INDIVIDUAL("Apartamento Individual"),
    DUPLO("Apartamento Duplo"),
    TRIPLO("Apartamento Triplo"),
    CASAL("Apartamento Casal");

    String descricao;

    TipoApartam(String descricao) {
        this.descricao = descricao;
    }
}
