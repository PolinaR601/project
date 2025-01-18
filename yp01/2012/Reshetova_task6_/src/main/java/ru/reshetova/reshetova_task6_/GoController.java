package ru.reshetova.reshetova_task6_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private Button go;

    @FXML
    private TextField nTextField;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        if (N < 0) {
            result.setText("Число должно быть положительным.");
            return;}
        int count = 0;
        int sum = 0;
        int tempN = N;
        while (tempN > 0) {
            int digit = tempN % 10;
            sum += digit;
            count++;
            tempN /= 10;
        }
        result.setText("Кол-во цифр: " + count + ", сумма цифр " + sum);
    }
}
