package ru.reshetova.reshetova_task4;

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
        int A = Integer.parseInt(aTextField.getText().toString());
        int B = Integer.parseInt(bTextField.getText().toString());
        if ( A <= B ){
            result.setText("ошибка, A должно быть больше B");
            return;
        }
        int count = 0;
        int curLen = 0;
        while (curLen + B <= A){
            curLen += B;
            count ++;
        }
        result.setText("Кол-во отрезков B на отрезке A: " + count);

    }

}
