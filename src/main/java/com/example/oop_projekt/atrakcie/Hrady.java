package com.example.oop_projekt.atrakcie;

import com.example.oop_projekt.destinacie.Bratislava;
import com.example.oop_projekt.destinacie.Kosice;
import com.example.oop_projekt.destinacie.Trencin;



public class Hrady extends Atrakcia{

    public void setHradyVstupne(Kosice mesto) {setVstupne(9);}
    public void setHradyVstupne(Trencin mesto) {setVstupne(7);}
    public void setHradyVstupne(Bratislava mesto) {setVstupne(15);}
}
