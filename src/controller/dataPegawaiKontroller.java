/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.Pegawai;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class dataPegawaiKontroller extends AbstractTableModel {
       private List<Model.Pegawai> list;

    public dataPegawaiKontroller(List<Model.Pegawai> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNip();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getGolongan();
            case 3:
                return list.get(rowIndex).getJabatan();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP";
            case 1:
                return "Nama";
            case 2:
                return "Golongan";
            case 4:
                return "Jabatan";
            default:
                return null;
        }
    }
}
