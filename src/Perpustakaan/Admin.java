/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Admin {
    private String id_petugas;
    private int password;

    public Admin(String id_petugas, int password) {
        this.id_petugas = id_petugas;
        this.password = password;
    }

    public String getId_petugas() {
        return id_petugas;
    }

    public int getPassword() {
        return password;
    }

    public void setId_petugas(String id_petugas) {
        this.id_petugas = id_petugas;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
}

