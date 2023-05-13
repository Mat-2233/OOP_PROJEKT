package com.example.oop_projekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;

public class AtrakcieController {
    @FXML
    CheckBox lezenie;
    @FXML
    CheckBox rafting;

    @FXML
    CheckBox skok_padakom;

    @FXML
    CheckBox jaskyne;
    @FXML
    CheckBox turistika;

    @FXML
    CheckBox hrad;
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
    private Button urob;
    @FXML
    private Button zvolit;

    private NovyTrip novyTrip = new NovyTrip();

    public void vyber(ActionEvent actionEvent) {

        if (actionEvent.getSource() == lezenie)
            novyTrip.setLezenie();
        else if (actionEvent.getSource() == rafting)
            novyTrip.setRafting();
        else if (actionEvent.getSource() == skok_padakom)
            novyTrip.setSkokpadakom();
        else if (actionEvent.getSource() == jaskyne)
            novyTrip.setJaskyne();
        else if (actionEvent.getSource() == turistika)
            novyTrip.setTuristika();
        else if (actionEvent.getSource() == hrad)
            novyTrip.setHrad();

    }
    @FXML
    private void vykonaj(ActionEvent event) throws IOException {

        lezenie.setVisible(false);
        rafting.setVisible(false);
        jaskyne.setVisible(false);
        skok_padakom.setVisible(false);
        hrad.setVisible(false);
        urob.setVisible(false);
        turistika.setVisible(false);
        //tieto jasyne trea doriešiť


        //trencin
        if (novyTrip.getLezenie()||novyTrip.getRafting()||novyTrip.getHrad()) {
            tren.setVisible(true);

            if (novyTrip.getLezenie())
                tl.setVisible(true);
            if (novyTrip.getRafting())
                tr.setVisible(true);
            if (novyTrip.getHrad())
                th.setVisible(true);
        }

            //bratislava
            if (novyTrip.getLezenie() || novyTrip.getRafting() || novyTrip.getSkokpadakom()) {
                brat.setVisible(true);
                if (novyTrip.getLezenie())
                    bl.setVisible(true);
                if (novyTrip.getRafting())
                    br.setVisible(true);
                if (novyTrip.getSkokpadakom())
                    bsp.setVisible(true);
            }
         //Žilina
        if (novyTrip.getJaskyne() || novyTrip.getTuristika() || novyTrip.getSkokpadakom()) {
            zil.setVisible(true);
            if (novyTrip.getJaskyne())
                zj.setVisible(true);
            if (novyTrip.getTuristika())
                zt.setVisible(true);
            if (novyTrip.getSkokpadakom())
                zsp.setVisible(true);
        }
        //Tatry
        if (novyTrip.getJaskyne() || novyTrip.getTuristika() || novyTrip.getLezenie()) {
            tatr.setVisible(true);
            if (novyTrip.getJaskyne())
                ttj.setVisible(true);
            if (novyTrip.getTuristika())
                ttt.setVisible(true);
            if (novyTrip.getLezenie())
                ttl.setVisible(true);
        }
        //Kosice
        if (novyTrip.getHrad() || novyTrip.getJaskyne() || novyTrip.getSkokpadakom()) {
            kosi.setVisible(true);
            if (novyTrip.getHrad())
                kh.setVisible(true);
            if (novyTrip.getJaskyne())
                kj.setVisible(true);
            if (novyTrip.getSkokpadakom())
                ks.setVisible(true);
        }
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
