module com.example.oop_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_projekt to javafx.fxml;
    exports com.example.oop_projekt;
    exports com.example.oop_projekt.destinacie;
    opens com.example.oop_projekt.destinacie to javafx.fxml;
    exports com.example.oop_projekt.obs_implem;
    opens com.example.oop_projekt.obs_implem to javafx.fxml;
    exports com.example.oop_projekt.Invl_exp;
    opens com.example.oop_projekt.Invl_exp to javafx.fxml;
    exports com.example.oop_projekt.Serializer;
    opens com.example.oop_projekt.Serializer to javafx.fxml;
    exports com.example.oop_projekt.NovyTrip;
    opens com.example.oop_projekt.NovyTrip to javafx.fxml;
}