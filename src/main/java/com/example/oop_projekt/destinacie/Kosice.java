package com.example.oop_projekt.destinacie;


/**
 * obsahuje v sebe informácia o dlžke trasy , nákladoch na cestu a trvanie cesty v minútach
 * medzi kosicami a ostatnými destináciami vo forme LOW a HIGH.
 * informácie su uložené vo forme:"dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
 */
public class Kosice extends Destinacia {
    /**
     * ked sa používa táto funkcia
     * používatel už má zvolené destinácia aj atrakcie v nej, na základe toho
     * sa určí cena
     */
    public void setKSAtrakcieValue(){
        if(getJaskyne() != null)
            getJaskyne().setJaskyneVstupne(this);
        if(getHrady() != null)
            getHrady().setHradyVstupne(this);
        if(getSkokpadakom() != null)
            getSkokpadakom().setSkokpadakomVstupne(this);}
    private String ks_to_tt_low ="130.12!135";
    private String ks_to_tt_high ="140.16!90";

    private String ks_to_tn_low ="335.24!270";
    private String ks_to_tn_high ="82.7!51";

    private String ks_to_ba_low="400.30!350";
    private String ks_to_ba_high="440.40!310";

    private String ks_to_za_low="252.19!240";
    private String ks_to_za_high="330.29!210";

    public String getKs_to_ba_high() {
        return ks_to_ba_high;
    }

    public String getKs_to_ba_low() {
        return ks_to_ba_low;
    }

    public String getKs_to_tn_high() {
        return ks_to_tn_high;
    }

    public String getKs_to_tn_low() {
        return ks_to_tn_low;
    }

    public String getKs_to_tt_high() {
        return ks_to_tt_high;
    }

    public String getKs_to_tt_low() {
        return ks_to_tt_low;
    }

    public String getKs_to_za_high() {
        return ks_to_za_high;
    }

    public String getKs_to_za_low() {
        return ks_to_za_low;
    }
}
