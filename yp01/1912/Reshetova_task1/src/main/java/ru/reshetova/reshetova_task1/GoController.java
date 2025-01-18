package ru.reshetova.reshetova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField TCHTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(TCHTextField.getText().toString());
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;
        if (num < 100 || num > 999){
            result.setText("Ошибка, введите трехзначное число");
        }else if(firstDigit == secondDigit && secondDigit == thirdDigit){
            result.setText("Все цифры одинаковые");
        }else if(firstDigit != secondDigit || secondDigit != thirdDigit){
            result.setText("Цифры разные");
        }
    }
}
