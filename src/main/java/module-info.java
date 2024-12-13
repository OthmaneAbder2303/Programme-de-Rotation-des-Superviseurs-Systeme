module ma.ensa.programmederotationdessuperviseurssysteme {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens ma.ensa.programmederotationdessuperviseurssysteme to javafx.fxml;
    exports ma.ensa.programmederotationdessuperviseurssysteme;
}