/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @author Dafaa
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    private final Makanan[] menu;
    private static byte id=0;
    
    public Restaurant(){
        this.menu = new Makanan[10];
        for(int i = 0; i < 10; i++){
            menu[i] = new Makanan();
        }
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.menu[id].tambahMakanan(nama, harga, stok);
        nextId();
    }
    
    public void tampilMenuMakanan(){
        for(int i = 0; i < id; i++){
            menu[i].tampilMakanan();
        }
    }
    
    public void pesanMakanan(String nama, int jumlah){
        int i = 0;
        
        while(!isFound(i, nama) && i < id){
            i++;
        }
        
        if(i < id){
            menu[i].minStok(jumlah);
        }else{
            System.out.println("Menu tidak ditemukan, pembelian gagal");
        }
        
    }
    
    private static void nextId() {
        id++;
    }
    
    private boolean isFound(int i, String nama){
        return nama.equals(menu[i].getNama_makanan());
    }
}
