module com.example.conexionbbdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conexionbbdd to javafx.fxml;
    exports com.example.conexionbbdd;
}