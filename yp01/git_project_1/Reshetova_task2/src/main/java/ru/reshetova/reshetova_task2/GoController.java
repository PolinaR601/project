package ru.reshetova.reshetova_task2;

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
        int newNum = edinici * 100 + sotni * 10 + desyatki;
        result.setText("Полученное число: " + newNum);

    }

}
