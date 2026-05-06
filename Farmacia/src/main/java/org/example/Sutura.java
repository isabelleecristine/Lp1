package org.example;

public class Sutura {
    private String marca = "Nylon";
    private String tipo = "tratar machucados";
    private Double tamanho = 1.0;

    public String nome() {
        return marca;
    }

    public Sutura setmarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Sutura setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
    public Double getTamanho () {
        return tamanho;
    }

    public Sutura setTamanho(Double tamanho) {
        this.tamanho = tamanho;
        return this;
    }


    public String Nome(){
        return "A sutura é da marca" + marca + " a melhor do mercado ";}

    public String tipo(){

        return "Ela serve para " + tipo;
    }

    public String tamanho (){

        return "A sutura mede " + tamanho;
    }
}
