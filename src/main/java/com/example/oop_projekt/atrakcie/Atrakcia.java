package com.example.oop_projekt.atrakcie;

import java.io.Serializable;

/**
 * Triadu atrakcia dedí každá atrakcia(lezenie,rafting,atd..)

 */
public class Atrakcia implements Serializable {
    /**
     * reprezentuje výšku vstupného na danú atrakciu
     */
    private int vstupne;

    public void setVstupne(int vstupne) {
        this.vstupne = vstupne;
    }

    public int getVstupne() {
        return vstupne;
    }
}
