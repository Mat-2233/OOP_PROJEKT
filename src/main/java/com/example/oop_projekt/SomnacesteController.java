package com.example.oop_projekt;

import com.example.oop_projekt.NovyTrip.NovyTrip;
import com.example.oop_projekt.Serializer.NovyTripSerializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * tu uživatel zadá meno svojho výletu a prepne sa do scény kde sa mu vypíše
 */
public class SomnacesteController {
    @FXML
    private TextField nazov;
    @FXML
    private Button oka;
    NovyTrip novyTrip= new NovyTrip();
    public void vyhladaj(ActionEvent event)throws IOException {
        novyTrip= NovyTripSerializer.deserializeNovyTrip(nazov.getText()+".ser");
        if(novyTrip!=null){
        Parent konecnyParent = FXMLLoader.load(getClass().getResource("konecny.fxml"));
        Scene konecnyScene = new Scene(konecnyParent);
        Stage window = (Stage) oka.getScene().getWindow();
        window.setUserData(novyTrip);
        window.setScene(konecnyScene);
        window.show();}
        else System.out.println("nespravne nazov");

    }

}
