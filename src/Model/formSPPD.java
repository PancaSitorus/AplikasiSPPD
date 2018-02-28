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
public class formSPPD {
    public String nomorSPPD;
    public String NIP;
    public Date tanggalBerangkat;
    public Date tanggalKembali;
    public String kodeWilayah;
    public String kodeTransportasi;
    public String kodeTarif;
    public String kodeKegiatan;
    public String status;
    public String nama;

    public formSPPD(String nomorSPPD, String NIP, Date tanggalBerangkat, Date tanggalKembali, String kodeWilayah, String kodeTransportasi, String kodeTarif, String kodeKegiatan, String status, String nama) {
        this.nomorSPPD = nomorSPPD;
        this.NIP = NIP;
        this.tanggalBerangkat = tanggalBerangkat;
        this.tanggalKembali = tanggalKembali;
        this.kodeWilayah = kodeWilayah;
        this.kodeTransportasi = kodeTransportasi;
        this.kodeTarif = kodeTarif;
        this.kodeKegiatan = kodeKegiatan;
        this.status = status;
        this.nama = nama;
    }

    public formSPPD() {
    }

    public String getNomorSPPD() {
        return nomorSPPD;
    }

    public void setNomorSPPD(String nomorSPPD) {
        this.nomorSPPD = nomorSPPD;
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

    public String getKodeWilayah() {
        return kodeWilayah;
    }

    public void setKodeWilayah(String kodeWilayah) {
        this.kodeWilayah = kodeWilayah;
    }

    public String getKodeTransportasi() {
        return kodeTransportasi;
    }

    public void setKodeTransportasi(String kodeTransportasi) {
        this.kodeTransportasi = kodeTransportasi;
    }

    public String getKodeTarif() {
        return kodeTarif;
    }

    public void setKodeTarif(String kodeTarif) {
        this.kodeTarif = kodeTarif;
    }

    public String getKodeKegiatan() {
        return kodeKegiatan;
    }

    public void setKodeKegiatan(String kodeKegiatan) {
        this.kodeKegiatan = kodeKegiatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
