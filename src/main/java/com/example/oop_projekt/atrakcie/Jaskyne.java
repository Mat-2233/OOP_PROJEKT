package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.*;
/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class Jaskyne extends Atrakcia{
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setJaskyneVstupne(Zilina mesto) {setVstupne(8);}
    public void setJaskyneVstupne(Kosice mesto) {setVstupne(13);}
    public void setJaskyneVstupne(Tatry mesto) {setVstupne(20);}

}
