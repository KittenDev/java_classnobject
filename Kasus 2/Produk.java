/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dafaa.cafe;

/**
 *
 * @author Dafaa
 */
public class Produk {
    private final String nama_produk;
    private final double harga;
    private int qty;
    
    public Produk(String nama, double harga, int qty){
        this.nama_produk = nama;
        this.harga = harga;
        this.qty = qty;
    }
    
    public void tampilProduk(){
        System.out.printf("%-20s", this.nama_produk);
        System.out.println("Rp " + harga);
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }
    
    public void setQty(int bought) {
        this.qty -= bought;
    }
}
