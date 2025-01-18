package ru.reshetova.reshetova_task4;

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
    void GoButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y;
        if (x > -Math.PI / 2 && x < Math.PI / 2){
            y = Math.sqrt(Math.abs(Math.sin(x) + Math.pow(Math.tan(x), 2) / (3.5 * Math.cos(x))));
        }else if (x > Math.PI / 2 && x < Math.PI){
            y = Math.cos(x/3) / (Math.sin(x) + Math.pow(Math.tan(x), 2));
        }else{
            result.setText("x выходит за пределы определенных диапозонов");
            return;
        }
        result.setText("y= " + y);

    }

}
