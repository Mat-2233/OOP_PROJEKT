package com.example.oop_projekt.destinacie;


/**
 * obsahuje v sebe informácia o dlžke trasy , nákladoch na cestu a trvanie cesty v minútach
 * medzi tatramy a ostatnými destináciami vo forme LOW a HIGH.
 * informácie su uložené vo forme:"dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
 */
public class Tatry extends Destinacia{
    /**
     * ked sa používa táto funkcia
     * používatel už má zvolené destinácia aj atrakcie v nej, na základe toho
     * sa určí cena
     */
    public void setTTAtrakcieValue(){
        if(getJaskyne() != null)
            getJaskyne().setJaskyneVstupne(this);
        if(getTuristika() != null)
            getTuristika().setTuristikaVstupne(this);
        if(getLezenie() != null)
            getLezenie().setLezenieVstupne(this);}
    //pocet kilometrov, naklady na cestu ,a doba trvania v minutach
    private String tt_to_tn_low ="218.19!210";
    private String tt_to_tn_high ="215.24!150";

    private String tt_to_za_low ="142.9!140";
    private String tt_to_za_high ="134.12!110";

    private String tt_to_ba_low="330.23!310";
    private String tt_to_ba_high="315.30!215";

    private String tt_to_ks_low="130.12!135";
    private String tt_to_ks_high="140.16!90";

    public String getTt_to_ba_high() {
        return tt_to_ba_high;
    }

    public String getTt_to_ba_low() {
        return tt_to_ba_low;
    }

    public String getTt_to_ks_high() {
        return tt_to_ks_high;
    }

    public String getTt_to_ks_low() {
        return tt_to_ks_low;
    }

    public String getTt_to_tn_high() {
        return tt_to_tn_high;
    }

    public String getTt_to_tn_low() {
        return tt_to_tn_low;
    }

    public String getTt_to_za_high() {
        return tt_to_za_high;
    }

    public String getTt_to_za_low() {
        return tt_to_za_low;
    }
}
