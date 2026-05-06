package org.example;

public class Funcionario {

    private String nome = "Raquel";
    private String secar = "secador";
    private String pintar = "tintura";
    private String lavar = "lava";


    public String nome() {
        return nome;
    }

    public Funcionario setnome(String nome) {
        this.nome = lavar;
        return this;
    }

    public String lavar() {
        return lavar;
    }

    public Funcionario setlavar(String lavar) {
        this.lavar = lavar;
        return this;
    }

    public String getSecar() {
        return secar;
    }

    public Funcionario setsecar(String secar) {
        this.secar = secar;
        return this;
    }

    public String Pintar() {
        return pintar;
    }

    public Funcionario setpintar(String pintar) {
        this.pintar = pintar;
        return this;
    }
    public String pintar(){
        return "A funcionária passa " + pintar + " no cabelo da cliente ";}

    public String secar(){
        return "A funcionária passa " + secar + " no cabelo da clinte e " + lavar;
    }

    public String falar(){
        return "A funcionária " + nome + " fala sobre o mal funcionamento do " + secar + " para a cliente ";
    }
}
