module com.example.servicessystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.servicessystem to javafx.fxml;
    exports com.example.servicessystem;
    exports com.example.servicessystem.controller;
    opens com.example.servicessystem.controller to javafx.fxml;
    exports com.example.servicessystem.gui;
    opens com.example.servicessystem.gui to javafx.fxml;
}