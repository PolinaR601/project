package ru.reshetova.reshetova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private TextField pTextField;

    @FXML
    private Label result;

    @FXML
    private TextField tTextField;

    @FXML
    private TextField vTextField;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int firstNum = Integer.parseInt(pTextField.getText().toString());
        int secondNum = Integer.parseInt(vTextField.getText().toString());
        int thirdNum = Integer.parseInt(tTextField.getText().toString());
        int fourthNum = Integer.parseInt(chTextField.getText().toString());
        if (firstNum != secondNum && firstNum != thirdNum && firstNum != fourthNum){
            result.setText("Отличное число под №1");
        }else if (secondNum != firstNum && secondNum != thirdNum && secondNum != fourthNum){
            result.setText("Отличное число под №2");
        }else if (thirdNum != firstNum && thirdNum != secondNum && thirdNum != fourthNum){
            result.setText("Отличное число под №3");
        }else if (fourthNum != firstNum && fourthNum != secondNum && fourthNum != thirdNum){
            result.setText("Отличное число под №4");
        }else if (firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum){
            result.setText("Все числа равны");
        }

    }

}
