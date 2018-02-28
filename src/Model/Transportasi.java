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
public class Transportasi  implements java.io.Serializable {


     private String kodeTransportasi;
     private String namaTransportasi;
     

    public Transportasi() {
    }

	
    public Transportasi(String kodeTransportasi, String namaTransportasi) {
        this.kodeTransportasi = kodeTransportasi;
        this.namaTransportasi = namaTransportasi;
    }
  
   
    public String getKodeTransportasi() {
        return this.kodeTransportasi;
    }
    
    public void setKodeTransportasi(String kodeTransportasi) {
        this.kodeTransportasi = kodeTransportasi;
    }
    public String getNamaTransportasi() {
        return this.namaTransportasi;
    }
    
    public void setNamaTransportasi(String namaTransportasi) {
        this.namaTransportasi = namaTransportasi;
    }
   



}
