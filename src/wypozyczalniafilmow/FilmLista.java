
package wypozyczalniafilmow;


import java.util.ArrayList;

/**
 *
 * @author Radek
 */
public class FilmLista implements Cloneable{
    
    private int liczbaFilmow;    
    public ArrayList <Film> filmyLista;
    
    
    public int getLiczbaFilmow() {
        return liczbaFilmow;
    }
    
    public void setLiczbaFilmow(int liczbaFilmow) {
        this.liczbaFilmow = liczbaFilmow;
    }
        
    public FilmLista()
    {
        this.filmyLista = new ArrayList<>();
    }
    
    public void dodajFilm(Film filmDodany)
    {
        this.filmyLista.add(filmDodany);
        this.liczbaFilmow++;
    }
    
    @Override
    public String toString()
    {
        String listaFilmowPokaz;
        listaFilmowPokaz = "Lista filmów:\n\n";
        for (int i = 0; i < liczbaFilmow; i++)
        {
            listaFilmowPokaz += filmyLista.get(i).toString() + "\n\n";
        }
        return listaFilmowPokaz;
    }
    
    public FilmLista kopiuj()
    {
        FilmLista inwentaryzacja = new FilmLista();
        inwentaryzacja.liczbaFilmow = this.liczbaFilmow;
        inwentaryzacja.filmyLista = (ArrayList<Film>) this.filmyLista.clone();
        return inwentaryzacja;
    }
        
}
