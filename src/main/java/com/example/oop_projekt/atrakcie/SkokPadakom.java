package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Zilina;

import java.io.*;

/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class SkokPadakom extends Atrakcia {
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setSkokpadakomVstupne(Bratislava mesto) {setVstupne(315);}
    public void setSkokpadakomVstupne(Zilina mesto) {setVstupne(170);}
    public void setSkokpadakomVstupne(Kosice mesto) {setVstupne(230);}

}
