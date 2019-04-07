
package wypozyczalniafilmow;

/**
 *
 * @author Radek
 */
public class Pracownik extends Osoba{
    
    static int idBiezacyPracownika = 1000;
    int idPracownika = 0;
    private int iloscObsluzonychKlientow;

    public int getIloscObsluzonychKlientow() {
        return iloscObsluzonychKlientow;
    }

    public void setIloscObsluzonychKlientow(int iloscObsluzonychKlientow) {
        this.iloscObsluzonychKlientow = iloscObsluzonychKlientow;
    }    
    
    public Pracownik()
    {
        
    }

    public Pracownik(String imie, String nazwisko)
    {
        super(imie, nazwisko);
        this.idPracownika = idBiezacyPracownika;
        idBiezacyPracownika++;
        iloscObsluzonychKlientow = 0;
    }
    
    @Override
    public String toString()
    {
        return "Pracownik: " + this.idPracownika + " " + this.getNazwisko() + " " + this.getImie()
                + "\nIlość obsłużonych klientów: " + this.iloscObsluzonychKlientow;
    }
    
}
