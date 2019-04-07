
package wypozyczalniafilmow;

import java.util.ArrayList;

/**
 *
 * @author Radek
 */
public class PracownikLista {
    
    private int liczbaPracownikow;
    public ArrayList <Pracownik> pracownicyLista;

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public void setLiczbaPracownikow(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
    }
    
    public PracownikLista()
    {
        this.pracownicyLista = new ArrayList<>();
    }
    
    public void dodajPracownika(Pracownik pracownikDodany)
    {
        this.pracownicyLista.add(pracownikDodany);
        this.liczbaPracownikow++;
    }
    
    @Override
    public String toString()
    {
        String listaPracownikowPokaz;
        listaPracownikowPokaz = "Lista pracowników:\n\n";
        for (int i = 0; i < liczbaPracownikow; i++)
        {
            listaPracownikowPokaz += pracownicyLista.get(i).toString() + "\n\n";
        }
        return listaPracownikowPokaz;
    }
    
    
}
