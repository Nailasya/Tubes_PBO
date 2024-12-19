/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Buku {
    private String id_buku;
    private int judul_buku;
    private String penggarang;
    private int tahun_terbit;

    public Buku(String id_buku, int judul_buku, String penggarang, int tahun_terbit) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.penggarang = penggarang;
        this.tahun_terbit = tahun_terbit;
    }

    public String getId_buku() {
        return id_buku;
    }

    public int getJudul_buku() {
        return judul_buku;
    }

    public String getPenggarang() {
        return penggarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public void setJudul_buku(int judul_buku) {
        this.judul_buku = judul_buku;
    }

    public void setPenggarang(String penggarang) {
        this.penggarang = penggarang;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
    
}
