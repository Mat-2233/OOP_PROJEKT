module com.example.oop_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_projekt to javafx.fxml;
    exports com.example.oop_projekt;
    exports com.example.oop_projekt.destinacie;
    opens com.example.oop_projekt.destinacie to javafx.fxml;
}