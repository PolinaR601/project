package ru.reshetova.reshetova_task3_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField eTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    private TextField zTextField;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int elem = Integer.parseInt(eTextField.getText().toString());
        double val = Double.parseDouble(zTextField.getText().toString());
        double a, c, h, s;

        switch(elem) {
            case 1:
                a = val;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 2:
                c = val;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 3:
                h = val;
                c = 2 * h;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                break;
            case 4:
                s = val;
                h = Math.sqrt(s);
                c = 2 * h;
                a = c / Math.sqrt(2);
                break;
            default:
                result.setText("Номер элемента должен быть в диапазоне 1-4.");
                return;
        }
        result.setText(("Катет a: ") + String.format("%.2f", a) + ("; гипотенуза c: ") + String.format("%.2f", c) + ("; высота h: ") + String.format("%.2f", h) + ("; площадь S: ") + String.format("%.2f", s)) ;

    }

}
