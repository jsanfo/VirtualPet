module com.example.virtualpet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.virtualpet to javafx.fxml;
    exports com.example.virtualpet;
}