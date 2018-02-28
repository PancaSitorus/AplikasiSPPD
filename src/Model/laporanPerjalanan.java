/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author PancaSitorus
 */
public class laporanPerjalanan {
    public String nama;
    public String NIP;
    public Date tanggalBerangkat;
    public Date tanggalKembali;
    public String hasil;
    public String nomorLaporan;

    public laporanPerjalanan(String nama, String NIP, Date tanggalBerangkat, Date tanggalKembali, String hasil, String nomorLaporan) {
        this.nama = nama;
        this.NIP = NIP;
        this.tanggalBerangkat = tanggalBerangkat;
        this.tanggalKembali = tanggalKembali;
        this.hasil = hasil;
        this.nomorLaporan = nomorLaporan;
    }

    public laporanPerjalanan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public Date getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(Date tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getNomorLaporan() {
        return nomorLaporan;
    }

    public void setNomorLaporan(String nomorLaporan) {
        this.nomorLaporan = nomorLaporan;
    }
    
    
}
