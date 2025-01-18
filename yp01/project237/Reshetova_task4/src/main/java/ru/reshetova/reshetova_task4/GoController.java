package ru.reshetova.reshetova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    private TextField ATextField;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText().toString());
        double A2 = A * A;
        double A3 = A2 * A;
        double A5 = A3 * A2;
        double A10 = A5 * A5;
        double A15 = A10 * A5;
        result.setText(" A^2=" + A2 + " A^3=" + A3 + " A^5=" + A5 + " A^10=" + A10 + " A^15=" + A15);


    }

}
