package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FarmaciaController {
    @FXML
    private void bt_fun() {
        try {
            App.setRoot("Funcionario");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt_rem() {
        try {
            App.setRoot("Remedio");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt_sut() {
        try {
            App.setRoot("Sutura");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void bt_far() {
        try {
            App.setRoot("FarmaciaController");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Funcionario funcionario = new Funcionario();


    private Remedio remedio = new Remedio();


    private Sutura sutura = new Sutura();

    @FXML
    private Label Texto;


    @FXML
    private void bt_ven() {
        Texto.setText(funcionario.vendas());
    }

    @FXML
    private void bt_rep() {
        Texto.setText(funcionario.cargo());
    }

    @FXML
    private void bt_fal() {
        Texto.setText(funcionario.falas());
    }

    @FXML
    private void bt_nom() {
        Texto.setText(sutura.nome());
    }

    @FXML
    private void bt_tip() {
        Texto.setText(sutura.tipo());
    }

    @FXML
    private void bt_tam() {
        Texto.setText(sutura.tamanho());
    }

    @FXML
    private void bt_lav() {
        Texto.setText(remedio.getNome());
    }


    @FXML
    private void bt_enxa() {
        Texto.setText(remedio.tipo());
    }
    @FXML
    private void bt_espu() {
        Texto.setText(remedio.Preco());
    }
}


