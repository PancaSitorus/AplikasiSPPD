/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import Model.kantor;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class dataKantorKontroller extends AbstractTableModel{
    private List<Model.kantor> list;

    public dataKantorKontroller(List<Model.kantor> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 7;
    }
@Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNomor();
            case 1:
                return list.get(rowIndex).getNamaKantor();
            case 2:
                return list.get(rowIndex).getNamaKantor();
            case 3:
                return list.get(rowIndex).getTelepon();
            case 4:
                return list.get(rowIndex).getFax();
            case 5:
                return list.get(rowIndex).getEmail();
            case 6:
                return list.get(rowIndex).getWebsite();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor Bukti";
            case 1:
                return "Nomor SPPD";
            case 2:
                return "Deskripsi";
            default:
                return null;
        }
    }
}
