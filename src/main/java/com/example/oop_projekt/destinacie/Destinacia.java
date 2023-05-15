package com.example.oop_projekt.destinacie;

import com.example.oop_projekt.atrakcie.*;

import java.io.Serializable;

/**
 * Hlavná trida pre všetky destinácia(Trencin,Bratislava,atd..)
 * obsahuje vsebe triedy každého typu atrakcie, ak je v danej lokalite zvolená kontrétna atrakcia,
 * pomocou týchto funkcií sa vytvorí
 */
public class Destinacia implements Serializable {
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

    /**
     * V choice boxe si uživatel vyberie ubytovanie kde chce bývať, parameter vo forme stringu sa posle
     * do tejto funkcie a nadstaví ubytovanie v danej destinácií
     * @param ubytovanie ubytovanie v danej destinácii
     */
    public void setUbytovanie(String ubytovanie) {
        this.ubytovanie = ubytovanie;
    }

    public String getUbytovanie() {
        return ubytovanie;
    }

    public void setCena_ubytovania(int cena_ubytovania) {
        this.cena_ubytovania = cena_ubytovania;
    }

    public int getCena_ubytovania() {
        return cena_ubytovania;
    }

    /**
     * fukcia slúži na získavanie dĺžky trasy vo forme kilometrov medzi dovma kontrétnymi destináciami
     *
     * @param trasa vstupný parameter vo forme "dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12!140)"
     * @return vracia pdlzku trasy v kilomertoch vo forme intigeru
     */
    public int getKilometre(String trasa){

        return Integer.parseInt(trasa.substring(0,trasa.indexOf(".")));
    }
    /**
     * fukcia slúži na získavanie nákladov na trasu medzi dovma kontrétnymi destináciami
     *
     * @param trasa vstupný parameter vo forme "dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
     * @return vracia naklady na trasu vo forme intigeru
     */
    public int getCenatrasy(String trasa){

        return Integer.parseInt(trasa.substring(trasa.indexOf(".")+1,trasa.indexOf("!")));
    }
    /**
     * fukcia slúži na získavanie získavanie dlžky trasy v minútach medzi dovma kontrétnymi destináciami
     *
     * @param trasa vstupný parameter vo forme "dlzka v klimotreoch.naklady na trasu v eurach!d=lžka trasy v minútach napr(222.12.140)
     * @return vracia trasy vo forme intigeru
     */
    public int getDlzkatrasy(String trasa){

        return Integer.parseInt(trasa.substring(trasa.indexOf("!")+1,trasa.length()));
    }
}
