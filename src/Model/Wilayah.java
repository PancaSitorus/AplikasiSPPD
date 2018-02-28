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
public class Wilayah  implements java.io.Serializable {


     private String kodeWilayah;
     private String namaWilayah;

    public Wilayah() {
    }

    public Wilayah(String kodeWilayah, String namaWilayah) {
       this.kodeWilayah = kodeWilayah;
       this.namaWilayah = namaWilayah;
    }
   
    public String getKodeWilayah() {
        return this.kodeWilayah;
    }
    
    public void setKodeWilayah(String kodeWilayah) {
        this.kodeWilayah = kodeWilayah;
    }
    public String getNamaWilayah() {
        return this.namaWilayah;
    }
    
    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }




}

