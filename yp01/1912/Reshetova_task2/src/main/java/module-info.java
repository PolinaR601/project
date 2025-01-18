module ru.reshetova.reshetova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task2 to javafx.fxml;
    exports ru.reshetova.reshetova_task2;
}