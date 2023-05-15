package com.example.oop_projekt.obs_implem;

import com.example.oop_projekt.NovyTrip.NovyTrip;
import javafx.scene.control.Label;

import java.io.Serializable;

/**
 * slúži na ukazovanie stavu peňaženky, pomocou observeru
 */
public class Stav implements Observer, Serializable {
    private final NovyTrip trip;
    public Stav(NovyTrip trip) {this.trip = trip;}
    public void inform(Label label) {
        label.setText( "Stav peňaženky: "+ trip.getPenazenka() + " eur");
}
}
