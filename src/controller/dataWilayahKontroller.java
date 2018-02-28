/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.Wilayah;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class dataWilayahKontroller extends AbstractTableModel {
    private List<Model.Wilayah> list;

    public dataWilayahKontroller(List<Model.Wilayah> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKodeWilayah();
            case 1:
                return list.get(rowIndex).getNamaWilayah();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Wilayah";
            case 1:
                return "Nama Wilayah";
            default:
                return null;
        }
    }    
}
