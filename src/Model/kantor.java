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
public class kantor {
    public int nomor;
    public String namaKantor;
    public String alamat;
    public String telepon;
    public String fax;
    public String email;
    public String website;

    public kantor(int nomor, String namaKantor, String alamat, String telepon, String fax, String email, String website) {
        this.nomor = nomor;
        this.namaKantor = namaKantor;
        this.alamat = alamat;
        this.telepon = telepon;
        this.fax = fax;
        this.email = email;
        this.website = website;
    }

    public kantor() {
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNamaKantor() {
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
}
