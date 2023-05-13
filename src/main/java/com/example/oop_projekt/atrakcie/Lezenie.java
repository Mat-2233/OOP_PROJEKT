package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Tatry;
import com.example.oop_projekt.destinacie.Trencin;

public class Lezenie extends  Atrakcia{

    public void setLezenieVstupne(Bratislava mesto) {setVstupne(15);}
    public void setLezenieVstupne(Trencin mesto) {setVstupne(8);}
    public void setLezenieVstupne(Tatry mesto) {setVstupne(0);}
}
