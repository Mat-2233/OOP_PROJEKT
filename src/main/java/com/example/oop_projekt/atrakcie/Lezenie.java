package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Tatry;
import com.example.oop_projekt.destinacie.Trencin;

/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class Lezenie extends  Atrakcia{
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setLezenieVstupne(Bratislava mesto) {setVstupne(15);}
    public void setLezenieVstupne(Trencin mesto) {setVstupne(8);}
    public void setLezenieVstupne(Tatry mesto) {setVstupne(0);}
}
