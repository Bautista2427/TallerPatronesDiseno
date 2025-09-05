module co.edu.uniquindio.patrones.builder {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrones.builder to javafx.fxml;
    exports co.edu.uniquindio.patrones.builder;
}