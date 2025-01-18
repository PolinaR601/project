module ru.reshetova.reshetova_task6_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task6_ to javafx.fxml;
    exports ru.reshetova.reshetova_task6_;
}