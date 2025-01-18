module ru.reshetova.reshetova_task7_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task7_ to javafx.fxml;
    exports ru.reshetova.reshetova_task7_;
}