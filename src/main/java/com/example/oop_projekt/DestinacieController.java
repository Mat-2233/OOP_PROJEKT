package com.example.oop_projekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DestinacieController {
    @FXML
    Label tren;
    @FXML
    CheckBox tl;
    @FXML
    CheckBox tr;
    @FXML
    CheckBox th;
    @FXML
    Label brat;
    @FXML
    CheckBox bl;
    @FXML
    CheckBox br;

    @FXML
    CheckBox bsp;

    @FXML
    Label zil;
    @FXML
    CheckBox zj;
    @FXML
    CheckBox zt;
    @FXML
    CheckBox zsp;
    @FXML
    Label tatr;
    @FXML
    CheckBox ttj;
    @FXML
    CheckBox ttl;
    @FXML
    CheckBox ttt;

    @FXML
    Label kosi;

    @FXML
    CheckBox kh;
    @FXML
    CheckBox kj;
    @FXML
    CheckBox ks;
    @FXML
    CheckBox trencin;
    @FXML
    CheckBox bratislava;
    @FXML
    CheckBox zilina;
    @FXML
    CheckBox tatry;
    @FXML
    CheckBox kosice;

    @FXML
    private Button urob;
    @FXML
    private Button zvolit;

    NovyTrip novyTrip = new NovyTrip();

    @FXML
    private void vykonaj(ActionEvent event) throws IOException {





        //trencin
        if (trencin.isSelected()) {
            tren.setVisible(true);
            tl.setVisible(true);
            tr.setVisible(true);
            th.setVisible(true);
        }

        //bratislava
        if (bratislava.isSelected()) {
            brat.setVisible(true);
            bl.setVisible(true);
            br.setVisible(true);
            bsp.setVisible(true);
        }
        //Žilina
        if (zilina.isSelected()) {
            zil.setVisible(true);
                zj.setVisible(true);
                zt.setVisible(true);
                zsp.setVisible(true);
        }
        //Tatry
        if (tatry.isSelected()) {
            tatr.setVisible(true);
            ttj.setVisible(true);
            ttt.setVisible(true);
            ttl.setVisible(true);
        }
        //Kosice
        if (kosice.isSelected()) {
            kosi.setVisible(true);
            kh.setVisible(true);
            kj.setVisible(true);
            ks.setVisible(true);
        }
        trencin.setVisible(false);
        bratislava.setVisible(false);
        zilina.setVisible(false);
        tatry.setVisible(false);
        kosice.setVisible(false);
        urob.setVisible(false);
    }




    @FXML
    private void zvol (ActionEvent event) throws IOException {
        if(tl.isSelected()|| tr.isSelected()|| th.isSelected())
            novyTrip.tn(tl,tr,th);
        if(bl.isSelected()||br.isSelected()||bsp.isSelected())
            novyTrip.bt(bl, br, bsp);
        if(zt.isSelected()||zj.isSelected()||zsp.isSelected())
            novyTrip.za(zt, zj,zsp);
        if(ttj.isSelected()||ttt.isSelected()||ttl.isSelected())
            novyTrip.tt(ttj, ttt, ttl);
        if(ks.isSelected()||kh.isSelected()||kj.isSelected())
            novyTrip.ks(ks,kh,kj);
        Parent vyberParent = FXMLLoader.load(getClass().getResource("vyber.fxml"));
        Scene vyberScene = new Scene(vyberParent);
        Stage window = (Stage) zvolit.getScene().getWindow();
        window.setUserData(novyTrip);
        window.setScene(vyberScene);
        window.show();


    }
}
