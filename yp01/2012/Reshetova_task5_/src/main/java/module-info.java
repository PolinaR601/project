module ru.reshetova.reshetova_task5_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task5_ to javafx.fxml;
    exports ru.reshetova.reshetova_task5_;
}