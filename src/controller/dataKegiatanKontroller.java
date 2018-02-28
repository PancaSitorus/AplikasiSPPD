/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import Model.kegiatan;
/**
 *
 * @author PancaSitorus
 */
public class dataKegiatanKontroller extends AbstractTableModel {
    private List<Model.kegiatan> list;

    public dataKegiatanKontroller(List<Model.kegiatan> list) {
        this.list = list;
    }

    public dataKegiatanKontroller() {
       //To change body of generated methods, choose Tools | Templates.
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
                return list.get(rowIndex).getKodeKegiatan();
            case 1:
                return list.get(rowIndex).getNamaKegiatan();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Kegiatan";
            case 1:
                return "Nama Kegiatan";
            default:
                return null;
        }
    }
}
