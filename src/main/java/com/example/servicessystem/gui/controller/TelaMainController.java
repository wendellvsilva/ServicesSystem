package com.example.servicessystem.gui.controller;

import com.example.servicessystem.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;

public class TelaMainController {

    @FXML
    private Button BtnCliente;

    @FXML
    private Button BtnPrestador;

    @FXML
    void BotaoTelaCliente(ActionEvent event) throws IOException {
        Main.trocarTela(new FXMLLoader(Main.class.getResource("TelaCliente.fxml")).load());
    }

    @FXML
    void BotaoTelaPrestador(ActionEvent event) {

    }

}