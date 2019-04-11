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
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private int umur;

    public Mahasiswa(String nim, String nama, String alamat, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
