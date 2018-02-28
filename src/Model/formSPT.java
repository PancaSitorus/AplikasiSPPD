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
public class formSPT {
    private String NIP;
    private Date tanggalBerangkat;
    private Date tanggalKembali;
    private String kodeKegiatan;
    private String namaKegiatan;
    private String noSPT;
    private String tujuan;
    private String nama;
    private String keterangan;

    public formSPT() {
    }

    public formSPT(String NIP, Date tanggalBerangkat, Date tanggalKembali, String kodeKegiatan, String namaKegiatan, String noSPT, String tujuan, String nama, String keterangan) {
        this.NIP = NIP;
        this.tanggalBerangkat = tanggalBerangkat;
        this.tanggalKembali = tanggalKembali;
        this.kodeKegiatan = kodeKegiatan;
        this.namaKegiatan = namaKegiatan;
        this.noSPT = noSPT;
        this.tujuan = tujuan;
        this.nama = nama;
        this.keterangan = keterangan;
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

    public String getKodeKegiatan() {
        return kodeKegiatan;
    }

    public void setKodeKegiatan(String kodeKegiatan) {
        this.kodeKegiatan = kodeKegiatan;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getNoSPT() {
        return noSPT;
    }

    public void setNoSPT(String noSPT) {
        this.noSPT = noSPT;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
}
