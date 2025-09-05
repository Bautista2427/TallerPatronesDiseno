module co.edu.uniquindio.patrones.singleton {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrones.singleton to javafx.fxml;
    exports co.edu.uniquindio.patrones.singleton;
}