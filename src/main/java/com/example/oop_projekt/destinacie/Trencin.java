package com.example.oop_projekt.destinacie;

public class Trencin extends Destinacia {
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
