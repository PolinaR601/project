module ru.reshetova.reshetova_task3_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task3_ to javafx.fxml;
    exports ru.reshetova.reshetova_task3_;
}