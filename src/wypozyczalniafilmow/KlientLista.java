
package wypozyczalniafilmow;

import java.util.ArrayList;

/**
 *
 * @author Radek
 */
public class KlientLista {
    
    private int liczbaKlientow;    
    public ArrayList <Klient> klienciLista;
    
    public int getLiczbaKlientow() {
        return liczbaKlientow;
    }

    public void setLiczbaKlientow(int liczbaKlientow) {
        this.liczbaKlientow = liczbaKlientow;
    }
    
    public KlientLista()
    {
        this.klienciLista = new ArrayList<>();
    }
    
    public void dodajKlienta (Klient klientDodany)
    {
        this.klienciLista.add(klientDodany);
        this.liczbaKlientow++;
    }
    
    @Override
    public String toString()
    {
        String listaKlientowPokaz;
        listaKlientowPokaz = "Lista klientów:\n\n";
        for (int i = 0; i < liczbaKlientow; i++)
        {
            listaKlientowPokaz += klienciLista.get(i).toString() + "\n\n";
        }
        return listaKlientowPokaz;
    }
    
}
