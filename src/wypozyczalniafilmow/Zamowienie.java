
package wypozyczalniafilmow;

/**
 *
 * @author Radek
 */
public class Zamowienie {
        
    public void wypozyczFilm(Pracownik pracownikWypozycz, Klient klientWypozycz, Film filmWypozycz)
    {
        if(filmWypozycz.getIloscEgzemplarzyNaStanie()>0)
        {
            if(klientWypozycz.getIloscWypozyczonych() < 2)
            {
                filmWypozycz.setIloscEgzemplarzyNaStanie(filmWypozycz.getIloscEgzemplarzyNaStanie() - 1);
                klientWypozycz.setIloscWypozyczonych(klientWypozycz.getIloscWypozyczonych() + 1);
                pracownikWypozycz.setIloscObsluzonychKlientow(pracownikWypozycz.getIloscObsluzonychKlientow() + 1);
                System.out.println("\nWypożyczono film: " + filmWypozycz.getNazwaFilmu()
                        + ", klientowi: " + klientWypozycz.getImie() + " " + klientWypozycz.getNazwisko()
                        + ", przez pracownika: " + pracownikWypozycz.getImie() + " " + pracownikWypozycz.getNazwisko() + "\n");
            }
            else
            {
                System.out.println("\nKlient " + klientWypozycz.getImie() + " " + klientWypozycz.getNazwisko()
                        + " wypożyczył już 2 filmy. Brak możliwości wypożyczenia większej ilości.\n");
            }
        }
        else
        {
            System.out.println("\nBrak egzemplarzy filmu " + filmWypozycz.getNazwaFilmu() + " na stanie wypozyczalni.\n");
        }
    }
        
    public void zwrocFilm(Pracownik pracownikZwroc, Klient klientZwroc, Film filmZwroc)
    {
        if(filmZwroc.getIloscEgzemplarzyNaStanie() < filmZwroc.getIloscEgzemplarzy())
        {
            if(klientZwroc.getIloscWypozyczonych() > 0)
            {
                klientZwroc.setIloscWypozyczonych(klientZwroc.getIloscWypozyczonych() - 1);
                filmZwroc.setIloscEgzemplarzyNaStanie(filmZwroc.getIloscEgzemplarzyNaStanie() + 1);
                pracownikZwroc.setIloscObsluzonychKlientow(pracownikZwroc.getIloscObsluzonychKlientow() + 1);
                System.out.println("\nZawrócono film: " + filmZwroc.getNazwaFilmu()
                        + ", przez klienta: " + klientZwroc.getImie() + " " + klientZwroc.getNazwisko()
                        + ". pracownikowi: " + pracownikZwroc.getImie() + " " + pracownikZwroc.getNazwisko());
            }
            else
            {
                System.out.println("\nKlient " + klientZwroc.getImie() + " " + klientZwroc.getNazwisko()
                        + " nie wypożyczył żadnego filmu.\n");
            }
        }
        else
        {
            System.out.println("\nŻaden egzemplarz filmu " + filmZwroc.getNazwaFilmu() + " nie został wypożyczony.\n");
        }
    }
    
}
