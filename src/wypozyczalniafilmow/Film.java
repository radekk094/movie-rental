
package wypozyczalniafilmow;

/**
 *
 * @author Radek
 */
public class Film {
        
    private String nazwaFilmu;
    private String gatunek;
    private String krajProdukcji;
    private int rokProdukcji;
    private int iloscEgzemplarzy;
    private int iloscEgzemplarzyNaStanie;
    
    static int idBiezacyFilmu = 3000;
    int idFilmu = 0;
    
    public String getNazwaFilmu() {
        return nazwaFilmu;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getKrajProdukcji() {
        return krajProdukcji;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
    
    public int getIloscEgzemplarzy() {
        return iloscEgzemplarzy;
    }
    
    public int getIloscEgzemplarzyNaStanie() {
        return iloscEgzemplarzyNaStanie;
    }

    public void setNazwaFilmu(String nazwaFilmu) {
        this.nazwaFilmu = nazwaFilmu;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setKrajProdukcji(String krajProdukcji) {
        this.krajProdukcji = krajProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    
    public void setIloscEgzemplarzy(int iloscEgzemplarzy) {
        this.iloscEgzemplarzy = iloscEgzemplarzy;
    }
    
    public void setIloscEgzemplarzyNaStanie(int iloscEgzemplarzyNaStanie) {
        this.iloscEgzemplarzyNaStanie = iloscEgzemplarzyNaStanie;
    }
    
    public Film()
    {
        
    }
    
    public Film(String nazwaFilmu, String gatunek, String krajProdukcji, int rokProdukcji, int iloscEgzemplarzy)
    {
        this.nazwaFilmu = nazwaFilmu;
        this.gatunek = gatunek;
        this.krajProdukcji = krajProdukcji;
        this.rokProdukcji = rokProdukcji;
        this.iloscEgzemplarzy = iloscEgzemplarzy;
        this.iloscEgzemplarzyNaStanie = this.iloscEgzemplarzy;
        idFilmu = idBiezacyFilmu;
        idBiezacyFilmu++;
    }
    
    
    @Override
    public String toString()
    {
        return "Pozycja: " + this.idFilmu + " " + this.nazwaFilmu + "; " + this.gatunek + ", " + this.krajProdukcji + " " + this.rokProdukcji
                + "\nIlość wszystkich egzamplerzy: " + this.iloscEgzemplarzy + "\nIlość egzamplerzy na stanie: " + this.iloscEgzemplarzyNaStanie;
    }
    
}
