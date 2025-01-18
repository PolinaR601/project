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
        if (num < 100 || num >999){
            result.setText("Число должно быть трехзначным");
            return;
        }
        int sotni = num /100;
        int desyatki = (num / 10) % 10;
        int edinici = num % 10;
        int newNum = desyatki * 100 + edinici * 10 + sotni;
        result.setText("Полученное число: " + newNum);

    }

}
