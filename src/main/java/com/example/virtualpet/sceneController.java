package com.example.virtualpet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class sceneController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}