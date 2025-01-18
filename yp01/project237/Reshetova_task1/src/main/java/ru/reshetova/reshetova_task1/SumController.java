package ru.reshetova.reshetova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ResultLabel;

    @FXML
    private Button SummaButton;

    @FXML
    private TextField aTextfield;

    @FXML
    private TextField bTextFiled;

    @FXML
    void SummaButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextfield.getText().toString());
        float b = Float.parseFloat(bTextFiled.getText().toString());
        ResultLabel.setText("S="+(a+b));
    }

}
