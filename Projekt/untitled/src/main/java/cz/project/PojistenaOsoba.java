package cz.project;

public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    //přístupové metody
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString(){
        return getJmeno() + " " + getPrijmeni() + " " + getVek() + " " + getTelefon();
    }
}

