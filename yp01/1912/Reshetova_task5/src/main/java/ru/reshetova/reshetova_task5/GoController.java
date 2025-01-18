package ru.reshetova.reshetova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        double x=Double.parseDouble(xTextField.getText().toString());
        double y=Double.parseDouble(yTextField.getText().toString());
        if(Math.pow(x,2)+Math.pow(y,2) < Math.pow(25,2) && y < -Math.abs(x) && y < Math.abs(x)){
            result.setText("да");
        }else if ((Math.pow(x,2)+Math.pow(y,2) == Math.pow(25,2) || y == -Math.abs(x) || y == Math.abs(x))&& y<25&& x>-25 && x<25){
            result.setText("На границе");
        } else
            result.setText("Нет");
    }
}

