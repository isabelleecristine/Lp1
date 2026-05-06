package org.example;

public class Barbeiro {
    private String nome = "Joaquim";
    private String atende = "atendeu seu cliente";
    private String cobra = "cobrou o valor do corte";
    private String corta = "corta o cabelo";

    public String nome() {
        return nome;
    }

    public Barbeiro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String atende() {
        return atende;
    }

    public Barbeiro setAtende(String atende) {
        this.atende = atende;
        return this;
    }

    public String cobra() {
        return cobra;
    }

    public Barbeiro setCobra(String cobra) {
        this.cobra = cobra;
        return this;
    }

    public String corta() {
        return corta;
    }




    public String atender() {return nome + atende;
    }

    public String cobrar() {return nome + cobra;
    }

    public String cortar() {return nome + corta;
    }
}
