package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SalaoController {

    @FXML
    private void bt_func() {
        try {
            App.setRoot("Funcionario");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt_sham() {
        try {
            App.setRoot("Shampoo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt_crem() {
        try {
            App.setRoot("Creme");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt_volt() {
        try {
            App.setRoot("SalaoController");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Funcionario funcionario = new Funcionario();


    private Creme creme = new Creme();


    private Shampoo shampoo = new Shampoo();

    @FXML
    private Label texto;


    @FXML
    private void bt_sec() {
        texto.setText(funcionario.secar());
    }

    @FXML
    private void bt_pin() {
        texto.setText(funcionario.pintar());
    }

    @FXML
    private void bt_fal() {
        texto.setText(funcionario.falar());
    }

    @FXML
    private void bt_com() {
        texto.setText(creme.comprar());
    }

    @FXML
    private void bt_pass() {
        texto.setText(creme.passar());
    }

    @FXML
    private void bt_dos() {
        texto.setText(creme.dosar());
    }

    @FXML
    private void bt_lav() {
        texto.setText(shampoo.lavar());
    }

    @FXML
    private void bt_enxa() {
        texto.setText(shampoo.enxaguar());
    }
    @FXML
    private void bt_espu() {
        texto.setText(shampoo.espumar());
    }
}
