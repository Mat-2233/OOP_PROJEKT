package com.example.oop_projekt;

import com.example.oop_projekt.destinacie.*;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.Objects;

public class NovyTrip {
     private boolean lezenie = false;
     private boolean rafting = false;

     private boolean skokpadakom = false;

     private boolean jaskyne = false;
     private boolean turistika = false;

     private boolean hrad = false;


     private String mod;

     private int penazenka =0;

     private ArrayList<Destinacia> lokality=new ArrayList<>() ;

     private Trencin trencin;
     private Bratislava bratislava;
     private Zilina zilina;
     private Tatry tatry;
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


     private Destinacia pociatocnadestinacia;
     private  ArrayList<Destinacia> cestainorder=new ArrayList<>() ;
     public void setPociatocnadestinacia(String pociatocnadestinacia) {
          if (Objects.equals(pociatocnadestinacia, "Trencin"))
               this.pociatocnadestinacia = trencin;
          if (Objects.equals(pociatocnadestinacia, "Bratislava"))
               this.pociatocnadestinacia = bratislava;
          if (Objects.equals(pociatocnadestinacia, "Zilina"))
               this.pociatocnadestinacia = zilina;
          if (Objects.equals(pociatocnadestinacia, "Kosice"))
               this.pociatocnadestinacia = kosice;
          if (Objects.equals(pociatocnadestinacia, "Tatry"))
               this.pociatocnadestinacia = tatry;

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

     //robenie ary listov
     /*public ArrayList<Boolean> getStatus(){
          ArrayList<Boolean> out = new ArrayList<Boolean>();
          out.add(lezenie);
          out.add(rafting);
          out.add(skokpadakom);


          return out;
     }*/
     public  void tn(CheckBox tlbox,CheckBox trbox,CheckBox thbox){
          trencin=new Trencin();
          lokality.add(trencin);

          if(tlbox.isSelected())
               trencin.setLezenie();
          if(trbox.isSelected())
               trencin.setRafting();
     trencin.setTNAtrakcieValue();
          if (trencin.getLezenie() != null)
               setPenazenka(trencin.getLezenie().getVstupne());
          if (trencin.getRafting() != null)
               setPenazenka(trencin.getRafting().getVstupne());
          if (trencin.getHrady() != null)
               setPenazenka(trencin.getHrady().getVstupne());



     }
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

          for (int j = 0; j < cestainorder.size(); j++) {
               System.out.println(cestainorder.get(j).getClass().getSimpleName());
          }
          System.out.println();

          }

     }


