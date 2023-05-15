package com.example.oop_projekt;

import com.example.oop_projekt.NovyTrip.NovyTrip;
import com.example.oop_projekt.Serializer.NovyTripSerializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * tu dochádza k výpisu celého navoleného výletu
 */
public class KonecnyController {

    private NovyTrip novyTrip;
    @FXML
    private Button vyp_trip;
    @FXML
    private Button zbt;
    @FXML
    private Button vrat;
    @FXML
    private TextField nt;
    @FXML
    private TextArea ta;
    @FXML
    private Label s_pen;
    @FXML
    private Label nak_naces;
    @FXML
    private Label kil_naces;
    @FXML
    private Label cas_naces;

    /**
     *vypisovanie všetkých onformácií o výlete
     * v tejto časti je použité RTTI
     * konkrétne tu ta.appendText(novyTrip.getCestainorder().get(i).getClass().getSimpleName() + "\n");
     */
    public void vypis_trip(ActionEvent event) throws IOException {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        novyTrip = (NovyTrip) stage.getUserData();
        novyTrip.setNaklady_na_cestu(-novyTrip.getNaklady_na_cestu());
        novyTrip.setCas_straveny_na_ceste(-novyTrip.getCas_straveny_na_ceste());
        novyTrip.setPocet_prejdutych_kilometrov(-novyTrip.getPocet_prejdutych_kilometrov());
        for (int i = 0; i < novyTrip.getCestainorder().size(); i++) {
            ta.appendText(novyTrip.getCestainorder().get(i).getClass().getSimpleName() + "\n");
            if (novyTrip.getCestainorder().get(i) == novyTrip.getBratislava()) {
                for (int k = 0; k < novyTrip.getBratislava_info().size(); k++) {
                    ;
                    ta.appendText(novyTrip.getBratislava_info().get(k));

                }
                if (i != novyTrip.getCestainorder().size() - 1)
                    novyTrip.setNadstaveniaCesty(novyTrip.getBratislava_info().get(novyTrip.getBratislava_info().size() - 1));
            }
            if (novyTrip.getCestainorder().get(i) == novyTrip.getTrencin()) {
                for (int k = 0; k < novyTrip.getTrencin_info().size(); k++) {
                    ;
                    ta.appendText(novyTrip.getTrencin_info().get(k));

                }
                if (i != novyTrip.getCestainorder().size() - 1)
                    novyTrip.setNadstaveniaCesty(novyTrip.getTrencin_info().get(novyTrip.getTrencin_info().size() - 1));

            }
            if (novyTrip.getCestainorder().get(i) == novyTrip.getZilina()) {
                for (int k = 0; k < novyTrip.getZilina_info().size(); k++) {
                    ;
                    ta.appendText(novyTrip.getZilina_info().get(k));

                }
                if (i != novyTrip.getCestainorder().size() - 1)
                    novyTrip.setNadstaveniaCesty(novyTrip.getZilina_info().get(novyTrip.getZilina_info().size() - 1));

            }
            if (novyTrip.getCestainorder().get(i) == novyTrip.getTatry()) {
                for (int k = 0; k < novyTrip.getTatry_info().size(); k++) {
                    ;
                    ta.appendText(novyTrip.getTatry_info().get(k));

                }
                if (i != novyTrip.getCestainorder().size() - 1)
                    novyTrip.setNadstaveniaCesty(novyTrip.getTatry_info().get(novyTrip.getTatry_info().size() - 1));
            }
            if (novyTrip.getCestainorder().get(i) == novyTrip.getKosice()) {
                for (int k = 0; k < novyTrip.getKosice_info().size(); k++) {
                    ;
                    ta.appendText(novyTrip.getKosice_info().get(k));

                }
                if (i != novyTrip.getCestainorder().size() - 1)
                    novyTrip.setNadstaveniaCesty(novyTrip.getKosice_info().get(novyTrip.getKosice_info().size() - 1));

            }
        }

        s_pen.setText("Náklady na atrakcie a ubytovanie: "+Integer.toString(novyTrip.getPenazenka()));
        nak_naces.setText("Náklady na cestu"+Integer.toString(novyTrip.getNaklady_na_cestu()));
        kil_naces.setText("Počet prejdených kilometrov: "+Integer.toString(novyTrip.getPocet_prejdutych_kilometrov()));
        cas_naces.setText("Čas na ceste: "+String.format("%.2f",novyTrip.getCas_straveny_na_ceste()/60));



    }
    @FXML
    public void zvolit(ActionEvent event) throws IOException {
        NovyTripSerializer.serializeNovyTrip(novyTrip,nt.getText()+".ser");
        Parent doviParent = FXMLLoader.load(getClass().getResource("dovidenia.fxml"));
        Scene doviScene = new Scene(doviParent);
        Stage window = (Stage) vyp_trip.getScene().getWindow();
        window.setScene(doviScene);
        window.show();

    }
    @FXML
    private void vratit(ActionEvent event) throws IOException {
        Parent atrakcieParent = FXMLLoader.load(getClass().getResource("atrakcie.fxml"));
        Scene atrakcieScene = new Scene(atrakcieParent);
        Stage window = (Stage) vrat.getScene().getWindow();
        window.setScene(atrakcieScene);
        window.show();
    }
}


