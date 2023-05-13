package com.example.oop_projekt.destinacie;

import com.example.oop_projekt.atrakcie.*;

public class Destinacia {
    private Lezenie lezenie ;
    public Lezenie getLezenie(){
        return lezenie;
    }
    private Rafting rafting;
    public Rafting getRafting(){
        return rafting;
    }

    private SkokPadakom skokpadakom;
    public SkokPadakom getSkokpadakom(){
        return skokpadakom;
    }

    private Jaskyne jaskyne;

    public Jaskyne getJaskyne() {
        return jaskyne;
    }

    private Hrady hrady;

    public Hrady getHrady() {
        return hrady;
    }

    private Turistika turistika;

    public Turistika getTuristika() {
        return turistika;
    }

    private String ubytovanie="";
    private int cena_ubytovania = 0;


    public void setLezenie() {
        this.lezenie = new Lezenie();
    }
    public void setJaskyne() {
        this.jaskyne = new Jaskyne();
    }
    public void setHrady() {
        this.hrady = new Hrady();
    }


    public void setRafting() {
        this.rafting = new Rafting();
    }

    public void setSkokpadakom() {
        this.skokpadakom = new SkokPadakom();
    }
    public void setTuristika() {this.turistika = new Turistika();}

    public void setUbytovanie(String ubytovanie) {
        this.ubytovanie = ubytovanie;
    }

    public String getUbytovanie() {
        return ubytovanie;
    }

    public int getKilometre(String trasa){

        return Integer.parseInt(trasa.substring(0,trasa.indexOf(".")));
    }
    public int getCenatrasy(String trasa){

        return Integer.parseInt(trasa.substring(trasa.indexOf(".")+1,trasa.indexOf("!")));
    }
    public int getDlzkatrasy(String trasa){

        return Integer.parseInt(trasa.substring(trasa.indexOf("!")+1,trasa.length()));
    }
}
