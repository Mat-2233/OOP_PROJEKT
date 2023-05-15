package com.example.oop_projekt.destinacie;

import java.util.ArrayList;

/**
 * obsahuje v sebe informácia o dlžke trasy , nákladoch na cestu a trvanie cesty v minútach
 * medzi bratislavou a ostatnými destináciami vo forme LOW a HIGH.
 * informácie su uložené vo forme:"dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
 */
public class Bratislava extends Destinacia {
    //pocet kilometrov, naklady na cestu ,a doba trvania v minutach
    private String ba_to_tn_low ="123.11!120";
    private String ba_to_tn_high ="110.15!90";

    private String ba_to_za_low ="230.15!240";
    private String ba_to_za_high ="200.20!110";

    private String ba_to_tt_low="330.23!310";
    private String ba_to_tt_high="315.30!215";

    private String ba_to_ks_low="400.30!350";
    private String ba_to_ks_high="440.40!310";

    public String getBa_to_tn_high() {
        return ba_to_tn_high;
    }

    public String getBa_to_tn_low() {
        return ba_to_tn_low;
    }

    public String getBa_to_za_high() {
        return ba_to_za_high;
    }

    public String getBa_to_za_low() {
        return ba_to_za_low;
    }

    public String getBa_to_ks_high() {
        return ba_to_ks_high;
    }

    public String getBa_to_ks_low() {
        return ba_to_ks_low;
    }

    public String getBa_to_tt_high() {
        return ba_to_tt_high;
    }

    public String getBa_to_tt_low() {
        return ba_to_tt_low;
    }

    /**
     * ked sa používa táto funkcia
     * používatel už má zvolené destinácia aj atrakcie v nej, na základe toho
     * sa určí cena
     */
    public void setBAAtrakcieValue(){
    if(getRafting() != null)
        getRafting().setRaftingVstupne(this);
    if(getLezenie() != null)
        getLezenie().setLezenieVstupne(this);
    if(getSkokpadakom() != null)
        getSkokpadakom().setSkokpadakomVstupne(this);
}



}

