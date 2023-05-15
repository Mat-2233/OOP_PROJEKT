package com.example.oop_projekt;

import com.example.oop_projekt.Invl_exp.Invalid_expection;
import com.example.oop_projekt.NovyTrip.NovyTrip;
import com.example.oop_projekt.obs_implem.Stav;
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
 * volba atrakcií ktoré chce uživatel zažiť a násled kontrétna voľba v mestách
 */
public class AtrakcieController {
    @FXML
    private Label lab;
    @FXML
    private CheckBox lezenie;
    @FXML
    private CheckBox rafting;

    @FXML
    private CheckBox skok_padakom;

    @FXML
    private CheckBox jaskyne;
    @FXML
    private CheckBox turistika;

    @FXML
    private CheckBox hrad;
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
    private Button urob;
    @FXML
    private Button zvolit;

    private NovyTrip novyTrip = new NovyTrip();

    /**
     *volenie kokrétnyhc aktivít
     */
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

    /**
     * tu dochádza k využitiu vlastnej podmienky, pokiaľ uživateľ nezvolil žiadu antrakciu , vyhodi chybu
     * @param event
     * @throws IOException
     */
    @FXML
    private void vykonaj(ActionEvent event) throws IOException {

        try {
            novyTrip.Overenie1();
            lezenie.setVisible(false);
            rafting.setVisible(false);
            jaskyne.setVisible(false);
            skok_padakom.setVisible(false);
            hrad.setVisible(false);
            urob.setVisible(false);
            turistika.setVisible(false);
            zvolit.setVisible(true);
            //pridanie noveho observera tymu stav od arraylistu observerov
            novyTrip.Informer(new Stav(novyTrip));


            //trencin
            if (novyTrip.getLezenie() || novyTrip.getRafting() || novyTrip.getHrad()) {
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

        } catch (Invalid_expection ex) {
            lab.setText(ex.getMessage());
        }

    }


    /**
     * vytváranie objektov pre dané destinácie a prechod do ďaľšej scény
     * @param event
     * @throws IOException
     */
    @FXML
    private void zvol(ActionEvent event) throws IOException {
        if (tl.isSelected() || tr.isSelected() || th.isSelected())
            novyTrip.tn(tl, tr, th);
        if (bl.isSelected() || br.isSelected() || bsp.isSelected())
            novyTrip.bt(bl, br, bsp);
        if (zt.isSelected() || zj.isSelected() || zsp.isSelected())
            novyTrip.za(zt, zj, zsp);
        if (ttj.isSelected() || ttt.isSelected() || ttl.isSelected())
            novyTrip.tt(ttj, ttt, ttl);
        if (ks.isSelected() || kh.isSelected() || kj.isSelected())
            novyTrip.ks(ks, kh, kj);
        Parent vyberParent = FXMLLoader.load(getClass().getResource("vyber.fxml"));
        Scene vyberScene = new Scene(vyberParent);
        Stage window = (Stage) zvolit.getScene().getWindow();
        window.setUserData(novyTrip);
        window.setScene(vyberScene);
        window.show();


    }


}
