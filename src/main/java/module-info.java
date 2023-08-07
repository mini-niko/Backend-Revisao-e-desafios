module com.example.revisaoedesafios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.revisaoedesafios to javafx.fxml;
    exports com.example.revisaoedesafios;
}