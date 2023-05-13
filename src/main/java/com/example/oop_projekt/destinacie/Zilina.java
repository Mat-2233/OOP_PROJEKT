package com.example.oop_projekt.destinacie;

public class Zilina extends Destinacia{
    public void setZAAtrakcieValue(){
        if(getJaskyne() != null)
            getJaskyne().setJaskyneVstupne(this);
        if(getTuristika() != null)
            getTuristika().setTuristikaVstupne(this);
        if(getSkokpadakom() != null)
            getSkokpadakom().setSkokpadakomVstupne(this);}
    private String za_to_tt_low ="142.9!140";
    private String za_to_tt_high ="134.12!110";

    private String za_to_tn_low ="78.5!75";
    private String za_to_tn_high ="82.7!51";

    private String za_to_ba_low="230.15!240";
    private String za_to_ba_high="200.20!110";

    private String za_to_ks_low="252.19!240";
    private String za_to_ks_high="250.23!160";

    public String getZa_to_ba_high() {
        return za_to_ba_high;
    }

    public String getZa_to_ba_low() {
        return za_to_ba_low;
    }

    public String getZa_to_ks_high() {
        return za_to_ks_high;
    }

    public String getZa_to_ks_low() {
        return za_to_ks_low;
    }

    public String getZa_to_tn_high() {
        return za_to_tn_high;
    }

    public String getZa_to_tn_low() {
        return za_to_tn_low;
    }

    public String getZa_to_tt_high() {
        return za_to_tt_high;
    }

    public String getZa_to_tt_low() {
        return za_to_tt_low;
    }
}
