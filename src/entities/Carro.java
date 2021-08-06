package entities;

public class Carro {
    private String placa;
    private Tag tagAssociada;

    public Tag getTagAssociada() {
        return tagAssociada;
    }

    public void setTagAssociada(Tag tagAssociada) {
        this.tagAssociada = tagAssociada;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
