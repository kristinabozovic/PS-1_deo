/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uvod;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author Kristina
 */
public class Autor {

    private String imePrezime;
    private String jmbg;
    private int godRodjenja;
    private String biografija;

    public Autor() {
    }

    public Autor(String imePrezime, String jmbg, int godRodjenja, String biografija) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
        this.biografija = biografija;
    }
    
    

    public String getImePrezime() {
        return imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    @Override
    public String toString() {
        return imePrezime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.imePrezime);
        hash = 79 * hash + this.godRodjenja;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.godRodjenja != other.godRodjenja) {
            return false;
        }
        return Objects.equals(this.imePrezime, other.imePrezime);
    }
    
    

    
    
}
