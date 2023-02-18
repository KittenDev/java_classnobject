/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dafaa.cafe;

/**
 *
 * @author Dafaa
 */
public class Penjualan {
    private String[] nama_produk;
    private int[] quantity;
    private double harga_total;
    private static byte id=0;
    
    public Penjualan(){
        this.nama_produk = new String[10];
        this.quantity = new int[10];
        this.harga_total = 0;
    }
    
    public void beliProduk(Produk pesanan, int qty){
            this.nama_produk[id] = pesanan.getNama_produk();
            this.quantity[id] = qty;
            this.harga_total += pesanan.getHarga() * qty;
            nextId();
    }
    
    public void tampilPesanan(){
        System.out.println("============================================");
        System.out.printf("%-20s", "Nama Produk");
        System.out.println("Quantity");
        System.out.println("============================================");
        for(int i = 0; i < id; i++){
            System.out.print((i + 1) + ". ");
            System.out.printf("%-20s", this.nama_produk[i]);
            System.out.println(this.quantity[i]);
        }
        System.out.println("============================================");
        System.out.printf("%-20s", "Harga total:");
        System.out.println("Rp " + this.harga_total);
        System.out.println("============================================");
    }
    
    private static void nextId() {
        id++;
    }
}
