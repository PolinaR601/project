module ru.reshetova.reshetova_task1_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task1 to javafx.fxml;
    exports ru.reshetova.reshetova_task1;
}