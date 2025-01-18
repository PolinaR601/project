module ru.reshetova.reshetova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task3 to javafx.fxml;
    exports ru.reshetova.reshetova_task3;
}