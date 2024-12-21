module ma.ensa.prog_rot {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens ma.ensa.prog_rot to javafx.fxml;
    exports ma.ensa.prog_rot;
}