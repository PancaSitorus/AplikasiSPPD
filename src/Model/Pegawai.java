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
public class Pegawai  implements java.io.Serializable {


     private String nip;
     private String nama;
     private String golongan;
     private String jabatan;
    

    public Pegawai() {
    }

	
    public Pegawai(String nip, String nama, String golongan, String jabatan) {
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
        this.jabatan = jabatan;
    }
    public Pegawai(String nip, String nama, String golongan, String jabatan, Set formsppds, Set jadwalperjalanandinases, Set logins, Set laporanperjalanans, Set formspts) {
       this.nip = nip;
       this.nama = nama;
       this.golongan = golongan;
       this.jabatan = jabatan;
       
    }
   
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getGolongan() {
        return this.golongan;
    }
    
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    public String getJabatan() {
        return this.jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
   
    
   




}