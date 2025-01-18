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
    private TextField god;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int God = Integer.parseInt(god.getText().toString());
        int stoletie;
        if (God % 100 == 0){
            stoletie = God / 100;
        }else {
            stoletie = God / 100 + 1;
        }
        result.setText("Номер столетия: " + stoletie);


    }

}
