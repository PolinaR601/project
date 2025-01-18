package ru.reshetova.reshetova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField dlina;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    private TextField shirina;

    @FXML
    private TextField storona;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(dlina.getText().toString());
        int B = Integer.parseInt(shirina.getText().toString());
        int C = Integer.parseInt(storona.getText().toString());
        int KolichKvPoDline = A / C;
        int KolichKvPoShirine = B / C;
        int VsegoKv = KolichKvPoDline * KolichKvPoShirine;
        int PlosPryam = A * B;
        int PlosKv = VsegoKv * (C * C);
        int FreePlos = PlosPryam - PlosKv;
        result.setText("Количество квадратов: " + VsegoKv + "Площадь незанятой части: " + FreePlos);
 
    }

}
