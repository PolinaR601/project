package ru.reshetova.reshetova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private Button go;

    @FXML
    private TextField pTextField;

    @FXML
    private Label result;

    @FXML
    private TextField vTextField;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int firstNum = Integer.parseInt(pTextField.getText().toString());
        int secondNum = Integer.parseInt(vTextField.getText().toString());
        if (firstNum < secondNum){
            result.setText("Наименьшее число под №1");
        }else if (secondNum < firstNum){
            result.setText("Наименьшее число под №2");
        }else{
            result.setText("Оба числа равны");
        }
    }
}
