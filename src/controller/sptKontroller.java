/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.formSPT;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class sptKontroller extends AbstractTableModel{
    private List<Model.formSPT> list;

    public sptKontroller(List<Model.formSPT> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 8;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNoSPT();
            case 1:
                return list.get(rowIndex).getNIP();
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                return list.get(rowIndex).getTujuan();
            case 4:
                return list.get(rowIndex).getTanggalBerangkat();
            case 5:
                return list.get(rowIndex).getTanggalKembali();
            case 6:
                return list.get(rowIndex).getNamaKegiatan();
            case 7:
                return list.get(rowIndex).getKeterangan();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor SPT";
            case 1:
                return "NIP";
            case 2:
                return "Nama";
            case 3:
                return "Tujuan";
            case 4:
                return "Tanggal Berangkat";
            case 5:
                return "Tanggal Kembali";
            case 6:
                return "Nama Kegiatan";
            case 7:
                return "Keterangan";
            default:
                return null;
        }
    }
}
