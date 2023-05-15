package com.example.oop_projekt;

import com.example.oop_projekt.NovyTrip.NovyTrip;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * v tejto časti si použivatel vyberá ubytovanie v konkrétnych mestách, mód v ktorom chce fungovať a počiatočnú destináciu
 */
public class VyberController {
    private NovyTrip novyTrip;
    private int i=0;
    private String actual = "";

    @FXML
    private ChoiceBox<String> btchoice;
    @FXML
    private ChoiceBox<String> poc_dest;
    @FXML
    private ChoiceBox<String> vyb_mod;

    @FXML
    private Label text;
    @FXML
    private Label penazenka;

    @FXML
    private ChoiceBox<String> fake;
    @FXML
    private Button vhb;
    @FXML
    private Button mapoc;
    private String[] accob = {"Hotel 47", "Autokemp 12","Bažina 4"};
    private String[] accot = {"Hotel 35", "Autokemp 15","Zátoka 2"};
    private String[] accoz = {"Hotel 30", "Autokemp 13","Močiar 5"};
    private String[] accott = {"Hotel 55", "Autokemp 20","Sysľova_nora 7"};
    private String[] accok = {"Hotel 25", "Autokemp 9","Lavicka_pri_spivajucej_fontáne 0"};
    private String[] mody = {"LOW","HIGH"};
    private String pomoc1 ;
    private String pomoc2;

    /**
     * napĺňanie choiceboxu
     * else prepnutie do vyberania modu a pociatocnej destinacie
     */
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
                //taktiež využitie RTTI
                poc_dest.getItems().add(novyTrip.getLokality().get(i).getClass().getSimpleName());
            text.setVisible(false);
        }
    }


    /**
     *vyberanie ubytovaní a pripovie no nášho tripu a pripisovanie ich ceny do peňaženky
     */
    @FXML
    private void vyber_hotel(ActionEvent event) throws IOException {
        if(actual.equals("Bratislava")){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getBratislava().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));
            novyTrip.getBratislava().setCena_ubytovania(Integer.parseInt(pomoc2));
            novyTrip.InformInformationPanel(penazenka);
            }
        if(actual.equals("Trencin")){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getTrencin().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));
            novyTrip.getTrencin().setCena_ubytovania(Integer.parseInt(pomoc2));
            novyTrip.InformInformationPanel(penazenka);}
        if(actual.equals("Zilina")){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getZilina().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));
            novyTrip.getZilina().setCena_ubytovania(Integer.parseInt(pomoc2));
            novyTrip.InformInformationPanel(penazenka);}
        if(actual.equals("Tatry")){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getTatry().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));
            novyTrip.getTatry().setCena_ubytovania(Integer.parseInt(pomoc2));
            novyTrip.InformInformationPanel(penazenka);}
        if(actual.equals("Kosice")){
            pomoc1=btchoice.getSelectionModel().getSelectedItem();
            pomoc2=pomoc1.substring(0,pomoc1.indexOf(" "));
            novyTrip.getKosice().setUbytovanie(pomoc2);
            pomoc2=pomoc1.substring(pomoc1.indexOf(" ")+1,pomoc1.length());
            novyTrip.setPenazenka(Integer.parseInt(pomoc2));
        novyTrip.getKosice().setCena_ubytovania(Integer.parseInt(pomoc2));
            novyTrip.InformInformationPanel(penazenka);
        }

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
            novyTrip.InformInformationPanel(penazenka);
            fill_choice();


        }
    @FXML
    private void zvolenie(ActionEvent event) throws IOException {
        novyTrip.setMod(vyb_mod.getSelectionModel().getSelectedItem());
        novyTrip.setPociatocnadestinacia(poc_dest.getSelectionModel().getSelectedItem());
        novyTrip.setCesta();
        Parent konecnyParent = FXMLLoader.load(getClass().getResource("konecny.fxml"));
        Scene konecnyScene = new Scene(konecnyParent);
        Stage window = (Stage) mapoc.getScene().getWindow();
        window.setUserData(novyTrip);
        window.setScene(konecnyScene);
        window.show();



    }





public void initialize(){

}
}
