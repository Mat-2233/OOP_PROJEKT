package com.example.oop_projekt;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *Spúšťač ktorý otvára prvé okno
 */
public class Spustac extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Spustac.class.getResource("prvascena.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("prvascena.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Projekt");
        stage.setScene(scene);
        stage.setFullScreen(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}