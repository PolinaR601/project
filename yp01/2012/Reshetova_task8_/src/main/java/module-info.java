module ru.reshetova.reshetova_task8_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task8_ to javafx.fxml;
    exports ru.reshetova.reshetova_task8_;
}