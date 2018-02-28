/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.formSPPD;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PancaSitorus
 */
public class sppdKontroller extends AbstractTableModel{
    private List<Model.formSPPD> list;

    public sppdKontroller(List<Model.formSPPD> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 9;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNomorSPPD();
            case 1:
                return list.get(rowIndex).getNIP();
            case 2:
                return list.get(rowIndex).getTanggalBerangkat();
            case 3:
                return list.get(rowIndex).getTanggalKembali();
            case 4:
                return list.get(rowIndex).getKodeWilayah();
            case 5:
                return list.get(rowIndex).getKodeTransportasi();
            case 6:
                return list.get(rowIndex).getKodeTarif();
            case 7:
                return list.get(rowIndex).getKodeKegiatan();
            case 8:
                return list.get(rowIndex).getStatus();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor SPPD";
            case 1:
                return "NIP";
            case 2:
                return "Tanggal Berangkat";
            case 3:
                return "Tanggal Kembali";
            case 4:
                return "Kode Wilayah";
            case 5:
                return "Kode Transportasi";
            case 6:
                return "Kode Tarif";
            case 7:
                return "Kode Kegiatan";
            case 8:
                return "Status";
            default:
                return null;
        }
    }    
}
