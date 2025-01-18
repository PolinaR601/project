module ru.reshetova.reshetova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task5 to javafx.fxml;
    exports ru.reshetova.reshetova_task5;
}