package ru.reshetova.reshetova_task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    // ОБРАБОТКА НАЖАТИЯ КНОПКИ
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = (List<Integer>) dataListView.getItems();
        int n = data.get(0);
        int max = 0;
        for (int i = 1; i <= n; i++){
            int m = data.get(i);
            if (m % 10 == 3 && m > max){
                max = m;
            }
        }
        if (max != 0)
            answerLabel.setText(String.valueOf(max));
        else  answerLabel.setText("Чисел оканчивающихся на 3 нет");
    }

    @FXML
    // ОБРАБОТКА ВВОДИМЫХ ДАННЫХ
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    // ВЫХОД ИЗ ПРИЛОЖЕНИЯ
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

}
