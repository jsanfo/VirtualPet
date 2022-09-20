package com.example.virtualpet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class sceneController {

    public void startClicked(ActionEvent event) throws IOException {
        changeScene(event, "loveePage.fxml");
    }

    public void perish(ActionEvent event) throws IOException {
        changeScene(event, "returnToLife.fxml");
    }

    public void resurrect(ActionEvent event) throws IOException {
        changeScene(event, "eevolPage.fxml");
    }
    private void changeScene(ActionEvent event, String fileName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));

        stage.show();
    }

}