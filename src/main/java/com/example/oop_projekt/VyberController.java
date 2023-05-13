package com.example.oop_projekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class VyberController {
    NovyTrip novyTrip;
    int i=0;
    String actual = "";

    @FXML
    private ChoiceBox<String> btchoice;
    @FXML
    private ChoiceBox<String> poc_dest;
    @FXML
    private ChoiceBox<String> vyb_mod;

    @FXML
    private Label text;

    @FXML
    private ChoiceBox<String> fake;
    @FXML
    private Button vhb;
    @FXML
    private Button mapoc;
    String[] accob = {"Hotel 50", "Autokemp 12","Bažina 4"};
    String[] accot = {"Hotel 43", "Autokemp 15","Podmostie 2"};
    String[] accoz = {"Hotel 30", "Autokemp 13","Močiar 5"};
    String[] accott = {"Hotel 43", "Autokemp 15","Naďumbiery 30"};
    String[] accok = {"Hotel 43", "Autokemp 15","Lunik9 1"};
    String[] mody = {"LOW","HIGH"};
    String pomoc1 ;
    String pomoc2;
    public void fill_choice(){
        btchoice.getItems().clear();
        if(i!= novyTrip.getLokality().size()){
            actual=novyTrip.getLokality().get(i).getClass().getSimpleName();
            text.setText(actual);
            if(Objects.equals(actual, "Bratislava"))
                btchoice.getItems().addAll(accob);
            if(Objects.equals(actual, "Trencin"))
                btchoice.getItems().addAll(accot);
            if(Objects.equals(actual, "Zilina"))
                btchoice.getItems().addAll(accoz);
            if(Objects.equals(actual, "Tatry"))
                btchoice.getItems().addAll(accott);
            if(Objects.equals(actual, "Kosice"))
                btchoice.getItems().addAll(accok);
        }
        else{
            btchoice.setVisible(false);
            vhb.setVisible(false);
            poc_dest.setVisible(true);
            vyb_mod.setVisible(true);
            mapoc.setVisible(true);
            vyb_mod.getItems().addAll(mody);
            for (int i = 0; i < novyTrip.getLokality().size(); i++)
                poc_dest.getItems().add(novyTrip.getLokality().get(i).getClass().getSimpleName());
            text.setVisible(false);
        }
    }


    @FXML
    private void vyber_hotel(ActionEvent event) throws IOException {
        if(actual=="Bratislava"){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getBratislava().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));}
        if(actual=="Trencin"){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getTrencin().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));}
        if(actual=="Zilina"){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getZilina().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));}
        if(actual=="Tatry"){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getTatry().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));}
        if(actual=="Kosice"){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getKosice().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));}

        i++;
        fill_choice();

    }

        @FXML
        private void nadstavenie(MouseEvent event) throws IOException {
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            novyTrip=(NovyTrip)stage.getUserData();
            btchoice.setVisible(true);
            fake.setVisible(false);
            fill_choice();


        }
    @FXML
    private void zvolenie(ActionEvent event) throws IOException {
        novyTrip.setMod(vyb_mod.getSelectionModel().getSelectedItem());
        novyTrip.setPociatocnadestinacia(poc_dest.getSelectionModel().getSelectedItem());
        novyTrip.setCesta();



    }





public void initialize(){

}
}
