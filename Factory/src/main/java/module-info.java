module co.edu.uniquindio.patrones.factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrones.factory to javafx.fxml;
    exports co.edu.uniquindio.patrones.factory;
}