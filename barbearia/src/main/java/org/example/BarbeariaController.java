package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BarbeariaController {


    @FXML
    private void Botao_Barbeiro() {
        try {
            App.setRoot("Barbeiro");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void Botao_Cliente() {
        try {
            App.setRoot("Cliente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void Botao_Maquininha() {
        try {
            App.setRoot("Maquininha");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Botao_Voltar() {
        try {
            App.setRoot("Maquininha");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Barbeiro barbeiro = new Barbeiro();

    @FXML
    private Maquininha maquininha = new Maquininha();

    @FXML
    private Cliente cliente = new Cliente();

    @FXML
    private Label texto;

    private void Botao_Atender() {
        texto.setText(barbeiro.atender());

    }

    @FXML
    void Botao_Cobrar() {
        texto.setText(barbeiro.cobrar());

    }

    @FXML
    void Botao_Cortar() {
        texto.setText(barbeiro.cortar());

    }

    @FXML
    void Botao_Escolher() {
        texto.setText(cliente.escolher());

    }

    @FXML
    void Botao_Esperar() {
        texto.setText(cliente.esperar());

    }

    @FXML
    void Botao_Pagar() {
        texto.setText(cliente.pagar());

    }


    @FXML
    void Botao_Ajustar() {
        texto.setText(maquininha.ajustar());

    }

    @FXML
    void Botao_Desligar() {
        texto.setText(maquininha.desligar());

    }

    @FXML
    void Botao_Ligar() {
        texto.setText(maquininha.ligar());

    }