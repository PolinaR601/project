module ru.reshetova.reshetova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task4 to javafx.fxml;
    exports ru.reshetova.reshetova_task4;
}