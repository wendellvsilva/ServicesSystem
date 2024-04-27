package com.example.servicessystem.controller;

import com.example.servicessystem.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;

public class TelaClienteController {

    @FXML
    private Button BtnVoltarCliente;


    @FXML
    void BtnVoltarCliente(ActionEvent event) throws IOException {
        Main.trocarTela(new FXMLLoader(Main.class.getResource("TelaInicial.fxml")).load());
    }


}
