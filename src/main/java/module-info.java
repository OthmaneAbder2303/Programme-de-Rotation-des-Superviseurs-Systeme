module ma.ensa.programmederotationdessuperviseurssysteme {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens ma.ensa.programmederotationdessuperviseurssysteme to javafx.fxml;
    exports ma.ensa.programmederotationdessuperviseurssysteme;
}