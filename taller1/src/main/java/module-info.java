module co.edu.poli.taller1.vista {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.taller1.vista to javafx.fxml;
    exports co.edu.poli.taller1.vista;
}
