module com.example.conexionbbdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conexionbbdd to javafx.fxml;
    exports com.example.conexionbbdd;
    exports com.example.conexionbbdd;
    opens com.example.conexionbbdd to javafx.fxml;
    exports com.example.conexionbbdd.Controladores;
    opens com.example.conexionbbdd.Controladores to javafx.fxml;
}