package com.example.oop_projekt;

import com.example.oop_projekt.Invl_exp.Invalid_expection;
import com.example.oop_projekt.NovyTrip.NovyTrip;
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

/**
 * volba ktoré mestá chce uživatel navštíviť a následne vola atrakcií
 */
public class DestinacieController {
    @FXML
    private Label tren;
    @FXML
    private CheckBox tl;
    @FXML
    private CheckBox tr;
    @FXML
    private CheckBox th;
    @FXML
    private Label brat;
    @FXML
    private CheckBox bl;
    @FXML
    private CheckBox br;

    @FXML
    private CheckBox bsp;

    @FXML
    private Label zil;
    @FXML
    private CheckBox zj;
    @FXML
    private CheckBox zt;
    @FXML
    private CheckBox zsp;
    @FXML
    private Label tatr;
    @FXML
    private CheckBox ttj;
    @FXML
    private CheckBox ttl;
    @FXML
    private CheckBox ttt;

    @FXML
    private Label kosi;

    @FXML
    private CheckBox kh;
    @FXML
    private CheckBox kj;
    @FXML
    private CheckBox ks;
    @FXML
    private CheckBox trencin;
    @FXML
    private CheckBox bratislava;
    @FXML
    private CheckBox zilina;
    @FXML
    private CheckBox tatry;
    @FXML
    private CheckBox kosice;

    @FXML
    private Button urob;
    @FXML
    private Button zvolit;
    @FXML
    private Label lab;

    private NovyTrip novyTrip = new NovyTrip();

    /**
     *volenie destinácií
     */
    @FXML
    private void vykonaj(ActionEvent event) throws IOException {
        //trencin
        try {
            novyTrip.Overenie2(trencin,kosice,tatry,zilina,bratislava);


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
            zvolit.setVisible(true);
        }catch (Invalid_expection ex) {
            lab.setText(ex.getMessage());
        }
    }


    /**
     * vytváranie objektov pre dané destinácie a prechod do ďaľšej scény
     */
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
