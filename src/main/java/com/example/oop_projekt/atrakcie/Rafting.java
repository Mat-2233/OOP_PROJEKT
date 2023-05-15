package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Trencin;
/**
 * Dedí triedu Atrakckia, podla vstupnej destinácie nadstavuje výšku vstupného
 */
public class Rafting extends Atrakcia{
    /**
     * Nadstavenie vstupneho na zaklade vstupenho parametru
     * funkcia funguje ako visitor
     * @param mesto mesto v ktorom určujeme cenu
     */
    public void setRaftingVstupne(Bratislava mesto) {setVstupne(32);}
    public void setRaftingVstupne(Trencin mesto) {setVstupne(25);}

}
