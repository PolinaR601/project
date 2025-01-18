package ru.reshetova.reshetova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField R2TextField;

    @FXML
    private Button Summabtn;

    @FXML
    private TextField r1TextField;

    @FXML
    private Label resultlabel;

    @FXML
    void SummabtnOnAction(ActionEvent event) {
        double R1 = Double.parseDouble(r1TextField.getText().toString());
        double R2 = Double.parseDouble(R2TextField.getText().toString());
        if (R1<=R2){
            resultlabel.setText("Ошибка: R1 должно быть больше R2");
            return;
        }
        double pi = 3.14;
        double S1 = pi*Math.pow(R1,2);
        double S2 = pi*Math.pow(R2,2);
        double S3 = S1-S2;
        resultlabel.setText("S1 = " + (S1) + "  S2 = " + (S2) + "  S3 = " + (S3));
    }

}
