package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Tatry;
import com.example.oop_projekt.destinacie.Zilina;

public class Turistika extends Atrakcia{
    public void setTuristikaVstupne(Zilina mesto) {setVstupne(0);}
    public void setTuristikaVstupne(Tatry mesto) {setVstupne(2);}
}
