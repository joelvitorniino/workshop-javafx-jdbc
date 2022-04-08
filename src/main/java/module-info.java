module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshopjavafxjdbc to javafx.fxml;
    opens model.entities to javafx.base;
    exports com.example.workshopjavafxjdbc;
}