module com.example.cleansystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cleansystem to javafx.fxml;
    exports com.example.cleansystem;
}