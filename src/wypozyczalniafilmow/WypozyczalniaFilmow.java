
package wypozyczalniafilmow;

import java.util.Scanner;

/**
 *
 * @author Radek
 */
public class WypozyczalniaFilmow {

    
    public static void main(String[] args) {
        
        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik("Radosław", "Kołodziejczyk");
        pracownicy[1] = new Pracownik("Anna", "Nowak");
        pracownicy[2] = new Pracownik("Jan", "Kowalski");
        
        int pracownicyIloscStartowa = 3;
        
        PracownikLista listaPracownikow = new PracownikLista();
        
        for(Pracownik pracownikOdliczaj: pracownicy)
        {
            if(pracownikOdliczaj instanceof Pracownik)
            {
                listaPracownikow.dodajPracownika(pracownikOdliczaj);
            }
            else
            {
                break;
            }
        }        
        
        Klient[] klienci = new Klient[100];
        klienci[0] = new Klient("Michał", "Adamczyk");
        klienci[1] = new Klient("Anita", "Cader");
        klienci[2] = new Klient("Kinga", "Michalska");
        klienci[3] = new Klient("Adam", "Piątek");
        klienci[4] = new Klient("Piotr", "Włodarczyk");
        
        int klienciIloscStartowa = 5;
        
        KlientLista listaKlientow = new KlientLista();
        
        for(Klient klientOdliczaj: klienci)
        {
            if(klientOdliczaj instanceof Klient)
            {
                listaKlientow.dodajKlienta(klientOdliczaj);
            }
            else
            {
                break;
            }
        }        
        
        Film[] filmy = new Film[100];
        filmy[0] = new Film("Taxi", "komedia", "Francja", 1998, 4);
        filmy[1] = new Film("American Pie", "komedia", "USA", 1999, 2);
        filmy[2] = new Film("Titanic", "dramat", "USA", 1997, 1);
        filmy[3] = new Film("Oszukać Przeznaczenie", "horror", "Kanada", 2000, 2);
        filmy[4] = new Film("Shrek", "animacja", "USA", 2001, 5);
        
        int filmyIloscStartowa = 5;
        
        FilmLista listaFilmow = new FilmLista();
        
        for(Film filmOdliczaj: filmy)
        {
            if(filmOdliczaj instanceof Film)
            {
                listaFilmow.dodajFilm(filmOdliczaj);
            }
            else
            {
                break;
            }
        }
        
        Zamowienie zamowienie = new Zamowienie();
        
        int numerWybrany = 0;
        FilmLista inwentaryzacjaWykonana = new FilmLista();
        int inwentaryzacjaSprawdz = 0;
        
        do
        {                       
            System.out.println("\n\n********** WYPOŻYCZALNIA FILMÓW **********\n");
            System.out.println("Wybierz odpowiednią opcję:");
            System.out.println("1 -  Wyświetl listę pracowników");
            System.out.println("2 -  Dodaj pracownika");
            System.out.println("3 -  Wyświetl listę klientów");
            System.out.println("4 -  Dodaj klienta");
            System.out.println("5 -  Wyświetl listę filmów");
            System.out.println("6 -  Dodaj film");
            System.out.println("7 -  Wypożycz film");
            System.out.println("8 -  Zwróć film");
            System.out.println("9 -  Kopia zapasowa bazy filmów");
            System.out.println("10 - Wyświetl kopię zapasową bazy filmów");
            System.out.println("0 -  Wyjście");
            System.out.print("\nWybrana opcja: ");
            
            Scanner odczyt = new Scanner (System.in);
            numerWybrany = odczyt.nextInt();
            
            System.out.println("");
            
            switch(numerWybrany)
            {
                case 1:
                    System.out.println(listaPracownikow.toString());
                    break;
                case 2:
                    if(pracownicyIloscStartowa < pracownicy.length)
                    {
                        System.out.print("Podaj imię pracownika: ");
                        String pracownikWprowadzImie = odczyt.next();
                        System.out.print("Podaj nazwisko pracownika: ");
                        String pracownikWprowadzNazwisko = odczyt.next();
                        pracownicy[pracownicyIloscStartowa] = new Pracownik(pracownikWprowadzImie, pracownikWprowadzNazwisko);
                        listaPracownikow.dodajPracownika(pracownicy[pracownicyIloscStartowa]);
                    }
                    else
                    {
                        System.out.println("Baza pracowników jest pełna. Brak możliwości dodania nowego pracownika.");
                    }                    
                    break;
                case 3:
                    System.out.println(listaKlientow.toString());
                    break;
                case 4:
                    if(klienciIloscStartowa < klienci.length)
                    {
                        System.out.print("Wprowadź imię klienta: ");
                        String klientWprowadzImie = odczyt.next();
                        System.out.print("Wprowadź nazwisko kleinta: ");
                        String klientWprowadzNazwisko = odczyt.next();
                        klienci[klienciIloscStartowa] = new Klient(klientWprowadzImie, klientWprowadzNazwisko);
                        listaKlientow.dodajKlienta(klienci[klienciIloscStartowa]);
                    }
                    else
                    {
                        System.out.println("Baza klientów jest pełna. Brak możliwości dodania nowego klienta.");
                    }
                    break;
                case 5:
                    System.out.println(listaFilmow.toString());
                    break;
                case 6:
                    if(filmyIloscStartowa < filmy.length)
                    {
                        System.out.println("Wprowadź nazwę filmu: ");
                        String filmWprowadzNazwa = odczyt.next();
                        System.out.println("Wprowadź gatunek: ");
                        String filmWprowadzGatunek = odczyt.next();
                        System.out.println("Wprowadź kraj produkcji: ");
                        String filmWprowadzKraj = odczyt.next();
                        System.out.println("Wprowadź rok produkcji: ");
                        int filmWprowadzRok = odczyt.nextInt();
                        System.out.println("Wprowadź ilość egzemplarzy: ");
                        int filmWprowadzIlosc = odczyt.nextInt();
                        filmy[filmyIloscStartowa] = new Film(filmWprowadzNazwa, filmWprowadzGatunek,
                                filmWprowadzKraj, filmWprowadzRok, filmWprowadzIlosc);
                        listaFilmow.dodajFilm(filmy[filmyIloscStartowa]);
                        filmyIloscStartowa++;
                    }
                    else
                    {
                        System.out.println("Baza filmów jest pełna. Brak możliwości dodania nowego filmu.");
                    }
                    break;
                case 7:
                    System.out.println("Wprowadź ID pracownika: ");
                    int idPracownikaWprowadz = odczyt.nextInt();
                    System.out.println("Wprowadź ID klienta: ");
                    int idKlientWprowadz = odczyt.nextInt();
                    System.out.println("Wprowadź ID filmu: ");
                    int idFilmuWprowadz = odczyt.nextInt();
                    zamowienie.wypozyczFilm(pracownicy[idPracownikaWprowadz - 1000],
                            klienci[idKlientWprowadz - 2000], filmy[idFilmuWprowadz - 3000]);
                    break;
                case 8:
                    System.out.println("Wprowadź ID pracownika: ");
                    int idPracownikaWprowadz2 = odczyt.nextInt();
                    System.out.println("Wprowadź ID klienta: ");
                    int idKlientaWprowadz2 = odczyt.nextInt();
                    System.out.println("Wprowadź ID filmu: ");
                    int idFilmuWprowadz2 = odczyt.nextInt();
                    zamowienie.zwrocFilm(pracownicy[idPracownikaWprowadz2 - 1000],
                            klienci[idKlientaWprowadz2 - 2000], filmy[idFilmuWprowadz2 - 3000]);
                    break;
                case 9:
                    inwentaryzacjaWykonana = listaFilmow.kopiuj();
                    System.out.println("Kopia zapasowa bazy filmów została zapisana.");
                    inwentaryzacjaSprawdz = 1;
                    break;
                case 10:
                    if(inwentaryzacjaSprawdz == 1)
                    {
                        System.out.println("Ostatnia zapisana kopia zapasowa bazy filmów:\n");
                        System.out.println(inwentaryzacjaWykonana.toString());
                    }
                    else
                    {
                        System.out.println("Brak zapisanej kopii zapasowej bazy filmów.");
                    }                    
                    break;
            }
        } while((numerWybrany > 0) && (numerWybrany < 11));

    }
    
}
