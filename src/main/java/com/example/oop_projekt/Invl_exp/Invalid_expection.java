package com.example.oop_projekt.Invl_exp;

/**
 * definovanie vlastnej podmienky
 */
public class Invalid_expection extends Exception{
    public Invalid_expection(String invalidna){
        super(invalidna);
    }
}
