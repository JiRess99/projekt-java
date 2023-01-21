package cz.project;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        SpravceOsob spravceOsob = new SpravceOsob();

        //Osoby pro nahrání do programu
        /*PojistenaOsoba osoba1 = new PojistenaOsoba("Jan", "Novák", 22, "605343666");
        PojistenaOsoba osoba2 = new PojistenaOsoba("Petr","Černý", 33,"737123654");
        PojistenaOsoba osoba3 = new PojistenaOsoba("David", "Nový", 44, "603343545");
        spravceOsob.PojistenaOsobaListAdd(osoba1);
        spravceOsob.PojistenaOsobaListAdd(osoba2);
        spravceOsob.PojistenaOsobaListAdd(osoba3);*/

        System.out.println("======================================");
        System.out.println("Evidence pojištěných osob");
        System.out.println("======================================");
        String pokracovat = "ano";//vstup do cyklu
        int volba;

        //Cyklus while, s podmínkou, která bude ovlivněna pouze vnitřní logikou pro ukončení
        while(pokracovat == "ano"){
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = Integer.parseInt(sc.nextLine());
            System.out.println("======================================");

            //Výběr funkce na základe logické funkce switch
            switch(volba){
                case 1:
                    System.out.println("Zadejte jméno:");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte věk");
                    int vek = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadejte telefonní číslo");
                    String telefon = sc.nextLine();
                    PojistenaOsoba pojistenaOsoba = new PojistenaOsoba(jmeno.trim(), prijmeni.trim(), vek, telefon.trim());
                    spravceOsob.PojistenaOsobaListAdd(pojistenaOsoba);
                break;
                case 2:
                    System.out.println("Výpis všech pojištěných osob:");
                    spravceOsob.VypisPojistenaOsobaList();
                    System.out.println("======================================");
                break;
                case 3:
                    System.out.println("Vyhledávání osob dle jména a příjmení");
                    System.out.println("Zadejte jméno:");
                    jmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    prijmeni = sc.nextLine();
                    spravceOsob.VyhledatPojistenaOsobaList(jmeno, prijmeni);
                    System.out.println("======================================");
                break;
                case 4:
                    System.out.println("Děkuji za použití aplikace");
                    System.out.println("======================================");
                    pokracovat = "";
                break;
            }
        }
    }
}