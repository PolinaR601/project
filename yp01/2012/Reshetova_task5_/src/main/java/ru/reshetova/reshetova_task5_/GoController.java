package ru.reshetova.reshetova_task5_;

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
    void GoButtonOnAction(ActionEvent event) {
        double P = Double.parseDouble(pTextField.getText().toString());
        if (P <= 0 || P >= 50) {
            result.setText("Процент должен быть больше 0 и меньше 50.");
            return;
        }

        double dailyDistance = 10.0;
        double totalDistance = 0.0;
        int day = 1;

        while (totalDistance <= 200) {
            totalDistance += dailyDistance;
            dailyDistance *= (1 + P / 100);
            day++;
        }
        result.setText("После " + day + " дней суммарный пробег составит " + String.format("%.2f", totalDistance) + " км.");

    }

}
