package ru.reshetova.reshetova_task3;

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
        double y = 4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 6) + 2;
        result.setText(" y= " + y);


    }

}
