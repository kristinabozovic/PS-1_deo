/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.List;
import java.util.ArrayList;
import uvod.Autor;
import uvod.Knjiga;
import uvod.Zanr;

/**
 *
 * @author Kristina
 */
public class Controller { //1 instanca kontrolera pa se izmene prave na kopiji
    private java.util.List<Knjiga> listaKnjiga;
    private java.util.List<Autor> listaAutora;

    private static Controller instance;
    public static  Controller getInstance(){//na taj nacin postoji uveek samo 1 objekat klase Controller
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }

    public java.util.List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(java.util.List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public java.util.List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(java.util.List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }
    
    private Controller() {
        Autor autor1=new Autor("Ivo Andric", "123", 1892, "Biografija Ive Andrica");
        Autor autor2=new Autor("Danilo Kis", "123", 1892, "Biografija Danila Kisa");
        Autor autor3=new Autor("Mesa Selimovic", " 123", 1910, "Biografija Mese Selimovica");
        
        Knjiga knjiga1=new Knjiga("Na drini cuprija", autor1, "123456", 1945,Zanr.DEKTEKTIVSKI);
        Knjiga knjiga2=new Knjiga("Basta, pepeo", autor2, "123456", 1982,Zanr.ISTORIJSKI);
        Knjiga knjiga3=new Knjiga("Tvrdjava", autor3, "123456", 19701, Zanr.POEZIJA);
        
        listaKnjiga=new ArrayList<>(); //inace javljaa null pointer
        listaAutora=new ArrayList<>();
        
        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);
        listaKnjiga.add(knjiga3);
        
        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);
    }

    public void obrisiKnjigu(int selekRed) {
        listaKnjiga.remove(selekRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        listaKnjiga.add(novaKnjiga);
//        System.out.println("Knjiga je dodata");
//        System.out.println(listaKnjiga);
    }
    
    
    
    
}
