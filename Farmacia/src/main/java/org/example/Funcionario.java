package org.example;

public class Funcionario {

        private String nome = "Fagner";
        private String cargo = "Estocador";
        private String vender = "vendas";
        private String falar = "simpático";


        public String nome() {
            return nome;
        }

        public Funcionario setnome(String nome) {
            this.nome = vender;
            return this;
        }

        public String vender() {
            return vender;
        }

        public Funcionario setvender(String vender) {
            this. vender = vender;
            return this;
        }

        public String getCargo() {
            return cargo;
        }

        public Funcionario setcargo(String cargo) {
            this.cargo = cargo;
            return this;
        }

        public String getFalar() {
            return falar;
        }

        public Funcionario setfalar(String falar) {
            this.falar = falar;
            return this;
        }
        public String vendas(){
            return "O funcionário cuida das " + vender;}

        public String cargo(){
            return "O funcionário é, também, " + cargo ;
        }

        public String falas(){
            return "O funcionário é muito " + falar + " e ama falar sobre " + vender + " para os clientes ";
        }
}
