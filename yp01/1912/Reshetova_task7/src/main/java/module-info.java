module ru.reshetova.reshetova_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.reshetova.reshetova_task7 to javafx.fxml;
    exports ru.reshetova.reshetova_task7;
}