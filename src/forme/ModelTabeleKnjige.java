/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.awt.List;
import javax.swing.table.AbstractTableModel;
import uvod.Knjiga;

/**
 *
 * @author Kristina
 */
public class ModelTabeleKnjige extends AbstractTableModel {

    private java.util.List<Knjiga> listaKnjiga;
    private final String[] kolone={"Naslov","Autor", "ISBN","Godina izdanja"};

    public ModelTabeleKnjige(java.util.List<Knjiga> listaKnjiga) {//ili seter za lisKnjiga
        this.listaKnjiga = listaKnjiga;
    }
            
    
    @Override
    public int getRowCount() {
        return listaKnjiga.size();//broj redova liste
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//vraca u odredj celiji odr vr
        Knjiga knjiga=listaKnjiga.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return knjiga.getNaslov();
            case 1:
                return knjiga.getAutor().getImePrezime();
            case 2:
                return knjiga.getISBN();
            case 3:
                return knjiga.getGodinaIzdanja();
            default:
                throw null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column]; 
    }

    void osveziPodatke() {
        fireTableDataChanged();
    }
    
    
}
