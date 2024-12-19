/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Pengembalian {
    private String nama_anggota;
    private int nim_anggota;
    private String Judul_buku;
    private String id_buku;
    private String pengarang;
    private int tahun_terbit;

    public Pengembalian(String nama_anggota, int nim_anggota, String Judul_buku, String id_buku, String pengarang, int tahun_terbit) {
        this.nama_anggota = nama_anggota;
        this.nim_anggota = nim_anggota;
        this.Judul_buku = Judul_buku;
        this.id_buku = id_buku;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }

    public String getNama_anggota() {
        return nama_anggota;
    }

    public int getNim_anggota() {
        return nim_anggota;
    }

    public String getJudul_buku() {
        return Judul_buku;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    public void setNim_anggota(int nim_anggota) {
        this.nim_anggota = nim_anggota;
    }

    public void setJudul_buku(String Judul_buku) {
        this.Judul_buku = Judul_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

}
