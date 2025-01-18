module ru.reshetova.reshetova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task1 to javafx.fxml;
    exports ru.reshetova.reshetova_task1;
    exports ru.reshetova.reshetova_task1.controller;
    opens ru.reshetova.reshetova_task1.controller to javafx.fxml;
}