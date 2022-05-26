module com.example.javafxtestapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtestapp to javafx.fxml;
    exports com.example.javafxtestapp;
}