package ru.reshetova.reshetova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private Button go;

    @FXML
    private TextField kTextField;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(kTextField.getText().toString());
        String res;
        switch (K){
            case 1:
                res = "плохо";
                break;
            case 2:
                res = "неудовлетворительно";
                break;
            case 3:
                res = "удовлетворительно";
                break;
            case 4:
                res = "хорошо";
                break;
            case 5:
                res = "отлично";
                break;
            default:
                res = "ошибка";
                break;

        }
        result.setText(res);

    }

}
