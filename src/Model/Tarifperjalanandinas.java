/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Debora Sitanggang
 */
public class Tarifperjalanandinas  implements java.io.Serializable {


     private String kodeTarif;
    
     private String kodeWilayah;
     private int tarif;
     private int uangHarian;
     

    public Tarifperjalanandinas() {
    }


    public Tarifperjalanandinas(String kodeTarif, String kodeKategoriGolongan, String kodeWilayah, int tarif, int uangHarian, Set formsppds) {
       this.kodeTarif = kodeTarif;
       
       this.kodeWilayah = kodeWilayah;
       this.tarif = tarif;
       this.uangHarian = uangHarian;
       
    }
   
    public String getKodeTarif() {
        return this.kodeTarif;
    }
    
    public void setKodeTarif(String kodeTarif) {
        this.kodeTarif = kodeTarif;
    }
    
    public String getKodeWilayah() {
        return this.kodeWilayah;
    }
    
    public void setKodeWilayah(String kodeWilayah) {
        this.kodeWilayah = kodeWilayah;
    }
    public int getTarif() {
        return this.tarif;
    }
    
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    public int getUangHarian() {
        return this.uangHarian;
    }
    
    public void setUangHarian(int uangHarian) {
        this.uangHarian = uangHarian;
    }
    




}
