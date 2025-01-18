package ru.reshetova.reshetova_task9_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(aTextField.getText().toString());
        int b=Integer.parseInt(bTextField.getText().toString());
        if (a <= 0 || b <= 0) {
            result.setText("Числа должны быть положительными.");
            return;
        }
        int t;
        while (b != 0) {
            t =  b;
            b = a % b;
            a = t;
        }
        result.setText("Наибольшый делитель"+a);
    }
}
