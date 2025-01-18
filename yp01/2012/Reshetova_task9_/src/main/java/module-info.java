module ru.reshetova.reshetova_task9_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task9_ to javafx.fxml;
    exports ru.reshetova.reshetova_task9_;
}