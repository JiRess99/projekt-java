package cz.project;

import java.util.ArrayList;
import java.util.List;

public class SpravceOsob {
    private List<PojistenaOsoba> pojistenaOsobaList;

    public SpravceOsob() {
        pojistenaOsobaList = new ArrayList<>();
    }

    //přidání pojištěné osoby
    public void PojistenaOsobaListAdd(PojistenaOsoba pojistenaOsoba){
        pojistenaOsobaList.add(pojistenaOsoba);
    }

    //Výpis všech osob ze seznamu
    public void VypisPojistenaOsobaList(){
        for(PojistenaOsoba pojistenaOsoba : pojistenaOsobaList){
            System.out.println(pojistenaOsoba);
        }
    }

    //Výpis osoby dle zadaného parametru jméno, přijmení
    public void VyhledatPojistenaOsobaList(String jmeno, String prijmeni){
        PojistenaOsoba nalezenaOsoba = null;
        for(PojistenaOsoba pojistenaOsoba : pojistenaOsobaList) {
            if (jmeno.equals(pojistenaOsoba.getJmeno()) && prijmeni.equals(pojistenaOsoba.getPrijmeni())) {
                nalezenaOsoba = pojistenaOsoba;
            }
        }
        if(nalezenaOsoba != null){
            System.out.println(nalezenaOsoba);
        }
        else{
            System.out.println("Osoba nenalezena!");
        }
    }
}
