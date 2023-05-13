package com.example.oop_projekt.destinacie;

import java.util.ArrayList;

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

    public void setBAAtrakcieValue(){
    if(getRafting() != null)
        getRafting().setRaftingVstupne(this);
    if(getLezenie() != null)
        getLezenie().setLezenieVstupne(this);
    if(getSkokpadakom() != null)
        getSkokpadakom().setSkokpadakomVstupne(this);
}

    public void setDlzkakilometrov(Zilina mesto) {;}

/* public void bttest(){
        System.out.println(getLezenie());
        System.out.println(getLRafting());
        System.out.println(getSkokpadakom());


    }*/
}

