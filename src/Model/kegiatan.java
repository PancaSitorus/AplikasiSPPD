/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PancaSitorus
 */
public class kegiatan {
    public String kodeKegiatan;
    public String namaKegiatan;

    public kegiatan(String kodeKegiatan, String namaKegiatan) {
        this.kodeKegiatan = kodeKegiatan;
        this.namaKegiatan = namaKegiatan;
    }

    public kegiatan() {
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
    
    
}
