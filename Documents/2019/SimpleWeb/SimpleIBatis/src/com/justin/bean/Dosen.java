/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justin.bean;

/**
 *
 * @author jasmanpardede
 */
public class Dosen {
    private String nid;
    private String nama;
    private String alamat;
    private String keahlian;

    public Dosen() {
    }

    public Dosen(String nid, String nama, String keahlian) {
        this.nid = nid;
        this.nama = nama;
        this.alamat = "Bandung no.1";
        this.keahlian = keahlian;
    }
    public Dosen(String nid, String nama, String alamat, String keahlian) {
        this.nid = nid;
        this.nama = nama;
        this.alamat = alamat;
        this.keahlian = keahlian;
    }

    
    public String getNid() {
        return nid;
    }

    public void setNid(String nip) {
        this.nid = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nid=" + nid + ", nama=" + nama + ", alamat=" + alamat + ", keahlian=" + keahlian + '}';
    }
    
    
    
}
