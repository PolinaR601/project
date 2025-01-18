package ru.reshetova.reshetova_task3;

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
        int K = Integer.parseInt(TCHTextField.getText().toString());
        if (K < 1 || K > 365){
            result.setText("Число должно быть в диапозоне от 1 до 365");
            return;
        }
        int dayOfWeek = (K - 1) % 7;
        if (dayOfWeek == 0){
            dayOfWeek = 7;
        }else {
            dayOfWeek = (dayOfWeek + 1);
        }
        result.setText("Номер дня недели для K-го дня года: " + dayOfWeek);

    }

}
