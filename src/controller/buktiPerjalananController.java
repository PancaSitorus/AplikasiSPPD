/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.BuktiPerjalananModel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class buktiPerjalananController extends AbstractTableModel {
    private List<Model.BuktiPerjalananModel> list;

    public buktiPerjalananController(List<Model.BuktiPerjalananModel> list) {
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
                return list.get(rowIndex).getNomorBukti();
            case 1:
                return list.get(rowIndex).getNomorSPPD();
            case 2:
                return list.get(rowIndex).getDeskripsi();
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
