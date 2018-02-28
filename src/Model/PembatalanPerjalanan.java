/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Debora Sitanggang
 */
public class PembatalanPerjalanan {
    String nomorPembatalan;
    String nomorSPPD;
    String keterangan;
    public PembatalanPerjalanan (){
        
    }

    public PembatalanPerjalanan(String nomorPembatalan, String nomorSPPD, String keterangan) {
        this.nomorPembatalan = nomorPembatalan;
        this.nomorSPPD = nomorSPPD;
        this.keterangan = keterangan;
    }

    public String getNomorPembatalan() {
        return nomorPembatalan;
    }

    public String getNomorSPPD() {
        return nomorSPPD;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setNomorPembatalan(String nomorPembatalan) {
        this.nomorPembatalan = nomorPembatalan;
    }

    public void setNomorSPPD(String nomorSPPD) {
        this.nomorSPPD = nomorSPPD;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
}
