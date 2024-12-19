/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    private String nama;
    private int nim;
    private String id_buku;
    private String waktu_peminjaman;
    private String pengarang;
    private int tahun_terbit;

    public Peminjaman(String nama, int nim, String id_buku, String waktu_peminjaman, String pengarang, int tahun_terbit) {
        this.nama = nama;
        this.nim = nim;
        this.id_buku = id_buku;
        this.waktu_peminjaman = waktu_peminjaman;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getWaktu_peminjaman() {
        return waktu_peminjaman;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }
    
    
    
}
