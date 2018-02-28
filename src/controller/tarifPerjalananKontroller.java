/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import Model.Tarifperjalanandinas;
/**
 *
 * @author PancaSitorus
 */
public class tarifPerjalananKontroller extends AbstractTableModel{
    private List<Model.Tarifperjalanandinas> list;

    public tarifPerjalananKontroller(List<Model.Tarifperjalanandinas> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKodeTarif();
            case 1:
                return list.get(rowIndex).getTarif();
            case 2:
                return list.get(rowIndex).getUangHarian();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Tarif";
            case 1:
                return "Tarif";
            case 2:
                return "Uang Harian";
            default:
                return null;
        }
    }    
}
