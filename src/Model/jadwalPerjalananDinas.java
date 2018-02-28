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
public class jadwalPerjalananDinas {
    public String NIP;
    public Date tanggalPerjalanan;
    public String kodeJadwal;

    public jadwalPerjalananDinas(String NIP, Date tanggalPerjalanan, String kodeJadwal) {
        this.NIP = NIP;
        this.tanggalPerjalanan = tanggalPerjalanan;
        this.kodeJadwal = kodeJadwal;
    }

    public jadwalPerjalananDinas() {
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public Date getTanggalPerjalanan() {
        return tanggalPerjalanan;
    }

    public void setTanggalPerjalanan(Date tanggalPerjalanan) {
        this.tanggalPerjalanan = tanggalPerjalanan;
    }

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }
    
}
