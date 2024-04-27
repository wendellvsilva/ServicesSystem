package com.example.servicessystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setMinHeight(600);
        stage.setMinWidth(200);
        this.stage = stage;
        stage.setResizable(false);
        FXMLLoader root = new FXMLLoader(Main.class.getResource("TelaInicial.fxml"));
        Scene scene = new Scene(root.load());

        stage.setScene(scene);
        stage.setTitle("ServicesSystem");
        stage.show();
    }
    public static void trocarTela(Parent janela) {
        Scene scene = new Scene(janela);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }

}

