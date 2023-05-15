package com.example.oop_projekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * prvá scéna, slúži na voľbu či chceme vytvoriť nový trip, alebo si pozrieť už exizstujúci
 */
public class PrvascenaController {

    @FXML
    private AnchorPane anchor;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;




    @FXML
    private void goToPlanovanie (ActionEvent event) throws IOException {
        Parent planovanieParent = FXMLLoader.load(getClass().getResource("planovanie.fxml"));
        Scene planovanieScene = new Scene(planovanieParent);
        Stage window = (Stage) btn1.getScene().getWindow();
        window.setScene(planovanieScene);
        window.show();
    }


    @FXML
    private void goToSomnaceste (ActionEvent event) throws IOException {
        Parent somnacesteParent = FXMLLoader.load(getClass().getResource("somnaceste.fxml"));
        Scene somnacesteScene = new Scene(somnacesteParent);
        Stage window = (Stage) btn2.getScene().getWindow();
        window.setScene(somnacesteScene);
        window.show();
    }

}