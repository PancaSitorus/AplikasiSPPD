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
public class BuktiPerjalananModel {
    public String nomorBukti;
    public String nomorSPPD;
    public String deskripsi;

    public BuktiPerjalananModel(String nomorBukti, String nomorSPPD, String deskripsi) {
        this.nomorBukti = nomorBukti;
        this.nomorSPPD = nomorSPPD;
        this.deskripsi = deskripsi;
    }

    public BuktiPerjalananModel() {
    }

    public String getNomorBukti() {
        return nomorBukti;
    }

    public void setNomorBukti(String nomorBukti) {
        this.nomorBukti = nomorBukti;
    }

    public String getNomorSPPD() {
        return nomorSPPD;
    }

    public void setNomorSPPD(String nomorSPPD) {
        this.nomorSPPD = nomorSPPD;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    
    
}
