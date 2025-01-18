package ru.reshetova.reshetova_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.reshetova.reshetova_task1.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "Marathon Skills 2016");
    }

}
