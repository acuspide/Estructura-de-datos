module co.edu.uniquindio.recursividad.recursividad {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.recursividad.recursividad to javafx.fxml;
    exports co.edu.uniquindio.recursividad.recursividad;
}