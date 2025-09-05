module co.edu.uniquindio.patrones.diseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrones.diseno to javafx.fxml;
    exports co.edu.uniquindio.patrones.diseno;
}