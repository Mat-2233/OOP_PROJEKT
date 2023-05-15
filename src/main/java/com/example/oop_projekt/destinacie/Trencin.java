package com.example.oop_projekt.destinacie;

/**
 * obsahuje v sebe informácia o dlžke trasy , nákladoch na cestu a trvanie cesty v minútach
 * medzi trencinom a ostatnými destináciami vo forme LOW a HIGH.
 * informácie su uložené vo forme:"dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
 */
public class Trencin extends Destinacia {
    /**
     * ked sa používa táto funkcia
     * používatel už má zvolené destinácia aj atrakcie v nej, na základe toho
     * sa určí cena
     */
    public void setTNAtrakcieValue(){
        if(getLezenie() != null)
            getLezenie().setLezenieVstupne(this);
        if(getRafting() != null)
            getRafting().setRaftingVstupne(this);
        if(getHrady() != null)
            getHrady().setHradyVstupne(this);}
    private String tn_to_tt_low ="218.19!210";
    private String tn_to_tt_high ="215.24!150";

    private String tn_to_za_low ="78.5!75";
    private String tn_to_za_high ="82.7!51";

    private String tn_to_ba_low="123.11!120";
    private String tn_to_ba_high="110.15!90";

    private String tn_to_ks_low="335.24!270";
    private String tn_to_ks_high="330.29!210";

    public String getTn_to_ba_high() {
        return tn_to_ba_high;
    }

    public String getTn_to_ba_low() {
        return tn_to_ba_low;
    }

    public String getTn_to_ks_high() {
        return tn_to_ks_high;
    }

    public String getTn_to_ks_low() {
        return tn_to_ks_low;
    }

    public String getTn_to_tt_high() {
        return tn_to_tt_high;
    }

    public String getTn_to_tt_low() {
        return tn_to_tt_low;
    }

    public String getTn_to_za_high() {
        return tn_to_za_high;
    }

    public String getTn_to_za_low() {
        return tn_to_za_low;
    }
}
