package org.example;

public class Creme {
    private String nome = "tressemé";
    private String tipo = "denso";
    private Double preco = 120.00;

    public String nome() {
        return nome;
    }

    public Creme setnome(String nome) {
        this.nome = nome;
        return this;
    }

    public String tipo() {
        return tipo;
    }

    public Creme setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Double preco() {
        return preco;
    }

    public Creme setpreco(Double preco) {
        this.preco = preco;
        return this;
    }
    public String comprar(){
        return "O creme vale " + preco + " e rende muito ";}

    public String passar(){
        return "O creme " + nome + "é " + tipo;
    }

    public String dosar(){
        return "O creme valendo " + preco + " vale a pena porque é " + tipo;
    }
}
