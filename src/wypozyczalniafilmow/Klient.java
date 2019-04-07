
package wypozyczalniafilmow;

/**
 *
 * @author Radek
 */
public class Klient extends Osoba{
    
    static int idBiezacyKlienta = 2000;
    int idKlienta = 0;
    private int iloscWypozyczonych;

    public int getIloscWypozyczonych() {
        return iloscWypozyczonych;
    }

    public void setIloscWypozyczonych(int iloscWypozyczonych) {
        this.iloscWypozyczonych = iloscWypozyczonych;
    }
    
    public Klient()
    {
        
    }
    
    public Klient(String imie, String nazwisko)
    {
        super(imie, nazwisko);
        this.idKlienta = idBiezacyKlienta;
        idBiezacyKlienta++;
        iloscWypozyczonych = 0;
    }
        
    @Override
    public String toString()
    {
        return "Klient: " + this.idKlienta + " " + this.getNazwisko() + " " + this.getImie()
                + "\nIlość wypożyczonych filmów: " + this.iloscWypozyczonych;
    }
    
}
