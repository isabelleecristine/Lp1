package org.example;

        public class Remedio {
        private String nome = "carvedilol";
        private String tipo = "tratar hipertensão arterial";
        private Double preco = 40.00;

        public String nome() {
            return nome;
        }

        public Remedio setnome(String nome) {
            this.nome = nome;
            return this;
        }

        public String getTipo() {
            return tipo;
        }

        public Remedio setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }
            public Double preco () {
                return preco;
            }

            public Remedio setPreco(Double preco) {
                this.preco = preco;
                return this;
            }


        public String getNome(){
            return "O remedio" + nome + " é muito eficiente ";}

        public String tipo(){

            return "Ele serve para " + tipo;
        }

        public String Preco (){

            return "O remédio vale " + preco;
        }
}
