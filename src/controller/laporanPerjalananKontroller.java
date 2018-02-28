/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.laporanPerjalanan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PancaSitorus
 */
public class laporanPerjalananKontroller extends AbstractTableModel{
    private List<Model.laporanPerjalanan> list;

    public laporanPerjalananKontroller(List<Model.laporanPerjalanan> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNomorLaporan();
            case 1:
                return list.get(rowIndex).getNIP();
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                return list.get(rowIndex).getTanggalBerangkat();
            case 4:
                return list.get(rowIndex).getTanggalKembali();
            case 5:
                return list.get(rowIndex).getHasil();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor Laporan";
            case 1:
                return "NIP";
            case 2:
                return "Nama";
            case 3:
                return "Tanggal Berangkat";
            case 4:
                return "Tanggal Kembali";
            case 5:
                return "Hasil";
            default:
                return null;
        }
    }
}
