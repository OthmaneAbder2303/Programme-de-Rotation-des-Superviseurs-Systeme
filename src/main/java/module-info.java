module ma.ensa.programmederotationdessuperviseurssysteme {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.ensa.programmederotationdessuperviseurssysteme to javafx.fxml;
    exports ma.ensa.programmederotationdessuperviseurssysteme;
}