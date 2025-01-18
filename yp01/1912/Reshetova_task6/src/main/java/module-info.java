module ru.reshetova.reshetova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task6 to javafx.fxml;
    exports ru.reshetova.reshetova_task6;
}