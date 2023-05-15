package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Tatry;
import com.example.oop_projekt.destinacie.Zilina;
/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class Turistika extends Atrakcia{
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setTuristikaVstupne(Zilina mesto) {setVstupne(0);}
    public void setTuristikaVstupne(Tatry mesto) {setVstupne(2);}
}
