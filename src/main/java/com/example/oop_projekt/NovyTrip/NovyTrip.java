package com.example.oop_projekt.NovyTrip;

import com.example.oop_projekt.Invl_exp.Invalid_expection;
import com.example.oop_projekt.destinacie.*;
import com.example.oop_projekt.obs_implem.Observer;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.io.*;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Hlavná trieda nový trip, v ktorej sa ukladajú všetky informácie o našom výlete.
 * Tento vyvorený objekt sa následne serialzuje, aby sa mohol uževatel do neho vrátiť.
 */
public class NovyTrip implements Serializable{
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean lezenie = false;
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean rafting = false;
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean skokpadakom = false;
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean jaskyne = false;
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean turistika = false;
     /**
      * pomocna premenna pri vytváraní nových obejktov, využíva sa pri GUI
      */
     private boolean hrad = false;


     /**
      * v tejto premennej ukladáme mód ktorý si uživatel zvolil(LOW,HIGH)
      */ private String mod;


     /**
      * v tejto premennej ukladáme celkové náklady na ubytovanie a atrakcie
      */private int penazenka =0;
     /**
      * v tejto premennej ukladáme celkové náklady na cestu
      */
      private int naklady_na_cestu=0;
     /**
      * v tejto premennej ukladáme pocet prejdených kilometrov na ceste
      */
      private int pocet_prejdutych_kilometrov=0;
     /**
      * v tejto premennej ukladáme celkový čas stávený na ceste
      */
     private double cas_straveny_na_ceste=0;

     /**
      * pomocna prene na uloženie všetkých destinácií
      */
     private ArrayList<Destinacia> lokality=new ArrayList<>() ;

     /**
      * pomocna prene na uloženie počiatočnej destinácie
      */
     private Destinacia pociatocnadestinacia;

     /**
      * slúži na uloženie cesty v poradí akú vygenerovala aplikácia
      */
     private  ArrayList<Destinacia> cestainorder=new ArrayList<>() ;
     /**
      * pokial si uživatel zvolí túto destiníciu vytvorý sa príslúšný objekt tejto destinácie
      */
     private Trencin trencin;
     /**
      * pokial si uživatel zvolí túto destiníciu vytvorý sa príslúšný objekt tejto destinácie
      */
     private Bratislava bratislava;
     /**
      * pokial si uživatel zvolí túto destiníciu vytvorý sa príslúšný objekt tejto destinácie
      */
     private Zilina zilina;
     /**
      * pokial si uživatel zvolí túto destiníciu vytvorý sa príslúšný objekt tejto destinácie
      */
     private Tatry tatry;
     /**
      * pokial si uživatel zvolí túto destiníciu vytvorý sa príslúšný objekt tejto destinácie
      */
     private Kosice kosice;

     public Tatry getTatry() {
          return tatry;
     }

     public Trencin getTrencin() {
          return trencin;
     }

     public Bratislava getBratislava() {
          return bratislava;
     }

     public Zilina getZilina() {
          return zilina;
     }

     public Kosice getKosice() {
          return kosice;
     }

     public ArrayList<Destinacia> getLokality() {
          return lokality;
     }

     public double getCas_straveny_na_ceste() {
          return cas_straveny_na_ceste;
     }

     public int getNaklady_na_cestu() {
          return naklady_na_cestu;
     }

     public int getPocet_prejdutych_kilometrov() {
          return pocet_prejdutych_kilometrov;
     }

     public void setNaklady_na_cestu(int naklady_na_cestu) {
          this.naklady_na_cestu+= naklady_na_cestu;
     }

     public void setCas_straveny_na_ceste(double cas_straveny_na_ceste) {
          this.cas_straveny_na_ceste+= cas_straveny_na_ceste;
     }

     public void setPocet_prejdutych_kilometrov(int pocet_prejdutých_kilometrov) {
          this.pocet_prejdutych_kilometrov+= pocet_prejdutých_kilometrov;
     }

     public void setLezenie() {
          this.lezenie = !lezenie;
     }

     public void setRafting() {
          this.rafting = !rafting;
     }

     public void setSkokpadakom() {
          this.skokpadakom = !skokpadakom;
     }

     public void setJaskyne() {
          this.jaskyne = !jaskyne;
     }

     public void setTuristika() {
          this.turistika = !turistika;
     }

     public void setHrad() {
          this.hrad = !hrad;
     }
     public boolean getLezenie() {
          return this.lezenie;
     }
     public boolean getRafting() {
          return this.rafting;
     }
     public boolean getSkokpadakom() {
          return this.skokpadakom;
     }
     public boolean getTuristika() {
          return this.turistika;
     }
     public boolean getJaskyne() {
          return this.jaskyne;
     }
     public boolean getHrad() {
          return this.hrad;
     }




     public ArrayList<Destinacia> getCestainorder() {
          return cestainorder;
     }

     /**
      * Aplikovanie vlastnej podmienky,na overenie,či si užívatel zvolil aspoň jednu atrakciu
      * @throws Invalid_expection vypíše pokial uživatel nezvolil žiadnu atrakciu
      */
     public void Overenie1() throws Invalid_expection {
          if(!lezenie && !rafting && !skokpadakom && !hrad && !turistika && !jaskyne)
               throw new Invalid_expection("Nezvolili ste žiadnu atrakci");


}
     public void Overenie2(CheckBox a,CheckBox b,CheckBox c,CheckBox d,CheckBox e) throws Invalid_expection {
          if(a.isSelected()||b.isSelected()||c.isSelected()||d.isSelected()||e.isSelected())
               lezenie=lezenie;
          else
               throw new Invalid_expection("Nezvolili ste žiadnu destinaciu");


     }

     /**
      * aplikovanie lambda výrazu, uživatel si zvolí počiatočnú destináciua
      * a uloží do premennej
       * @param pociatocnadestinacia
      */
     public void setPociatocnadestinacia(String pociatocnadestinacia) {
          switch (pociatocnadestinacia) {
               case "Trencin" -> {
                    this.pociatocnadestinacia = trencin;
               }
               case "Bratislava" -> {
                    this.pociatocnadestinacia = bratislava;
               }
               case "Zilina" -> {
                    this.pociatocnadestinacia = zilina;
               }
               case "Kosice" -> {
                    this.pociatocnadestinacia = kosice;
               }
               case "Tatry" -> {
                    this.pociatocnadestinacia = tatry;
               }
          }
     }

     public Destinacia getPociatocnadestinacia() {
          return pociatocnadestinacia;
     }



     public void setMod(String mod) {
          this.mod = mod;
     }

     public String getMod() {
          return mod;
     }

     public void setPenazenka(int penazenka) {
          this.penazenka += penazenka;
     }

     public int getPenazenka() {
          return penazenka;
     }

     /**
      * ArrayList Observeru
      */
     private final ArrayList<Observer> BudgetFollowers = new ArrayList<>();

     /**
      * vyvolanie funkciíi všetkých observerov
      * @param label
      */
     public void InformInformationPanel(Label label) {
          for (Observer observer : BudgetFollowers)
               observer.inform(label);
     }

     /**
      * pridanie nového observera
      * @param observer
      */
     public void Informer(Observer observer) {
          BudgetFollowers.add(observer);
     }


     /**
      * funkcia na vytvorenie objektu zvolenej destinácia a objektov atrkcií v danej destinácií.
      * Následne nadstavenie výšky vstupnehé na daných atrakciach a pridanie do peňaženky
      * @param tlbox
      * @param trbox
      * @param thbox
      */
     public  void tn(CheckBox tlbox,CheckBox trbox,CheckBox thbox){
          trencin=new Trencin();
          lokality.add(trencin);

          if(tlbox.isSelected())
               trencin.setLezenie();
          if(trbox.isSelected())
               trencin.setRafting();
          if(thbox.isSelected())
               trencin.setHrady();
     trencin.setTNAtrakcieValue();
          if (trencin.getLezenie() != null)
               setPenazenka(trencin.getLezenie().getVstupne());
          if (trencin.getRafting() != null)
               setPenazenka(trencin.getRafting().getVstupne());
          if (trencin.getHrady() != null)
               setPenazenka(trencin.getHrady().getVstupne());



     }

     /**
      * funkcia na vytvorenie objektu zvolenej destinácia a objektov atrkcií v danej destinácií.
      *       * Následne nadstavenie výšky vstupnehé na daných atrakciach a pridanie do peňaženky
      * @param blbox
      * @param brbox
      * @param bspbox
      */
     public  void bt(CheckBox blbox,CheckBox brbox,CheckBox bspbox){

          bratislava=new Bratislava();
          lokality.add(bratislava);
          if(blbox.isSelected())
               bratislava.setLezenie();
          if(brbox.isSelected())
               bratislava.setRafting();
          if(bspbox.isSelected())
               bratislava.setSkokpadakom();

          bratislava.setBAAtrakcieValue();
          if (bratislava.getLezenie() != null)
               setPenazenka(bratislava.getLezenie().getVstupne());
          if (bratislava.getRafting() != null)
               setPenazenka(bratislava.getRafting().getVstupne());
          if (bratislava.getSkokpadakom() != null)
               setPenazenka(bratislava.getSkokpadakom().getVstupne());


     }

     /**
      * funkcia na vytvorenie objektu zvolenej destinácia a objektov atrkcií v danej destinácií.
      *       * Následne nadstavenie výšky vstupnehé na daných atrakciach a pridanie do peňaženky
      * @param ztbox
      * @param zjbox
      * @param zspbox
      */
     public  void za(CheckBox ztbox,CheckBox zjbox,CheckBox zspbox){

          zilina=new Zilina();
          lokality.add(zilina);
          if(ztbox.isSelected())
               zilina.setTuristika();
          if(zjbox.isSelected())
               zilina.setJaskyne();
          if(zspbox.isSelected())
               zilina.setSkokpadakom();

          zilina.setZAAtrakcieValue();
          if (zilina.getTuristika() != null)
               setPenazenka(zilina.getTuristika().getVstupne());
          if (zilina.getJaskyne() != null)
               setPenazenka(zilina.getJaskyne().getVstupne());
          if (zilina.getSkokpadakom() != null)
               setPenazenka(zilina.getSkokpadakom().getVstupne());



     }

     /**
      * funkcia na vytvorenie objektu zvolenej destinácia a objektov atrkcií v danej destinácií.
      * Následne nadstavenie výšky vstupnehé na daných atrakciach a pridanie do peňaženky
       * @param ttjbox
      * @param tttbox
      * @param ttlbox
      */
      public  void tt(CheckBox ttjbox,CheckBox tttbox,CheckBox ttlbox){

          tatry=new Tatry();
          lokality.add(tatry);
          if(ttjbox.isSelected())
               tatry.setJaskyne();
          if(tttbox.isSelected())
               tatry.setTuristika();
          if(ttlbox.isSelected())
               tatry.setLezenie();

          tatry.setTTAtrakcieValue();

          if (tatry.getJaskyne() != null)
               setPenazenka(tatry.getJaskyne().getVstupne());
          if (tatry.getTuristika() != null)
               setPenazenka(tatry.getTuristika().getVstupne());
          if (tatry.getLezenie() != null)
               setPenazenka(tatry.getLezenie().getVstupne());



     }

     /**
      * funkcia na vytvorenie objektu zvolenej destinácia a objektov atrkcií v danej destinácií.
      * Následne nadstavenie výšky vstupnehé na daných atrakciach a pridanie do peňaženky
      * @param ksbox
      * @param khbox
      * @param kjbox
      */
     public  void ks(CheckBox ksbox,CheckBox khbox,CheckBox kjbox){

          kosice=new Kosice();
          lokality.add(kosice);
          if(ksbox.isSelected())
               kosice.setSkokpadakom();
          if(khbox.isSelected())
               kosice.setHrady();
          if(kjbox.isSelected())
               kosice.setJaskyne();

          kosice.setKSAtrakcieValue();

          if (kosice.getSkokpadakom() != null)
               setPenazenka(kosice.getSkokpadakom().getVstupne());
          if (kosice.getHrady() != null)
               setPenazenka(kosice.getHrady().getVstupne());
          if (kosice.getJaskyne() != null)
               setPenazenka(kosice.getJaskyne().getVstupne());



     }

     /**
      * funkci dostáva na vstupe string, vďaka jeho tvaru z neho dostane 3 parametre a pripočíta ich už k exiztujúcim
      * @param string vo forme "Cesta do ďaľšej destíjácie má 132 kilometrov, bude trvať 5 minút a nákaldy na ňu búdú 20"
      */
     public void setNadstaveniaCesty(String string){
          setPocet_prejdutych_kilometrov(Integer.parseInt(string.substring(string.indexOf("má ")+3,string.indexOf(" kilo"))));
          setCas_straveny_na_ceste(Double.parseDouble(string.substring(string.indexOf("ať ")+3,string.indexOf(" minút"))));
          setNaklady_na_cestu(Integer.parseInt(string.substring(string.indexOf("dú ")+3,string.indexOf("\n"))));
     }

     /**
      * funkcia na zoradenie destinácií v poradí, takým štýlom že, výdy porovnáva ktorá z nasledujúcich destinácií
      * je najbližie a tú vloži do pola cesta in order, rozhoduje aj na základe zvoleného módu
      */
     public void setCesta() {
          ArrayList<Destinacia> helper = new ArrayList<>(lokality);
          cestainorder.clear();
          cestainorder.add(pociatocnadestinacia);
          helper.remove(pociatocnadestinacia);
          int pomoc_i = 500;
          Destinacia pomoc_t = new Destinacia();
          int index = 0;
          while (!helper.isEmpty()) {
               for (int i = 0; i < helper.size(); i++) {
                    if (mod.equals("HIGH")) {
                         if (Objects.equals(pociatocnadestinacia, trencin)) {
                              if (helper.get(i).equals(bratislava)) {
                                   if (trencin.getKilometre(trencin.getTn_to_ba_high()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_ba_high());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (trencin.getKilometre(trencin.getTn_to_za_high()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_za_high());
                                        pomoc_t = zilina;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (trencin.getKilometre(trencin.getTn_to_tt_high()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_tt_high());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (trencin.getKilometre(trencin.getTn_to_ks_high()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_ks_high());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, bratislava)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_tn_high()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_tn_high());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_za_high()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_za_high());
                                        pomoc_t = zilina;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_tt_high()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_tt_high());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_ks_high()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_ks_high());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, zilina)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (zilina.getKilometre(zilina.getZa_to_tn_high()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_tn_high());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (zilina.getKilometre(zilina.getZa_to_ba_high()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_ba_high());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (zilina.getKilometre(zilina.getZa_to_tt_high()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_tt_high());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (zilina.getKilometre(zilina.getZa_to_ks_high()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_ks_high());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, kosice)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (kosice.getKilometre(kosice.getKs_to_tn_high()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_tn_high());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (kosice.getKilometre(kosice.getKs_to_ba_high()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_ba_high());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (kosice.getKilometre(kosice.getKs_to_tt_high()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_tt_high());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (kosice.getKilometre(kosice.getKs_to_za_high()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_za_high());
                                        pomoc_t = zilina;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, tatry)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (tatry.getKilometre(tatry.getTt_to_tn_high()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_tn_high());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (tatry.getKilometre(tatry.getTt_to_ba_high()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_ba_high());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (tatry.getKilometre(tatry.getTt_to_ks_high()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_ks_high());
                                        pomoc_t = kosice;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (tatry.getKilometre(tatry.getTt_to_za_high()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_za_high());
                                        pomoc_t = zilina;
                                   }
                              }
                         }


                    }
                    if (mod.equals("LOW")) {
                         if (Objects.equals(pociatocnadestinacia, trencin)) {
                              if (helper.get(i).equals(bratislava)) {
                                   if (trencin.getKilometre(trencin.getTn_to_ba_low()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_ba_low());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (trencin.getKilometre(trencin.getTn_to_za_low()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_za_low());
                                        pomoc_t = zilina;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (trencin.getKilometre(trencin.getTn_to_tt_low()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_tt_low());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (trencin.getKilometre(trencin.getTn_to_ks_low()) < pomoc_i) {
                                        pomoc_i = trencin.getKilometre(trencin.getTn_to_ks_low());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, bratislava)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_tn_low()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_tn_low());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_za_low()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_za_low());
                                        pomoc_t = zilina;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_tt_low()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_tt_low());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (bratislava.getKilometre(bratislava.getBa_to_ks_low()) < pomoc_i) {
                                        pomoc_i = bratislava.getKilometre(bratislava.getBa_to_ks_low());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, zilina)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (zilina.getKilometre(zilina.getZa_to_tn_low()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_tn_low());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (zilina.getKilometre(zilina.getZa_to_ba_low()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_ba_low());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (zilina.getKilometre(zilina.getZa_to_tt_low()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_tt_low());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (zilina.getKilometre(zilina.getZa_to_ks_low()) < pomoc_i) {
                                        pomoc_i = zilina.getKilometre(zilina.getZa_to_ks_low());
                                        pomoc_t = kosice;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, kosice)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (kosice.getKilometre(kosice.getKs_to_tn_low()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_tn_low());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (kosice.getKilometre(kosice.getKs_to_ba_low()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_ba_low());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(tatry)) {
                                   if (kosice.getKilometre(kosice.getKs_to_tt_low()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_tt_low());
                                        pomoc_t = tatry;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (kosice.getKilometre(kosice.getKs_to_za_low()) < pomoc_i) {
                                        pomoc_i = kosice.getKilometre(kosice.getKs_to_za_low());
                                        pomoc_t = zilina;
                                   }
                              }
                         }
                         if (Objects.equals(pociatocnadestinacia, tatry)) {
                              if (helper.get(i).equals(trencin)) {
                                   if (tatry.getKilometre(tatry.getTt_to_tn_low()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_tn_low());
                                        pomoc_t = trencin;
                                   }
                              }
                              if (helper.get(i).equals(bratislava)) {
                                   if (tatry.getKilometre(tatry.getTt_to_ba_low()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_ba_low());
                                        pomoc_t = bratislava;
                                   }
                              }
                              if (helper.get(i).equals(kosice)) {
                                   if (tatry.getKilometre(tatry.getTt_to_ks_low()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_ks_low());
                                        pomoc_t = kosice;
                                   }
                              }
                              if (helper.get(i).equals(zilina)) {
                                   if (tatry.getKilometre(tatry.getTt_to_za_low()) < pomoc_i) {
                                        pomoc_i = tatry.getKilometre(tatry.getTt_to_za_low());
                                        pomoc_t = zilina;
                                   }
                              }
                         }


                    }
               }
               cestainorder.add(pomoc_t);
               helper.remove(pomoc_t);
               pociatocnadestinacia = pomoc_t;
               index += pomoc_i;
               pomoc_i = 500;


               }

          }

     /**
      * Funkcia vracia infromácie o danej destinácií,Zvolené ubytovanie a jeho cena, zvolené aktivity a ich cena
      * a informácie o ceste do ďaľšej destinácie
      * @return návratová hodnota je Arraylist stringov v ktorom sú uložené informácie o destinácié
      */
     public ArrayList<String> getBratislava_info(){
              ArrayList<String> ba_info=new ArrayList<String>();
              ba_info.add("Ubytovanie: "+bratislava.getUbytovanie()+" cena ubytovania: "+Integer.toString(bratislava.getCena_ubytovania())+"\n");
              if (bratislava.getSkokpadakom()!=null){
                   ba_info.add("Skokpadakom  cena: "+Integer.toString(bratislava.getSkokpadakom().getVstupne())+"\n");}
              if (bratislava.getLezenie()!=null){
                   ba_info.add("Lezenie  cena: "+Integer.toString(bratislava.getLezenie().getVstupne())+"\n");}
              if (bratislava.getRafting()!=null){
                   ba_info.add("Rafting  cena: "+Integer.toString(bratislava.getRafting().getVstupne())+"\n");}
          if(mod.equals("HIGH")){
             if(cestainorder.indexOf(bratislava)< cestainorder.size()-1){
                  if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==trencin){
                       ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_tn_high())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_tn_high())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_tn_high())+"\n");
                  }
                  if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==zilina){
                       ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_za_high())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_za_high())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_za_high())+"\n");
                  }
                  if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==tatry){
                       ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_tt_high())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_tt_high())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_tt_high())+"\n");
                  }
                  if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==kosice){
                       ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_ks_high())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_ks_high())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_ks_high())+"\n");
                  }

             }
          }
              if(mod.equals("LOW")){
                   if(cestainorder.indexOf(bratislava)< cestainorder.size()-1){
                        if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==trencin){
                             ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_tn_low())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_tn_low())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_tn_low())+"\n");
                        }
                        if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==zilina){
                             ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_za_low())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_za_low())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_za_low())+"\n");
                        }
                        if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==tatry){
                             ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_tt_low())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_tt_low())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_tt_low())+"\n");
                        }
                        if(cestainorder.get(cestainorder.indexOf(bratislava)+1)==kosice){
                             ba_info.add("Cesta do ďaľšej destíjácie má "+bratislava.getKilometre(bratislava.getBa_to_ks_low())+" kilometrov, bude trvať "+bratislava.getDlzkatrasy(bratislava.getBa_to_ks_low())+" minút a nákaldy na ňu búdú "+bratislava.getCenatrasy(bratislava.getBa_to_ks_low())+"\n");
                        }
                   }
              }


          return ba_info;
         }


     /**
      * Funkcia vracia infromácie o danej destinácií,Zvolené ubytovanie a jeho cena, zvolené aktivity a ich cena
      * a informácie o ceste do ďaľšej destinácie
      * @return návratová hodnota je Arraylist stringov v ktorom sú uložené informácie o destinácié
      */
     public ArrayList<String> getTrencin_info(){
          ArrayList<String> tn_info=new ArrayList<String>();
          tn_info.add("Ubytovanie: "+trencin.getUbytovanie()+" cena ubytovania: "+Integer.toString(trencin.getCena_ubytovania())+"\n");
          if (trencin.getHrady()!=null){
               tn_info.add("Návšteva hradu  cena: "+Integer.toString(trencin.getHrady().getVstupne())+"\n");}
          if (trencin.getLezenie()!=null){
               tn_info.add("Lezenie  cena: "+Integer.toString(trencin.getLezenie().getVstupne())+"\n");}
          if (trencin.getRafting()!=null){
               tn_info.add("Rafting  cena: "+Integer.toString(trencin.getRafting().getVstupne())+"\n");}

          if(mod.equals("HIGH")){
               if(cestainorder.indexOf(trencin)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==bratislava){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_ba_high())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_ba_high())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_ba_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==zilina){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_za_high())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_za_high())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_za_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==tatry){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_tt_high())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_tt_high())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_tt_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==kosice){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_ks_high())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_ks_high())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_ks_high())+"\n");
                    }
               }
          }
          if(mod.equals("LOW")){
               if(cestainorder.indexOf(trencin)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==bratislava){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_ba_low())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_ba_low())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_ba_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==zilina){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_za_low())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_za_low())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_za_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==tatry){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_tt_low())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_tt_low())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_tt_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(trencin)+1)==kosice){
                         tn_info.add("Cesta do ďaľšej destíjácie má "+trencin.getKilometre(trencin.getTn_to_ks_low())+" kilometrov, bude trvať "+trencin.getDlzkatrasy(trencin.getTn_to_ks_low())+" minút a nákaldy na ňu búdú "+trencin.getCenatrasy(trencin.getTn_to_ks_low())+"\n");
                    }
               }
          }

          return tn_info;
     }

     /**
      * Funkcia vracia infromácie o danej destinácií,Zvolené ubytovanie a jeho cena, zvolené aktivity a ich cena
      * a informácie o ceste do ďaľšej destinácie
      * @return návratová hodnota je Arraylist stringov v ktorom sú uložené informácie o destinácié
      */
     public ArrayList<String> getZilina_info(){
          ArrayList<String> za_info=new ArrayList<String>();
          za_info.add("Ubytovanie: "+zilina.getUbytovanie()+" cena ubytovania: "+Integer.toString(zilina.getCena_ubytovania())+"\n");
          if (zilina.getJaskyne()!=null){
               za_info.add("Návšteva jaskyne  cena: "+Integer.toString(zilina.getJaskyne().getVstupne())+"\n");}
          if (zilina.getTuristika()!=null){
               za_info.add("Turistika  cena: "+Integer.toString(zilina.getTuristika().getVstupne())+"\n");}
          if (zilina.getSkokpadakom()!=null){
               za_info.add("Skok padákom  cena: "+Integer.toString(zilina.getSkokpadakom().getVstupne())+"\n");}

          if(mod.equals("HIGH")){
               if(cestainorder.indexOf(zilina)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==bratislava){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_ba_high())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_ba_high())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_ba_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==trencin){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_tn_high())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_tn_high())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_tn_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==tatry){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_tt_high())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_tt_high())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_tt_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==kosice){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_ks_high())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_ks_high())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_ks_high())+"\n");
                }
               }
          }
          if(mod.equals("LOW")){
               if(cestainorder.indexOf(zilina)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==bratislava){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_ba_low())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_ba_low())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_ba_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==trencin){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_tn_low())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_tn_low())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_tn_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==tatry){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_tt_low())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_tt_low())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_tt_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(zilina)+1)==kosice){
                         za_info.add("Cesta do ďaľšej destíjácie má "+zilina.getKilometre(zilina.getZa_to_ks_low())+" kilometrov, bude trvať "+zilina.getDlzkatrasy(zilina.getZa_to_ks_low())+" minút a nákaldy na ňu búdú "+zilina.getCenatrasy(zilina.getZa_to_ks_low())+"\n");
                    }
               }
          }

          return za_info;
     }

     /**
      * Funkcia vracia infromácie o danej destinácií,Zvolené ubytovanie a jeho cena, zvolené aktivity a ich cena
      * a informácie o ceste do ďaľšej destinácie
      * @return návratová hodnota je Arraylist stringov v ktorom sú uložené informácie o destinácié
      */
     public ArrayList<String> getTatry_info(){
          ArrayList<String> tt_info=new ArrayList<String>();
          tt_info.add("Ubytovanie: "+tatry.getUbytovanie()+" cena ubytovania: "+Integer.toString(tatry.getCena_ubytovania())+"\n");
          if (tatry.getJaskyne()!=null){
               tt_info.add("Návšteva jaskyne  cena: "+Integer.toString(tatry.getJaskyne().getVstupne())+"\n");}
          if (tatry.getTuristika()!=null){
               tt_info.add("Turistika  cena: "+Integer.toString(tatry.getTuristika().getVstupne())+"\n");}
          if (tatry.getLezenie()!=null){
               tt_info.add("Lezenie  cena: "+Integer.toString(tatry.getLezenie().getVstupne())+"\n");}

          if(mod.equals("HIGH")){
               if(cestainorder.indexOf(tatry)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==bratislava){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_ba_high())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_ba_high())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_ba_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==trencin){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_tn_high())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_tn_high())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_tn_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==zilina){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_za_high())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_za_high())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_za_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==kosice){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_ks_high())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_ks_high())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_ks_high())+"\n");
                    }
               }
          }
          if(mod.equals("LOW")){
               if(cestainorder.indexOf(tatry)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==bratislava){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_ba_low())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_ba_low())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_ba_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==trencin){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_tn_low())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_tn_low())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_tn_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==zilina){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_za_low())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_za_low())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_za_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(tatry)+1)==kosice){
                         tt_info.add("Cesta do ďaľšej destíjácie má "+tatry.getKilometre(tatry.getTt_to_ks_low())+" kilometrov, bude trvať "+tatry.getDlzkatrasy(tatry.getTt_to_ks_low())+" minút a nákaldy na ňu búdú "+tatry.getCenatrasy(tatry.getTt_to_ks_low())+"\n");
                    }
               }
          }

          return tt_info;
     }

     /**
      * Funkcia vracia infromácie o danej destinácií,Zvolené ubytovanie a jeho cena, zvolené aktivity a ich cena
      * a informácie o ceste do ďaľšej destinácie
      * @return návratová hodnota je Arraylist stringov v ktorom sú uložené informácie o destinácié
      */
     public ArrayList<String> getKosice_info(){
          ArrayList<String> ks_info=new ArrayList<String>();
          ks_info.add("Ubytovanie: "+kosice.getUbytovanie()+" cena ubytovania: "+Integer.toString(kosice.getCena_ubytovania())+"\n");
          if (kosice.getJaskyne()!=null){
               ks_info.add("Návšteva jaskyne  cena: "+Integer.toString(kosice.getJaskyne().getVstupne())+"\n");}
          if (kosice.getHrady()!=null){
               ks_info.add("Návšteva hradu  cena: "+Integer.toString(kosice.getHrady().getVstupne())+"\n");}
          if (kosice.getSkokpadakom()!=null){
               ks_info.add("Skok padákom cena: "+Integer.toString(kosice.getSkokpadakom().getVstupne())+"\n");}
          if(mod.equals("HIGH")){
               if(cestainorder.indexOf(kosice)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==bratislava){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_ba_high())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_ba_high())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_ba_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==trencin){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_tn_high())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_tn_high())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_tn_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==zilina){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_za_high())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_za_high())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_za_high())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==tatry){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_tt_high())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_tt_high())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_tt_high())+"\n");
                    }
               }
          }
          if(mod.equals("LOW")){
               if(cestainorder.indexOf(kosice)< cestainorder.size()-1){
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==bratislava){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_ba_low())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_ba_low())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_ba_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==trencin){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_tn_low())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_tn_low())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_tn_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==zilina){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_za_low())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_za_low())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_za_low())+"\n");
                    }
                    if(cestainorder.get(cestainorder.indexOf(kosice)+1)==tatry){
                         ks_info.add("Cesta do ďaľšej destíjácie má "+kosice.getKilometre(kosice.getKs_to_tt_low())+" kilometrov, bude trvať "+kosice.getDlzkatrasy(kosice.getKs_to_tt_low())+" minút a nákaldy na ňu búdú "+kosice.getCenatrasy(kosice.getKs_to_tt_low())+"\n");
                    }
               }
          }



          return ks_info;
     }


}




