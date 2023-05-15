package com.example.oop_projekt.Serializer;

import com.example.oop_projekt.NovyTrip.NovyTrip;

import java.io.*;

/**
 * triada slúži na serializácia a deserializáciu vyvorených výletov.
 */
public class NovyTripSerializer {
    /**
     * serializovanie nového tripu
     * @param novyTrip vytvorný trip ktorý chceme serializovať
     * @param fileName menu pod akým ho chceme mať uložený
     */
    public static void serializeNovyTrip(NovyTrip novyTrip, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(novyTrip);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * deserializácia tripu ktorý sme vytovorili
     * @param fileName názov  tripu
     * @return vracia daný trip
     */
    public static NovyTrip deserializeNovyTrip(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            NovyTrip deserializedTrip = (NovyTrip) in.readObject();
            in.close();
            fileIn.close();
            return deserializedTrip;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
