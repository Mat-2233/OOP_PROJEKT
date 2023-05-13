package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Zilina;


public class SkokPadakom extends Atrakcia {
    public void setSkokpadakomVstupne(Bratislava mesto) {setVstupne(315);}
    public void setSkokpadakomVstupne(Zilina mesto) {setVstupne(170);}
    public void setSkokpadakomVstupne(Kosice mesto) {setVstupne(230);}

}
