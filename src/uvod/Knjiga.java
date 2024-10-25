/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvod;

/**
 *
 * @author Kristina
 */
public class Knjiga {
    private String naslov;
    private Autor autor;
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public Knjiga() {
    }

    public Knjiga(String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }

    
    
    @Override
    public String toString() {
        return "Knjiga{" + "naslov=" + naslov + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + ", zanr=" + zanr + '}';
    }

    public String getNaslov() {
        return naslov;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }
    
    
}
