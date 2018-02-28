/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.PembatalanPerjalanan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class pembatalanPerjalananKontroller extends AbstractTableModel{
    private List<Model.PembatalanPerjalanan> list;

    public pembatalanPerjalananKontroller(List<Model.PembatalanPerjalanan> list) {
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
                return list.get(rowIndex).getNomorPembatalan();
            case 1:
                return list.get(rowIndex).getNomorSPPD();
            case 2:
                return list.get(rowIndex).getKeterangan();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor Pembatalan";
            case 1:
                return "Nomor SPPD";
            case 2:
                return "Keterangan";
            default:
                return null;
        }
    }
}
