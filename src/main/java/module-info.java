module org.example.morsecodegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;
    requires com.google.common;

    opens org.example.morsecodegui to javafx.fxml;
    exports org.example.morsecodegui;
}