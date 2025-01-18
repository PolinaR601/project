package ru.reshetova.reshetova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText().toString());
        double x = Math.pow(10, -a + Math.cos(a + 1));
        double y = Math.log(Math.abs(Math.atan(x) - Math.sin(a * x)));
        result.setText(" y= " + y);
    }
}

