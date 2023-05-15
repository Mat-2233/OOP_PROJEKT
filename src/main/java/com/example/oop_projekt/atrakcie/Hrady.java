package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Trencin;


/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class Hrady extends Atrakcia{
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setHradyVstupne(Kosice mesto) {setVstupne(9);}
    public void setHradyVstupne(Trencin mesto) {setVstupne(7);}

}
