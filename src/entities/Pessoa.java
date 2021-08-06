package entities;

public class Pessoa {
    private String nome;
    private String identificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Pessoa(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }
}
