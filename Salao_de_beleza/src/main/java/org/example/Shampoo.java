package org.example;

public class Shampoo {
    private String marca = "pantene";
    private String tipo = "reduz frizz";
    private Double tamanho =3.5;

    public String getMarca (){
        return marca;
    }

    public Shampoo marca(String marca) {
        this.marca = marca;
        return this;
    }

    public String t() {
        return tipo;
    }

    public Shampoo setConteudo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Double tamanho() {
        return tamanho;
    }

    public Shampoo setTamanho(Double tamanho) {
        this.tamanho = tamanho;
        return this;
    }
    public String lavar(){
        return "O shampoo " + tipo + " do cabelo ";}

    public String espumar(){
        return "O shampoo " + marca + " espuma e " + tipo;
    }

    public String enxaguar(){
        return "O shampoo é " + tamanho + " e rende muito e " + tipo;
    }
}
