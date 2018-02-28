/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.Transportasi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class dataTransportasiKontroller extends AbstractTableModel{
    private List<Model.Transportasi> list;

    public dataTransportasiKontroller(List<Model.Transportasi> list) {
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
                return list.get(rowIndex).getKodeTransportasi();
            case 1:
                return list.get(rowIndex).getNamaTransportasi();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Transportasi";
            case 1:
                return "Nama Transportasi";
            default:
                return null;
        }
    }
}
